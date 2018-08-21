/*
 * @(#)AnchorMei.java    1.0.0 2018年7月16日 下午2:11:09
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
package com.hy.bean.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.hy.bean.ins.IObserver;
import com.hy.bean.ins.ISubject;

/**
 * 主播小美.
 * 
 * @version 1.0.0 2018年7月16日 下午2:11:09
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class AnchorMei implements ISubject {

	private List<IObserver> observers = Collections.synchronizedList(new ArrayList<IObserver>());
	
	private static final String NAME = "小美";
	
	public void addFans(IObserver obs) {
		if (!observers.contains(obs)) {
			observers.add(obs);
		}
	}

	public void delFans(IObserver obs) {
		if (observers.contains(obs)) {
			observers.remove(obs);
		}
	}

	public void notifyAll(String msg) {
		for (IObserver obs : observers) {
			obs.accept(NAME, msg);
		}
	}

}
