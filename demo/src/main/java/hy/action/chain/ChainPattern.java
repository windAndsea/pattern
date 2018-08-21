/*
 * @(#)ChainPattern.java    1.0.0 2018年7月17日 上午10:25:40
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
package com.hy.action.chain;

import com.hy.bean.impl.MsgHandler;

/**
 * 责任链模式.
 * 应用场景：
 * 1，有多个对象可以处理同一个请求，具体哪个对象处理该请求由运行时自动确定；
 * 2，在不明确指定接收者的清空下，向多个对象中的一个提交一个请求；
 * 3，可动态指定一组对象处理请求。
 * 
 * @version 1.0.0 2018年7月17日 上午10:25:40
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class ChainPattern {

	public static void main(String[] args) {
		MsgHandler mh1 = new MsgHandler("hi");
		MsgHandler mh2 = new MsgHandler("hello");
		MsgHandler mh3 = new MsgHandler("long");
		
		mh1.setHandler(mh2);
		mh2.setHandler(mh3);
		
		mh1.deal();
	}
}
