/*
 * @(#)Beijing.java    1.0.0 2018年6月26日 上午10:01:49
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
package com.hy.bean.impl;

import com.hy.bean.Airport;
import com.hy.bean.ins.Destination;

/**
 * Beijing.
 * 
 * @version 1.0.0 2018年6月26日 上午10:01:49
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class Beijing implements Destination {

	private static Beijing beijing = null;
	
	static{
		if (beijing == null) {
			beijing = new Beijing();
			Airport.registerDestination(beijing);
			System.out.println("beijing");
		}
	}
	
	private Beijing() {
		
	}
	
	public void arrival(String str) {
		System.out.println(str+"：抵达北京");
	}

	public void print() {
		System.out.println("print:beijing");
	}

}
