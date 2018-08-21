/*
 * @(#)DecoratorPattern.java    1.0.0 2018年6月22日 下午6:00:53
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
package com.hy.cons.decorator;

import com.hy.bean.impl.Decorator;
import com.hy.bean.impl.Student;
import com.hy.bean.ins.IStudent;

/**
 * 装饰器模式.
 * 应用场景：
 * 1，需要扩展一个类的功能；
 * 2，动态为一个对象增加功能，而且还能动态撤销。
 * （继承的功能是静态的，子类只能覆盖父类方法，所以不能动态增删）
 * 
 * 缺点：
 * 产生过多相似的对象，不易排错
 * 
 * @version 1.0.0 2018年6月22日 下午6:00:53
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class DecoratorPattern {
	public static void main(String[] args) {
		IStudent student = new Student();
		Decorator decorator = new Decorator(student);
		decorator.appearance();
	}
}
