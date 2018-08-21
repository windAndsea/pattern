/*
 * @(#)Children.java    1.0.0 2018年6月26日 下午2:04:29
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

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Children.
 * 
 * @version 1.0.0 2018年6月26日 下午2:04:29
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class Children {

	private String name;
	
	private Children parent;
	
	private List<Children> children = new LinkedList<Children>();
	
	public Children(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Children getParent() {
		return parent;
	}

	public void setParent(Children node) {
		this.parent = node;
	}
	
	public void addNode(Children node) {
		children.add(node);
	}
	
	public void removeNode(Children node) {
		children.remove(node);
	}
	
	public void display() {
		System.out.println("root[name="+name+toString()+"]");
	}
	
	public List<Children> getChildren() {
		return children;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Iterator<Children> iterator = children.iterator();
		while (iterator.hasNext()) {
			Children children = (Children) iterator.next();
			sb.append(",node【name=").append(children.getName());
			sb.append(children.toString()).append("】");
		}
		return sb.toString();
	}
	
}
