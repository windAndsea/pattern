/*
 * @(#)Invoker.java    1.0.0 2018年7月17日 下午1:29:31
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

import com.hy.bean.ins.ICommand;

/**
 * Invoker
 * 
 * @version 1.0.0 2018年7月17日 下午1:29:31
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class Invoker {

	private ICommand command;

	public Invoker(ICommand command) {
		super();
		this.command = command;
	}
	
	public void action() {
		command.exe();
	}
}
