/*
 * @(#)CommandPattern.java    1.0.0 2018年7月17日 上午11:09:34
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
package com.hy.action.command;

import com.hy.bean.Invoker;
import com.hy.bean.Receiver;
import com.hy.bean.impl.LineCommand;
import com.hy.bean.ins.ICommand;

/**
 * 命令模式
 * 应用场景：
 * 通过将一组行为抽象为对象，达到行为请求者与行为执行者解耦
 * 
 * @version 1.0.0 2018年7月17日 上午11:09:34
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class CommandPattern {

	public static void main(String[] args) {
		Receiver recevier = new Receiver();
		ICommand command = new LineCommand(recevier);
		Invoker invoker = new Invoker(command);
		
		invoker.action();
	}
}
