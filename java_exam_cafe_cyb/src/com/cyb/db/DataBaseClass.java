package com.cyb.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseClass {

	public Connection conn = null;

	public DataBaseClass() { // 기본 생성자
	}
	public final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public final String DB_URL = "jdbc:mysql://localhost:3306/";
	public final String DB_ADMIN_ID = "root";
	public final String DB_ADMIN_PW = "1234";


	public void connMySQL() {
		try {
			// 드라이버 로드
			Class.forName(DB_DRIVER);
			// Connection 객체 얻기
			conn = DriverManager.getConnection(DB_URL + "cafe_db_cyb", DB_ADMIN_ID, DB_ADMIN_PW);
			// System.out.println("드라이버, 접속 성공 !!!");
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFound ERR : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("DriverManager.getConnection() ERR : " + e.getMessage());
		}
	} // connMySQL() END

	public void updateItem() {
		PreparedStatement pstmt = null;
		int result = 0; //  
		String query = "update cafe_cyb set item=? where item=?";
		try {

			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "시그니처 커피");
			pstmt.setString(2, "비엔나커피");
			result = pstmt.executeUpdate();
			if (result < 1) {
				System.out.println("update FAIL!!!");
			}

		} catch (SQLException e) {
			System.out.println("update ERR : " + e.getMessage());
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				System.out.println("update CLOSE ERR : " + e.getMessage());
			}
		}
	

}
	public void insert(CafeClass cc) {
		PreparedStatement pstmt = null;
		int result = 0; // insert into 성공여부
		String query = "insert into cafe_cyb (order_id, order_date, category, item, price) values(?, ?, ?, ?, ?)";
		try {

			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, cc.getOrder_id());
			pstmt.setString(2, cc.getOrder_date());
			pstmt.setString(3, cc.getCategory());
			pstmt.setString(4, cc.getItem());
			pstmt.setInt(5, cc.getPrice());
			result = pstmt.executeUpdate();
			if (result < 1) {
				System.out.println("INSERT FAIL!!!");
			}

		} catch (SQLException e) {
			System.out.println("INSERT ERR : " + e.getMessage());
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				System.out.println("INSERT CLOSE ERR : " + e.getMessage());
			}
		}

	}
	


	public void deleteAll() {
		PreparedStatement pstmt = null;
		int result = 0; // insert into 성공여부

		String query = "delete from cafe_cyb";
		try {

			pstmt = conn.prepareStatement(query);

			result = pstmt.executeUpdate();
			if (result < 1) {
				System.out.println("DELETE FAIL!!!");
			}

		} catch (SQLException e) {
			System.out.println("DELETE ERR : " + e.getMessage());
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				System.out.println("DELETE CLOSE ERR : " + e.getMessage());
			}
		}
	}

}
