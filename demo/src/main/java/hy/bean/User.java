/*
 * @(#)User.java    1.0.0 2018年7月19日 下午4:27:14
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
package com.hy.bean;

/**
 * User
 * 
 * @version 1.0.0 2018年7月19日 下午4:27:14
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class User {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(String name) {
		super();
		this.name = name;
	}
	
	public void sendMsg(String msg) {
		ChatRoom.showMsg(this, msg);
	}
}
