/*
 * @(#)Lamp1Adapter.java    1.0.0 2018年6月22日 下午3:53:50
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
package com.hy.bean.adapter;

import com.hy.bean.Lamp;
import com.hy.bean.ins.MusicLamp;

/**
 * Lamp1Adapter, Adapter类.
 * 
 * @version 1.0.0 2018年6月22日 下午3:53:50
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class Lamp1Adapter implements MusicLamp {

	private Lamp lamp;
	
	public Lamp1Adapter(Lamp lamp) {
		super();
		this.lamp = lamp;
	}

	public boolean light(boolean change) {
		return lamp.light(change);
	}

	public void music(String song) {
		System.out.println("play: " + song);
	}

	
}
