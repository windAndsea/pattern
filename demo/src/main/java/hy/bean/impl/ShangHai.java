/*
 * @(#)ShangHai.java    1.0.0 2018年6月26日 上午10:10:08
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
 * ShangHai.
 * 
 * @version 1.0.0 2018年6月26日 上午10:10:08
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class ShangHai implements Destination {

	private static ShangHai shangHai = null;
	
	static {
		if (shangHai == null) {
			shangHai = new ShangHai();
			Airport.registerDestination(shangHai);
			System.out.println("shanghai");
		}
	}
	
	private ShangHai() {
		
	}
	
	public void arrival(String str) {
		System.out.println(str+"：抵达上海");
	}

	public void print() {
		System.out.println("print:shanghai");
	}
}
