/*
 * @(#)ObserverPattern.java    1.0.0 2018年7月12日 下午6:04:15
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
package com.hy.action.observer;

import com.hy.bean.impl.AnchorChen;
import com.hy.bean.impl.AnchorMei;
import com.hy.bean.impl.FansLi;
import com.hy.bean.impl.FansZhang;
import com.hy.bean.ins.IObserver;
import com.hy.bean.ins.ISubject;

/**
 * 观察者模式
 * 应用场景：
 * 当一个对象变化时，其他依赖该对象的对象都会收到通知，并随之变化.
 * 对象之间关系：1...n(被观察者...观察者)
 * 
 * 注：
 * 桥接n...n
 * 
 * @version 1.0.0 2018年7月12日 下午6:04:15
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class ObserverPattern {

	public static void main(String[] args) {
		ISubject anchorMei = new AnchorMei();
		ISubject anchorChen = new AnchorChen();
		IObserver fansLi = new FansLi();
		IObserver fansZhang = new FansZhang();
		
		anchorMei.addFans(fansLi);
		anchorMei.addFans(fansZhang);
		anchorChen.addFans(fansLi);
		
		anchorMei.notifyAll("欢迎您收听");
		anchorChen.notifyAll("这里是午夜直播间");
	}

}
