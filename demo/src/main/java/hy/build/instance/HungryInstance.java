/*
 * @(#)HungryInstance.java    1.0.0 2018年6月21日 下午3:40:48
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
 * 单例模式-饿汉式
 * 优点：线程安全
 * 缺点：因为在类加载时，实例对象就被创建完毕，若该实例一直未使用，则造成资源浪费
 * 
 * @version 1.0.0 2018年6月21日 下午3:40:48
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class HungryInstance {

	private static HungryInstance instance = new HungryInstance();
	
	private HungryInstance() {
	}
	
	public static HungryInstance getInstance() {
		return instance;
	}
}
