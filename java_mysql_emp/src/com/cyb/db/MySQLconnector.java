package com.cyb.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLconnector {
	public String driver = "com.mysql.cj.jdbc.Driver";
	public String url = "jdbc:mysql://localhost:3306/";
	public String id_mysql = "root";
	public String pw_mysql = "1234";

	public Connection conn = null;

	public MySQLconnector() { // �⺻ ������
	}

	// DB ���� �޼���
	public void connectMySQL() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id_mysql, pw_mysql);
			System.out.println("MySQL ���� ����");

		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFound ERR");
		} catch (SQLException e) {
			System.out.println(" DriverManager.getConnection ERR");
		}
	} // connectMySQL() END

}