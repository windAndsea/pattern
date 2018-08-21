/*
 * @(#)FlyWeightPattern.java    1.0.0 2018年6月26日 下午3:27:41
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
package com.hy.cons.flyweight;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hy.bean.impl.ConnectionPool;

/**
 * 享元模式.
 * 应用场景：
 * 对于频繁创建及资源释放的对象，进行创建跟管理
 * 
 * 典型案例：
 * 数据库连接池，
 * 初学jdbc连接时，我们搭建数据库连接，主要步骤：
 * 1，装载数据库驱动，即Class.forName(classname);
 * 2，通过jdbc建立数据库连接，DriverManager.getConnection(url, name, pwd);
 * 3，访问数据库，执行sql语句，con.prepareStatement(sql);
 * 4，断开数据库连接，释放资源。
 * 
 * 然而，建立数据库连接是一个耗时的过程，系统还得分配相应的内存资源。过于频繁的资源创建、释放，
 * 对于系统而言是非常危险的，如果系统异常导致数据库连接未能关闭，将会导致数据库系统的内存泄露，
 * 严重时，将会导致数据库重启。所以，采用数据库连接池，针对数据库连接进行限制创建跟管理。
 * 
 * @version 1.0.0 2018年6月26日 下午3:27:41
 * @author hy
 * @history 
 *			时间	版本	姓名	修改内容
 */
public class FlyWeightPattern {

	public static void main(String[] args) {
		ConnectionPool pool = new ConnectionPool();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = pool.getConnection();
			ps = conn.prepareStatement("select * from test");
			rs = ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
				
				rs = null;
				ps = null;
				conn = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
