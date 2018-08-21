/*
 * @(#)JustLamp.java    1.0.0 2018年6月22日 下午4:04:08
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

import com.hy.bean.abs.AbsMusicLamp;

/**
 * JustLamp.
 * 
 * @version 1.0.0 2018年6月22日 下午4:04:08
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class JustLamp extends AbsMusicLamp {

	@Override
	public boolean light(boolean change) {
		if (change) {
			System.out.println("开");
		} else {
			System.out.println("关");
		}
		return change;
	}
}
