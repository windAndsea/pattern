/*
 * @(#)DclInstance.java    1.0.0 2018年6月21日 下午3:52:15
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
 * 单例模式-双重锁机制.
 * 问题：
 * 1，JDK < 1.5 失效
 * 2，由于JAVA内存模型，可能造成错误
 * 
 * @version 1.0.0 2018年6月21日 下午3:52:15
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class DclInstance {

	private volatile static DclInstance instance = null;
	
	private DclInstance() {
		
	}
	
	public static DclInstance getInstance() {
		if (instance == null) {
			synchronized (DclInstance.class) {
				if (instance == null) {
					instance = new DclInstance();
				}
			}
		}
		return instance;
	}
}
