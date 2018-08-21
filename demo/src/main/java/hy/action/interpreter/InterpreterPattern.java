/*
 * @(#)InterpreterPattern.java    1.0.0 2018年7月19日 下午4:33:22
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
package com.hy.action.interpreter;

import com.hy.bean.Context;
import com.hy.bean.impl.PlusExpression;

/**
 * 解释器模式
 * 应用场景：
 * 1，可以将一个需要解释执行的语言中的句子表示为一个抽象语法树；
 * 2，一些重复出现的问题可以用一种简单的语言来进行表达；
 * 3，一个简单语法需要解释的场景。
 * 
 * @version 1.0.0 2018年7月19日 下午4:33:22
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class InterpreterPattern {

	public static void main(String[] args) {
		// 1+1+3
		Context context = new Context(1, 1);
		int result = new PlusExpression().interpret(new Context(new PlusExpression().interpret(context), 3));
		System.out.println("expression:1+1+3，result:"+result);
	}
}
