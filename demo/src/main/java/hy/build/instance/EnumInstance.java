/*
 * @(#)EnumInstance.java    1.0.0 2018年6月21日 下午4:32:39
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
package com.hy.build.instance;

/**
 * 单例模式-枚举.
 * 
 * @version 1.0.0 2018年6月21日 下午4:32:39
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public enum EnumInstance {

	INSTANCE;
	
	private String msg;
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public static void main(String[] args) {
		EnumInstance instance = INSTANCE;
		instance.setMsg("test");
		System.out.println("测试："+instance.getMsg() + ", hashcode: " + instance.hashCode());
		
		EnumInstance instance1 = INSTANCE;
		System.out.println("测试1："+instance1.getMsg() + ", hashcode: " + instance.hashCode());
	}
}
