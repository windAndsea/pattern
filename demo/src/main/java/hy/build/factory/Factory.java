/*
 * @(#)Factory.java    1.0.0 2018年6月20日 下午3:52:27
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
 * 工厂模式.
 * 问题：产品单一
 * 
 * @version 1.0.0 2018年6月20日 下午3:52:27
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class Factory {
	public static void main(String[] args) throws Exception {
		/**************1******************/
		Driver2 driver = new BenzDriver();
		Car car = driver.createCar();
		car.setName("Benz");
		car.drive();
		/**************1******************/
	}
}

abstract class Driver2 {
	abstract Car createCar() throws Exception;
}

class BenzDriver extends Driver2 {

	@Override
	Car createCar() throws Exception {
		return new Benz();
	}
	
}

class BmwDriver extends Driver2 {

	@Override
	Car createCar() throws Exception {
		return new Bmw();
	}
	
}