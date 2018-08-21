/*
 * @(#)StrategyPattern.java    1.0.0 2018年6月26日 下午4:26:03
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
package com.hy.action.strategy;

import com.hy.bean.impl.Minus;
import com.hy.bean.ins.ICalculator;

/**
 * 策略模式.
 * 应用场景：
 * 系统提供不同的算法，用户决定使用哪种算法。
 * 
 * 开发案例：
 * 根据不同的交易类型，分别进行不同交易处理。
 * 1，处理类继承公共接口，或者实现公共处理类；
 * 2，针对交易类型对应的处理类进行spring map集合映射，格式key: 交易类型，value：具体处理bean id。
 * 
 * @version 1.0.0 2018年6月26日 下午4:26:03
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class StrategyPattern {

	public static void main(String[] args) {
		ICalculator<Integer> calculator = new Minus<Integer>();
		Integer result = calculator.calculate(10, 9).intValue();
		System.out.println("数值转换："+result);
	}
}
