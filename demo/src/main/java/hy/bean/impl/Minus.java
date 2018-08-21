/*
 * @(#)Minus.java    1.0.0 2018年7月12日 下午4:21:18
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

import com.hy.bean.abs.AbsCaculator;

/**
 * -
 * 
 * @version 1.0.0 2018年7月12日 下午4:21:18
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class Minus<T extends Number> extends AbsCaculator<T> {

	public Number calculate(T num1, T num2) {
		Number result = num1.doubleValue()-num2.doubleValue();
		super.printResult(result);
		return result;
	}

	@Override
	public Double deal(Double num1, Double num2) {
		return num1-num2;
	}

}
