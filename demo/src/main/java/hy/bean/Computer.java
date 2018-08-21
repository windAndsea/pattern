/*
 * @(#)Computer.java    1.0.0 2018年6月21日 下午5:49:34
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
package com.hy.bean;

import com.hy.build.build.ComputerBuilder;

/**
 * 台式电脑.
 * 
 * @version 1.0.0 2018年6月21日 下午5:49:34
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class Computer {

	private Keyboard keyboard;
	
	private Display display;
	
	private Cpu cpu;
	
	private Mouse mouse;
	
	public Keyboard getKeyboard() {
		return keyboard;
	}

	public Display getDisplay() {
		return display;
	}

	public Cpu getCpu() {
		return cpu;
	}

	public Mouse getMouse() {
		return mouse;
	}
	
	public Computer() {
		// 外观模式测试新增
		this.cpu = new Cpu();
		this.display = new Display();
	}
	
	public Computer(ComputerBuilder builder) {
		this.keyboard = builder.getKeyboard();
		this.display = builder.getDisplay();
		this.cpu = builder.getCpu();
		this.mouse = builder.getMouse();
	}

	@Override
	public String toString() {
		return "Computer [keyboard=" + keyboard + ", display=" + display + ", cpu=" + cpu + ", mouse=" + mouse + "]";
	}
	
	/**
	 * 
	 * 外观模式测试新增
	 *
	 */
	public void start() {
		System.out.println("开机");
		this.cpu.start();
		this.display.start();
	}
	
	/**
	 * 外观模式测试新增
	 *
	 */
	public void stop() {
		System.out.println("关机");
		this.cpu.stop();
		this.display.stop();
	}
}
