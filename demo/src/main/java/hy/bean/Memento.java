/*
 * @(#)Memoto.java    1.0.0 2018年7月18日 上午10:02:44
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
 * Memento
 * 
 * @version 1.0.0 2018年7月18日 上午10:02:44
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class Memento {

	private int level;
	
	private int energe;
	
	private String equip;

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getEnerge() {
		return energe;
	}

	public void setEnerge(int energe) {
		this.energe = energe;
	}

	public String getEquip() {
		return equip;
	}

	public void setEquip(String equip) {
		this.equip = equip;
	}

	public Memento(int level, int energe, String equip) {
		super();
		this.level = level;
		this.energe = energe;
		this.equip = equip;
	}
	
	
}
