/*
 * @(#)VipCustomer.java    1.0.0 2018年7月19日 下午3:22:45
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

import com.hy.bean.ins.ICustomer;

/**
 * 贵宾顾客
 * 
 * @version 1.0.0 2018年7月19日 下午3:22:45
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class VipCustomer implements ICustomer {

	public void process(SaveBankService service) {
		System.out.println("存款限额：80W/天");
	}

	public void process(DrawBankService service) {
		System.out.println("提款限额：20W/天");
	}

	public void process(BorrowBankService service) {
		System.out.println("贷款限额：50W");
	}

}
