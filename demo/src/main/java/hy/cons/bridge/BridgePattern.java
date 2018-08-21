/*
 * @(#)BridgePattern.java    1.0.0 2018年6月25日 上午8:50:11
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
package com.hy.cons.bridge;

import com.hy.bean.Airport;
import com.hy.bean.impl.Beijing;
import com.hy.bean.impl.ShangHai;

/**
 * 桥接模式.
 * 应用场景：
 * 抽象和实现解耦，多个具有变化的分类共同实现功能时宜采用桥接模式
 * 
 * @version 1.0.0 2018年6月25日 上午8:50:11
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class BridgePattern {
	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				try {
					Class.forName(Beijing.class.getName());
					Airport.visit("Thread-1");
					Thread.sleep(1);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				try {
					Class.forName(ShangHai.class.getName());
					Airport.visit("Thread-2");
					Thread.sleep(1);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				try {
					Class.forName(Beijing.class.getName());
					Airport.visit("Thread-3");
					Thread.sleep(1);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();
	}
}
