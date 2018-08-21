/*
 * @(#)ObjectAdapter.java    1.0.0 2018年6月22日 下午2:04:28
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

import com.hy.bean.Lamp;
import com.hy.bean.adapter.Lamp1Adapter;

/**
 * 对象适配器.
 * 应用场景：
 * 当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Adapter类，
 * 持有原类的一个实例，在adapter类的方法中，调用实例方法
 * 
 * @version 1.0.0 2018年6月22日 下午2:04:28
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class ObjectAdapter {

	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		Lamp1Adapter adapter = new Lamp1Adapter(lamp);
		adapter.light(true);
		adapter.music("约定");
	}
}
