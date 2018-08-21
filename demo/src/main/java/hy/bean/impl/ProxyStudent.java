/*
 * @(#)ProxyStudent.java    1.0.0 2018年6月23日 下午8:12:45
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
 * ProxyStudent
 * 
 * @version 1.0.0 2018年6月23日 下午8:12:45
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class ProxyStudent implements IStudent {

	private IStudent student;
	
	public ProxyStudent() {
		super();
		student = new Student();
	}

	public void appearance() {
		System.out.println("黑发");
		student.appearance();
		System.out.println("腹黑");
	}

}
