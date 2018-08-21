/*
 * @(#)BankCounter.java    1.0.0 2018年7月19日 下午3:33:47
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
package com.hy.bean;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

import com.hy.bean.impl.DrawBankService;
import com.hy.bean.impl.SaveBankService;
import com.hy.bean.ins.IBankService;
import com.hy.bean.ins.ICustomer;

/**
 * 银行柜台
 * 
 * @version 1.0.0 2018年7月19日 下午3:33:47
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class BankCounter {

	public static final String SAVE = "SAVE";
	
	public static final String DRAW = "DRAW";
	
	// 排队顾客
	Queue<ICustomer> customers = new ConcurrentLinkedQueue<ICustomer>();
	
	// 顾客对应的业务
	Map<ICustomer, String[]> opts = new ConcurrentHashMap<ICustomer, String[]>();
	
	// 柜台支持服务
	static Map<String, IBankService> services = new ConcurrentHashMap<String, IBankService>();
	
	static {
		services.put(SAVE, new SaveBankService());
		services.put(DRAW, new DrawBankService());
		System.out.println("该柜台仅支持存取款业务");
	}
	
	public void addCustomer(ICustomer customer, String[] serviceName) {
		customers.offer(customer);
		opts.put(customer, serviceName);
	}
	
	public void handler() {
		while(true) {
			if (customers.isEmpty()) {
				break;
			}
			ICustomer customer = customers.poll();
			for (String service : opts.get(customer)) {
				services.get(service).service(customer);
			}
		}
	}
}
