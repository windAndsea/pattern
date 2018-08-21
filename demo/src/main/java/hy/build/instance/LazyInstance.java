/*
 * @(#)LazyInstance.java    1.0.0 2018年6月21日 下午3:44:54
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
 * 单例模式-懒汉式
 * 
 * 
 * @version 1.0.0 2018年6月21日 下午3:44:54
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class LazyInstance {
	
	/**
	 * 延迟加载，当需要使用时，再创建实例对象
	 */
	private static LazyInstance instance = null;

	private LazyInstance() {
		
	}
	
	/**
	 * 
	 * 若去掉synchronized关键字，则线程不安全
	 * 由于使用synchronized 修饰getInstance()方法，则每次调用该方法时，都对对象资源加锁，
	 * 锁资源浪费
	 *
	 * @return
	 */
	public static synchronized LazyInstance getInstance() {
		if (instance == null) {
			instance = new LazyInstance();
		}
		
		return instance;
	}
}
