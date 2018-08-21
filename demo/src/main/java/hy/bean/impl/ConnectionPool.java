/*
 * @(#)ConnectionPool.java    1.0.0 2018年6月26日 下午3:43:26
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

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.LinkedList;
import java.util.logging.Logger;

import javax.sql.DataSource;

import oracle.jdbc.driver.OracleDriver;

/**
 * Class description goes here.
 * 
 * @version 1.0.0 2018年6月26日 下午3:43:26
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class ConnectionPool implements DataSource {

	private static LinkedList<Connection> source = new LinkedList<Connection>();
	
	private static int size = 6;
	
	static {
		for (int i = 0; i < size; i++) {
			try {
				DriverManager.registerDriver(new OracleDriver());
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@ip:port:target", "", "");
				source.add(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public PrintWriter getLogWriter() throws SQLException {
		return null;
	}

	public int getLoginTimeout() throws SQLException {
		return 0;
	}

	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		return null;
	}

	public void setLogWriter(PrintWriter arg0) throws SQLException {
		
	}

	public void setLoginTimeout(int arg0) throws SQLException {
		
	}

	public boolean isWrapperFor(Class<?> arg0) throws SQLException {
		return false;
	}

	public <T> T unwrap(Class<T> arg0) throws SQLException {
		return null;
	}

	public Connection getConnection() throws SQLException {
		if (source != null && source.size() > 0) {
			Connection conn = source.removeFirst();
			return conn;
		}
		return null;
	}

	public Connection getConnection(String arg0, String arg1) throws SQLException {
		return getConnection();
	}
	
	/**
	 * 将连接放回连接池
	 *
	 * @param conn
	 */
	public void release(Connection conn) {
		source.add(conn);
	}
}
