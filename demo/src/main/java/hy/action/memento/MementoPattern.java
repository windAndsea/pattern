/*
 * @(#)MementoPattern.java    1.0.0 2018年7月18日 上午9:52:18
 *
 * Copyright (c) 2007-2016 Shanghai Handpay IT, Co., Ltd. 
 * 4/F, 763 MengZi Road. W., Shanghai, China 
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of 
 * Shanghai Handpay IT Co., Ltd. ("Confidential Information").  
 * You shall not disclose such Confidential Information and shall use 
 * it only in accordance with the terms of the license agreement you 
 * entered into with Handpay.
 */
package com.hy.action.memento;

import com.hy.bean.GameStore;
import com.hy.bean.Hero;
import com.hy.bean.Memento;

/**
 * 备忘录模式
 * 应用场景：
 * 适用于对象在执行某些操作，为防止意外而在执行操作前将对象状态备份的场景
 * 
 * @version 1.0.0 2018年7月18日 上午9:52:18
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class MementoPattern {

	public static void main(String[] args) {
		Hero hero = new Hero(10, 100, "中级武士装");
		Memento memento = hero.createMemento();
		GameStore store = new GameStore(memento);	// 可以是file / DB
		
		System.out.println("【英雄初始状态】"+hero);
		System.out.println("--------------------------------------------------------------------");
		hero.setLevel(20);
		hero.setEnerge(200);
		hero.setEquip("高级武士装");
		
		System.out.println("【英雄当前状态】"+hero);
		System.out.println("--------------------------------------------------------------------");
		
		hero.restoreMemento(store.getMemento());
		System.out.println("【还原英雄状态】"+hero);
	}
}
