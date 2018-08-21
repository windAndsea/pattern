/*
 * @(#)TemplateMPattern.java    1.0.0 2018年7月12日 下午5:00:54
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
package com.hy.action.template;

import com.hy.bean.abs.AbsCaculator;
import com.hy.bean.impl.Plus;

/**
 * 模板方法模式
 * 应用场景：
 * 1，一个抽象类中一个主方法调用多个次级方法
 * 2，定义子类实现该抽象类，实现次级方法
 * 3，通过调用抽象类，实现对子类的调用
 * 
 * @version 1.0.0 2018年7月12日 下午5:00:54
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class TemplateMPattern {

	public static void main(String[] args) {
		String exp = "10+9";
		String opt = "\\+";
		AbsCaculator<Number> caculator = new Plus<Number>();
		caculator.process(exp, opt);
	}

}
