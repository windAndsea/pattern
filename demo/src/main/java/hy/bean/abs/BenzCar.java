/*
 * @(#)BenzCar.java    1.0.0 2018年6月20日 下午4:28:41
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
package com.hy.bean.abs;

/**
 * BenzCar 产品树.
 * 
 * @version 1.0.0 2018年6月20日 下午4:28:41
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public abstract class BenzCar {

	private String name;

	public abstract void drive();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
