/*
 * @(#)Aircon.java    1.0.0 2018年7月18日 上午11:14:25
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
package com.hy.bean;

import java.util.HashMap;
import java.util.Map;

import com.hy.enums.StateEnum;

/**
 * 空调
 * 
 * @version 1.0.0 2018年7月18日 上午11:14:25
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class Aircon {
	public StateEnum state = StateEnum.OFF;	// 初始状态(simple)
	
	private Map<String, Boolean> flag = new HashMap<String, Boolean>();
	
	public void power() {
		state.power(this);
	}
	
	public void cool() {
		state.cool(this);
	}
	
	public void hot() {
		state.hot(this);
	}
	
	public void open() {
		state.open(this);
	}
	
	public void close() {
		state.close(this);
	}

	public Map<String, Boolean> getFlag() {
		return flag;
	}

	public void setFlag(Map<String, Boolean> flag) {
		this.flag = flag;
	}

}
