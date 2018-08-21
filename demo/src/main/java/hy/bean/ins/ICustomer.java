/*
 * @(#)ICustomer.java    1.0.0 2018年7月19日 下午2:18:34
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
package com.hy.bean.ins;

import com.hy.bean.impl.BorrowBankService;
import com.hy.bean.impl.DrawBankService;
import com.hy.bean.impl.SaveBankService;

/**
 * 顾客
 * 
 * @version 1.0.0 2018年7月19日 下午2:18:34
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public interface ICustomer {

	/**
	 * 
	 * 存款
	 *
	 * @param service
	 */
	public void process(SaveBankService service);
	
	/**
	 * 
	 * 提款
	 *
	 * @param service
	 */
	public void process(DrawBankService service);
	
	/**
	 * 
	 * 借钱
	 *
	 * @param service
	 */
	public void process(BorrowBankService service);
}
