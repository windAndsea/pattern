/*
 * @(#)MediatorPattern.java    1.0.0 2018年7月19日 下午4:12:08
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
package com.hy.action.mediator;

import com.hy.bean.User;

/**
 * 中介者模式
 * 应用场景：
 * 1，系统中的对象之间存在比较复杂的引用关系，导致它们之间的依赖关系结构混乱而难以复用该对象；
 * 2，想通过一个中间类来封装多个类中的行为，而又不想生成太多的子类
 * 
 * @version 1.0.0 2018年7月19日 下午4:12:08
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class MediatorPattern {

	public static void main(String[] args) {
		User john = new User("john");
		User rose = new User("rose");
		john.sendMsg("nice to meet you!");
		rose.sendMsg("nice to meet you too!");
	}
}
