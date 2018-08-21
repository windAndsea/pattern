/*
 * @(#)MethodAdapter.java    1.0.0 2018年6月22日 下午2:04:40
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
package com.hy.cons.adapter;

import com.hy.bean.impl.JustLamp;
import com.hy.bean.impl.JustMusic;
import com.hy.bean.ins.MusicLamp;

/**
 * 接口适配器.
 * 应用场景：
 * 当不希望实现一个接口中所有的方法时，可以创建一个抽象类，实现所有方法，
 * 在写其他类时，继承抽象类
 * 
 * @version 1.0.0 2018年6月22日 下午2:04:40
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class MethodAdapter {

	public static void main(String[] args) {
		/*AbsMusicLamp adapter = new JustLamp();
		adapter.light(true);
		adapter.music("always with me");
		
		AbsMusicLamp adapter1 = new JustMusic();
		adapter1.light(true);
		adapter1.music("天空之城");*/
		
		MusicLamp lamp = new JustLamp();
		lamp.light(true);
		lamp.music("always with me");
		
		MusicLamp lamp1 = new JustMusic();
		lamp1.light(true);
		lamp1.music("天空之城");
	}
}
