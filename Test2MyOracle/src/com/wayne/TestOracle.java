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
			con = (Connection) DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl", "scott",
					"Sss6998848");
			// 加入事务处理
			con.setAutoCommit(false);

			sta = con.createStatement();
			System.out.println("songweiqi>>>>>>>>" + "连接oracle数据库成功!");

			// 讲SCOTT账户的工资减100
			sta.executeUpdate("update emp set sal=sal-100 where ename='SCOTT'");

			int i = 5 / 0;

			// 给SMITH账户的工资加100
			sta.executeUpdate("update emp set sal=sal+100 where ename='SMITH'");

			// 提交事务,当减100和加100都执行后再提交
			con.commit();

			// 关闭打开的资源
			sta.close();
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			try {
				con.rollback();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			e.printStackTrace();
		}
	}
}
