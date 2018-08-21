/*
 * @(#)PlusExpression.java    1.0.0 2018年7月19日 下午4:57:36
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

import com.hy.bean.Context;
import com.hy.bean.ins.Expression;

/**
 * PlusExpression
 * 
 * @version 1.0.0 2018年7月19日 下午4:57:36
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class PlusExpression implements Expression {

	public int interpret(Context context) {
		return context.getNum1()+context.getNum2();
	}

}
