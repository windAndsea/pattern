/*
 * @(#)StatePattern.java    1.0.0 2018年7月18日 上午10:38:52
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
package com.hy.action.state;

import com.hy.bean.Aircon;
import com.hy.enums.StateEnum;

/**
 * 状态模式
 * 应用场景：
 * 1，行为随状态改变而改变的场景；
 * 2，条件、分支语句的替代者
 * 
 * @version 1.0.0 2018年7月18日 上午10:38:52
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class StatePattern {

	public static void main(String[] args) {
		Aircon aircon = new Aircon();
		aircon.open();
		// 制冷
		aircon.state=StateEnum.COOL;
		aircon.cool();
		// 关机
		aircon.state=StateEnum.OFF;
		aircon.close();
	}
}
