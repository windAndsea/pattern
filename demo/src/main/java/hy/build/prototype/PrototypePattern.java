/*
 * @(#)PrototypePattern.java    1.0.0 2018年6月22日 上午11:35:25
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
package com.hy.build.prototype;

/**
 * 原型模式（浅拷贝）.
 * 浅拷贝：将对象复制后，基本数据类型的变量会重新创建，而引用类型，指向的还是原对象所指向的
 * 深拷贝：将对象复制后，无论是基本数据类型还是引用类型，都是重新创建的。
 * 
 * @version 1.0.0 2018年6月22日 上午11:35:25
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class PrototypePattern implements Cloneable {

	public Object clone() throws CloneNotSupportedException {
		PrototypePattern proto = (PrototypePattern) super.clone();
		return proto;
	}
}
