/*
 * @(#)AbsCuculator.java    1.0.0 2018年7月12日 下午4:00:06
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

import com.hy.bean.ins.ICalculator;

/**
 * AbsCuculator.
 * 
 * @version 1.0.0 2018年7月12日 下午4:00:06
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public abstract class AbsCaculator<T extends Number> implements ICalculator<T> {

	/**
	 * 
	 * 结果打印
	 *
	 * @param result
	 */
	public void printResult(Object result) {
		System.out.println("结果："+result);
	}
	
	/**
	 * 
	 * 【模板方法模式】
	 * 处理方法
	 *
	 * @param exp
	 * @param opt
	 */
	public void process(String exp, String opt) {
		Double[] nums = this.split(exp, opt);
		Double result = this.deal(nums[0], nums[1]);
		this.printResult(result);
	}
	
	public Double[] split(String exp, String opt) {
		String[] array = exp.split(opt);
		Double[] doubleArr = new Double[2];
		doubleArr[0] = Double.valueOf(array[0]);
		doubleArr[1] = Double.valueOf(array[1]);
		return doubleArr;
	}
	
	public abstract Double deal(Double num1, Double num2);
}
