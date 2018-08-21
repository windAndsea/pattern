/*
 * @(#)GameStore.java    1.0.0 2018年7月18日 上午10:14:01
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

/**
 * GameStore
 * 
 * @version 1.0.0 2018年7月18日 上午10:14:01
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class GameStore {

	private Memento memento;

	public GameStore(Memento memento) {
		super();
		this.memento = memento;
	}

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
}
