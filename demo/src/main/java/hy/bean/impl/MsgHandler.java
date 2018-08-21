/*
 * @(#)MsgHandler.java    1.0.0 2018年7月17日 上午10:39:15
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

import com.hy.bean.abs.AbsHandler;
import com.hy.bean.ins.IHandler;

/**
 * MsgHandler.
 * 
 * @version 1.0.0 2018年7月17日 上午10:39:15
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class MsgHandler extends AbsHandler implements IHandler {

	private String name;
	
	public MsgHandler(String name) {
		super();
		this.name = name;
	}

	public void deal() {
		System.out.println(name+",deal！");
		if (getHandler() != null) {
			getHandler().deal();
		}
	}
	
}
