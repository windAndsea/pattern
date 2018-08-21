/*
 * @(#)ICalculator.java    1.0.0 2018年7月12日 下午3:59:38
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
package com.hy.bean.ins;

/**
 * ICalculator.
 * 
 * @version 1.0.0 2018年7月12日 下午3:59:38
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public interface ICalculator<T extends Object> {

	/**
	 * 
	 * 计算
	 *
	 * @param num1
	 * @param num2
	 * @param clazz
	 * @return
	 */
	public Number calculate(T num1, T num2);
}
