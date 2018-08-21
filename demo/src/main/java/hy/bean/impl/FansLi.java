/*
 * @(#)FansLi.java    1.0.0 2018年7月16日 下午2:12:02
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

import com.hy.bean.ins.IObserver;

/**
 * 粉丝小李.
 * 
 * @version 1.0.0 2018年7月16日 下午2:12:02
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class FansLi implements IObserver {

	private static final String NAME = "小李";
	
	public void accept(String name, String msg) {
		System.out.println("hi,"+NAME+","+name+msg);
	}

}
