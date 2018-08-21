/*
 * @(#)ProxyPattern.java    1.0.0 2018年6月23日 下午8:11:57
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
package com.hy.cons.proxy;

import com.hy.bean.impl.ProxyStudent;
import com.hy.bean.ins.IStudent;

/**
 * 代理模式
 * 应用场景：
 * 如果已有方法在使用时，需要对原有的方法进行改进，此时有两种解决方案：
 * 1，修改原有的方法来适应新需求。但是这样做违反了“对扩展开发，对修改关闭”的原则；
 * 2，采用一个代理类来调用原有方法，对产生的结果进行控制。这种方法就是代理模式。
 * 
 * 注：
 * 代理模式在UML结构上跟装饰器模式一致，区别在于：
 * 装饰器模式关注于在一个对象上动态的添加方法，然而代理模式关注于控制对象的访问。
 * 站在开发者的角度上来说，代理模式下，代理类可以对它的客户隐藏一个对象的具体信息。
 * 在使用代理模式的时候，我们常常在一个代理类中创建一个对象的实例。
 * 使用装饰器模式时，我们通常将一个原始对象作为一个参数传给装饰者的构造器。
 * 
 * @version 1.0.0 2018年6月23日 下午8:11:57
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class ProxyPattern {

	public static void main(String[] args) {
		IStudent student = new ProxyStudent();
		student.appearance();
	}
}
