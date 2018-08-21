/*
 * @(#)IteratorPattern.java    1.0.0 2018年7月16日 下午2:38:27
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
package com.hy.action.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 迭代器模式
 * 应用场景：
 * 1，访问一个聚合对象的内容而无需暴露它的内部表示；
 * 2，需要为聚合对象提供多种遍历方式；
 * 3，为遍历不同的聚合结果提供一个统一的接口。
 * 
 * 注：
 * forech遍历底层实现为Iterator
 * 
 * @version 1.0.0 2018年7月16日 下午2:38:27
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class IteratorPattern {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Zhao");
		list.add("Qian");
		list.add("Sun");
		list.add("Li");
		
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}

}
