/*
 * @(#)LineCommand.java    1.0.0 2018年7月17日 下午1:31:47
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

import com.hy.bean.Receiver;
import com.hy.bean.ins.ICommand;

/**
 * LineCommand
 * 
 * @version 1.0.0 2018年7月17日 下午1:31:47
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class LineCommand implements ICommand {

	private Receiver recevier;
	
	public LineCommand(Receiver recevier) {
		super();
		this.recevier = recevier;
	}

	public void exe() {
		recevier.action();
	}

}
