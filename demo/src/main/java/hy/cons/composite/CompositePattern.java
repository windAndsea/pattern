/*
 * @(#)CompositePattern.java    1.0.0 2018年6月26日 下午1:38:16
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
package com.hy.cons.composite;

import com.hy.bean.Children;

/**
 * 组合模式.
 * 应用场景：
 * 类树结构
 * 
 * @version 1.0.0 2018年6月26日 下午1:38:16
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class CompositePattern {

	public static void main(String[] args) {
		Children root = new Children("root");
		root.addNode(new Children("node1"));
		root.addNode(new Children("node2"));
		Children node3 = new Children("node3");
		node3.addNode(new Children("node4"));
		root.addNode(node3);
		root.display();
	}
}
