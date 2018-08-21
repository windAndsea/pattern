/*
 * @(#)InnerInstance.java    1.0.0 2018年6月21日 下午4:09:37
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
 * 单例模式-静态内部类
 * 
 * @version 1.0.0 2018年6月21日 下午4:09:37
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class InnerInstance {

	private static class Helper{
		private static final InnerInstance instance = new InnerInstance();
	}
	
	private InnerInstance() {
		
	}
	
	public static InnerInstance getInstance() {
		return Helper.instance;
	}
}
