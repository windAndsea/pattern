/*
 * @(#)Subject.java    1.0.0 2018年7月16日 下午2:01:48
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

/**
 * 主播间.
 * 
 * @version 1.0.0 2018年7月16日 下午2:01:48
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public interface ISubject {

	/**
	 * 
	 * 粉丝添加关注
	 *
	 */
	public void addFans(IObserver obs);
	
	/**
	 * 
	 * 粉丝取关
	 *
	 * @param obs
	 */
	public void delFans(IObserver obs);
	
	/**
	 * 
	 * 消息通知
	 *
	 * @param msg
	 */
	public void notifyAll(String msg);
}
