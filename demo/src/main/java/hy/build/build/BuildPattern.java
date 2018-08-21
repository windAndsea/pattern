/*
 * @(#)BuildPattern.java    1.0.0 2018年6月21日 下午5:45:20
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
 * 建造者模式.
 * 
 * @version 1.0.0 2018年6月21日 下午5:45:20
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class BuildPattern {

	public static void main(String[] args) {
		Computer computer = new ComputerBuilder()
				.setKeyboard(new Keyboard("1", "1"))
				.setMouse(new Mouse("2", "2"))
				.setDisplay(new Display("3", "3"))
				.setCpu(new Cpu("4", "4"))
				.build();
		System.out.println(computer.toString());
	}
}
