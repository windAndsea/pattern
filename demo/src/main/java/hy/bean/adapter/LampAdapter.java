/*
 * @(#)LampAdapter.java    1.0.0 2018年6月22日 下午3:46:17
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
 * LampAdapter, Adapter类.
 * 
 * @version 1.0.0 2018年6月22日 下午3:46:17
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class LampAdapter extends Lamp implements MusicLamp {

	public void music(String song) {
		System.out.println("play: " + song);
	}

}
