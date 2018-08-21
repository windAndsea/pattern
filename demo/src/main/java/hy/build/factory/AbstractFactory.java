/*
 * @(#)AbstractFactory.java    1.0.0 2018年6月20日 下午4:28:02
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

import com.hy.bean.abs.AudiCar;
import com.hy.bean.abs.BenzCar;
import com.hy.bean.abs.BmwCar;
import com.hy.bean.impl.AudiBusinessCar;
import com.hy.bean.impl.AudiSportCar;
import com.hy.bean.impl.BenzBusinessCar;
import com.hy.bean.impl.BenzSportCar;
import com.hy.bean.impl.BmwBusinessCar;
import com.hy.bean.impl.BmwSportCar;

/**
 * 抽象工厂.
 * 
 * @version 1.0.0 2018年6月20日 下午4:28:02
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class AbstractFactory {

	public static void main(String[] args) throws Exception {
		/*****************************1********************************/
		/*Driver3 driver = new SportDriver();
		AudiCar car = driver.createAudiCar("");
		car.setName("audi");
		car.drive();*/
		/*****************************1********************************/
		
		/*****************************2********************************/
		AudiCar car = Driver4.createAudiCar(AudiBusinessCar.class);
		car.setName("audi");
		car.drive();
		/*****************************2********************************/
	}
}

/**
 * 
 * 生成产品族一致的一系列产品.
 * 问题：新增产品树，新增三个类，并且需要修改三个抽象类
 * 
 * @version 1.0.0 2018年6月20日 下午4:51:23
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
abstract class Driver3 {
	abstract BenzCar createBenzCar(String car);
	
	abstract BmwCar createBmwCar(String car);
	
	abstract AudiCar createAudiCar(String car);
}

class SportDriver extends Driver3 {

	@Override
	BenzCar createBenzCar(String car) {
		return new BenzSportCar();
	}

	@Override
	BmwCar createBmwCar(String car) {
		return new BmwSportCar();
	}

	@Override
	AudiCar createAudiCar(String car) {
		return new AudiSportCar();
	}
	
}

class BusinessDriver extends Driver3 {

	@Override
	BenzCar createBenzCar(String car) {
		return new BenzBusinessCar();
	}

	@Override
	BmwCar createBmwCar(String car) {
		return new BmwBusinessCar();
	}

	@Override
	AudiCar createAudiCar(String car) {
		return new AudiBusinessCar();
	}
	
}

/**
 * 
 * 针对Driver3提出的问题，进行改进
 * 解决方案：简单工厂通过反射改进抽象工厂及其子工厂.
 * 
 * @version 1.0.0 2018年6月20日 下午5:03:35
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
class Driver4 {
	@SuppressWarnings("rawtypes")
	public static BenzCar createBenzCar(Class clazz) throws Exception {
		return (BenzCar) clazz.newInstance();
	}
	
	@SuppressWarnings("rawtypes")
	public static BmwCar createBmwCar(Class clazz) throws Exception {
		return (BmwCar) clazz.newInstance();
	}
	
	@SuppressWarnings("rawtypes")
	public static AudiCar createAudiCar(Class clazz) throws Exception {
		return (AudiCar) clazz.newInstance();
	}
}