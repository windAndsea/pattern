/*
 * @(#)Decorator.java    1.0.0 2018年6月23日 下午7:49:20
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

import com.hy.bean.ins.IStudent;

/**
 * Decorator
 * 
 * @version 1.0.0 2018年6月23日 下午7:49:20
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class Decorator implements IStudent {

	private IStudent student;
	
	public Decorator(IStudent student) {
		super();
		this.student = student;
	}

	public void appearance() {
		System.out.println("黑发");
		student.appearance();
		System.out.println("腹黑");
	}

}
