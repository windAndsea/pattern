/*
 * @(#)ComputerBuilder.java    1.0.0 2018年6月21日 下午6:02:32
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
package com.hy.build.build;

import com.hy.bean.Computer;
import com.hy.bean.Cpu;
import com.hy.bean.Display;
import com.hy.bean.Keyboard;
import com.hy.bean.Mouse;

/**
 * Class description goes here.
 * 
 * @version 1.0.0 2018年6月21日 下午6:02:32
 * @author hy
 * @history 时间 版本 姓名 修改内容
 */
public class ComputerBuilder {

	private Keyboard keyboard;

	private Display display;

	private Cpu cpu;

	private Mouse mouse;

	public ComputerBuilder() {
	}

	public ComputerBuilder(Keyboard keyboard, Display display, Cpu cpu, Mouse mouse) {
		super();
		this.keyboard = keyboard;
		this.display = display;
		this.cpu = cpu;
		this.mouse = mouse;
	}

	public Computer build() {
		return new Computer(this);
	}

	public ComputerBuilder setKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
		return this;
	}

	public ComputerBuilder setDisplay(Display display) {
		this.display = display;
		return this;
	}

	public ComputerBuilder setCpu(Cpu cpu) {
		this.cpu = cpu;
		return this;
	}

	public ComputerBuilder setMouse(Mouse mouse) {
		this.mouse = mouse;
		return this;
	}

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

}
