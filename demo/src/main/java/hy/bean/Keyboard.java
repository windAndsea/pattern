/*
 * @(#)Keyboard.java    1.0.0 2018年6月21日 下午5:46:20
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
 * 键盘.
 * 
 * @version 1.0.0 2018年6月21日 下午5:46:20
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class Keyboard {

	private String brand;
	
	private String modal;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModal() {
		return modal;
	}

	public void setModal(String modal) {
		this.modal = modal;
	}

	public Keyboard() {
		super();
	}

	public Keyboard(String brand, String modal) {
		super();
		this.brand = brand;
		this.modal = modal;
	}

	@Override
	public String toString() {
		return "Keyboard [brand=" + brand + ", modal=" + modal + "]";
	}
	
}
