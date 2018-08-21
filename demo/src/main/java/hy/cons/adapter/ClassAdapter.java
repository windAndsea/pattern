/*
 * @(#)ClassAdapter.java    1.0.0 2018年6月22日 下午2:04:05
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

import com.hy.bean.adapter.LampAdapter;

/**
 * 类适配器.
 * 应用场景：
 * 当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，创建一个新类，
 * 继承原有的类，实现新的接口
 * 
 * @version 1.0.0 2018年6月22日 下午2:04:05
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class ClassAdapter {

	public static void main(String[] args) {
		LampAdapter adapter = new LampAdapter();
		adapter.light(true);
		adapter.music("告白气球");
	}
}
