package com.wayne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestOracle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestOracle to = new TestOracle();
		to.findAll();
	}

	public void findAll() {
		Connection con = null;
		Statement sta = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("songweiqi2>>>>>>>>>>>>");
			con = (Connection) DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl", "scott",
					"Sss6998848");
			System.out.println("songweiqi3>>>>>>>>>>>");

			sta = con.createStatement();
			System.out.println("songweiqi>>>>>>>>" + "连接oracle数据库成功!");

			rs = sta.executeQuery("select * from emp");

			while (rs.next()) {
				System.out.println("用户名:" + rs.getString(2));
			}
			
			//关闭打开的资源
			rs.close();
			sta.close();
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
