/*
 * @(#)VisitorPattern.java    1.0.0 2018年7月19日 下午2:09:16
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
package com.hy.action.visitor;

import com.hy.bean.BankCounter;
import com.hy.bean.impl.NormalCustomer;
import com.hy.bean.impl.VipCustomer;
import com.hy.bean.ins.ICustomer;

/**
 * 访问者模式
 * 应用场景：
 * 1，对象结构中对象对应的类很少改变，但需要在此结构上定义新的操作；
 * 2，需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而需要
 *      避免让这些操作“污染”这些对象的类，也不希望在增加新操作时修改这些类。
 * 
 * @version 1.0.0 2018年7月19日 下午2:09:16
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class VisitorPattern {

	public static void main(String[] args) {
		BankCounter bankCounter = new BankCounter();
		ICustomer normal = new NormalCustomer();
		String[] normalService = new String[]{BankCounter.SAVE};
		ICustomer vip = new VipCustomer();
		String[] vipService = new String[]{BankCounter.DRAW};
		
		bankCounter.addCustomer(normal, normalService);
		bankCounter.addCustomer(vip, vipService);
		
		bankCounter.handler();
	}
}
