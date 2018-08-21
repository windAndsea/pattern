/*
 * @(#)SimpleFactory.java    1.0.0 2018年6月20日 下午2:48:27
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
package com.hy.build.factory;

import com.hy.bean.abs.Car;
import com.hy.bean.impl.Benz;
import com.hy.bean.impl.Bmw;

/**
 * 简单工厂模式.
 * 
 * @version 1.0.0 2018年6月20日 下午2:48:27
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class SimpleFactory {

	public static void main(String[] args) {
		/*********************1***************************/
		/*Car car = Driver.createCar("Benz");
		car.setName("Benz");
		car.drive();*/
		/*********************1***************************/
		
		/*********************2***************************/
		Car car = Driver1.createCar(Benz.class);
		car.setName("Benz");
		car.drive();
		/*********************2***************************/
	}
}

/**
 * 
 * 通过传入String字符串，逻辑判断后生成实例.
 * 问题：若增加一个车系，则需要修改逻辑代码，违反了开闭原则，若车系固定，不再更改的情况下，可以采取
 * 
 * @version 1.0.0 2018年6月20日 下午3:34:35
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
class Driver {
	public static Car createCar(String car) {
		Car instance = null;
		if ("Benz".equalsIgnoreCase(car)) {
			instance = new Benz();
		} else if ("Bmw".equalsIgnoreCase(car)) {
			instance = new Bmw();
		}
		return instance;
	}
}

/**
 * 
 * 通过传入的类的class对象，以反射方式创建对象
 * 问题：工厂创建对象单一，仅仅生产car类
 * 
 * @version 1.0.0 2018年6月20日 下午3:35:22
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
class Driver1 {
	@SuppressWarnings("rawtypes")
	public static Car createCar(Class clazz) {
		Car instance = null;
		try {
			instance = (Car) clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return instance;
	}
}
