package com.cyb.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * ������ ���̽� ����, ���� ���� ���� dao class( data access object)
 */
public class DataBaseClass {
	public final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public final String DB_URL = "jdbc:mysql://localhost:3306/";
	public final String DB_ADMIN_ID = "root";
	public final String DB_ADMIN_PW = "1234";

	// java.sql.~~~

	public Connection conn = null; // ���������� ������� static �ٿ��ָ� ��

	public DataBaseClass() { // �⺻ ������ //private�̸� DataBaseClass ���� ��ü�� �ȵ� -> ���߿� private�� �̱��� �������� �ٲܰ���

	}

	/** 1. ������ ���̽� ���� �޼��� **/
	public void connMySQL() {
		try {							
			// ����̹� �ε�
			Class.forName(DB_DRIVER);					
			// Connection ��ü ���
			conn = DriverManager.getConnection(DB_URL + "test", DB_ADMIN_ID, DB_ADMIN_PW); 	
			System.out.println("����̹� ���� ����!!");
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFound ERR" + e.getMessage());
		} catch (SQLException e) {
			System.out.println("DriverManager.getConnection ERR" + e.getMessage());
		}
	}

	/** 2. �����ͺ��̽� ���� ���̺� ��ü ���ڵ� ��ȸ **/
	// select * from employee
	// Connection, Statement, Resultset // new�� Statement ���� �Ұ� -> Connection���
	// ��ü��ȸ�� Statement ���
	// 1�� ��ȸ�� �������� ���� ������
	public void selectAll() {

		Statement stmt = null;
		ResultSet rs = null;

		try {
			stmt = conn.createStatement(); // Statement ��ü ����
			rs = stmt.executeQuery("select * from employee"); // ��ü ��ȸ��, ��� �� ����

			while (rs.next()) { // �о���� ���ڵ尡 �����ϸ� true
				System.out.print(rs.getString("empname")); // ��ȸ�� �ʵ� �� emp_name �ʵ� ���� Ȯ��
				System.out.println(rs.getInt("sale")); // ��ȸ�� �ʵ� �� sale �ʵ� ���� Ȯ��

			}

		} catch (SQLException e) {
			System.out.println("SELECT ALL ERR: " + e.getMessage());
		} finally {
			try {
				rs.close();
				stmt.close();
			} catch (SQLException e) {
				System.out.println("SELECT ALL CLOSE ERR: " + e.getMessage());
			}
		}

	} // selectAll() END

	/** 3. �����ͺ��̽� ���� ���̺����� empNo(��� ������ȣ)�� ��ȸ **/
	// "select * from employee where empno =?"
	// ? => String no="1457"
	// "select * from employee where empno =" + no => ���� �ȵ�
	// "select * from employee where empno =" + "1234"
	// select * from employee where empno = 1457"�� �ν��Ѵ� -> 1457�� ���ڷ� �ν���(���ڿ��̱� ������
	// ����)
	// "select * from employee where empno ='1457'" �� ����� ��
	// Connection, PreparedStatement, ResultSet
	// PreparedStatement�� Connection�� ���� ��ü�� ��ȯ �޴´�
	// ��, �̸� ������ �־� �־�� �Ѵ�!!!

	public void selectOne() {
		PreparedStatement pstmt = null; // �ʵ忡 ���� ���� ����ó���Ҷ� ? ó�� ����(���̺� x)
		ResultSet rs = null;

		String query = "select * from employee where empno =? ";// "select * from employee where empno =?, empname=? "
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, 1001); // ? ó�� ����
			// pstmt.setString(2,����) // 2��° ? ó������

			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("empname") + ":" + rs.getInt("sale"));
			}
		} catch (SQLException e) {
			System.out.println("SELECT ON ERR : " + e.getMessage());
		} finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				System.out.println("SELECT ON CLOSE ERR : " + e.getMessage());
			}

		}

	}

	// ��ü ���ڵ� �� �Ϻκи� ��ȸ
	// select * from employee limit ����index, �� index, count <== MySQL ���� (Oracle X )
	// select * from employee limit ?, ?
	public void selectLimit() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String query = "select * from employee limit ?, ?";
		int startIndex = 5; // ���� �Է¹ް� ������ int �Ű����� ���� ���ָ� �� -> ��ĳ�� �ʿ�(�� �о��)
							// nextInt�� �޾Ƽ� ���ο��� ȣ��
		int count = 3;

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startIndex);
			pstmt.setInt(2, count);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.println(
						rs.getString("empname") + " �޿� : " + rs.getInt("sale") + ", �Ի��� : " + rs.getString("hireDate"));
			}
		} catch (SQLException e) {
			System.out.println("SELECT LIMIT ERR : " + e.getMessage());
		} finally {
			try {
				rs.close();
				pstmt.close();

			} catch (SQLException e) {
				System.out.println("SELECT LIMIT CLOSE ERR : " + e.getMessage());
			}
		}
	}

	/** ���ڵ� �߰� **/
	/*
	 * insert into employee X X X X (empNo, empName, job, mgr, hireDate, sale,
	 * commission, deptNo) values (1001, '����', '���', '13', '2007-03-01', 300, 0,
	 * 20);
	 */
	/*
	 * �߰��� �ڵ� insert into employee (empNo, empName, hireDate, sale) values (1015,
	 * '������', '2024-03-12', 500); insert into employee (empNo, empName, hireDate,
	 * sale) values (?, ?, ?, ?); Connection, PreparedStatement, int result
	 */
	public void insert() {
		PreparedStatement pstmt = null;
		String query = "insert into employee (empNo, empName, hireDate, sale) values (?, ?, ?, ?)";
		int result = 0;
		int empno = 1015;
		String empname = "������";
		String hiredate = "2024-03-12";
		int sale = 400;

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, empno);
			pstmt.setString(2, empname);
			pstmt.setString(3, hiredate);
			pstmt.setInt(4, sale);

			result = pstmt.executeUpdate();
			if (result < 1) {
				System.out.println("INSERT ERR");
			}

		} catch (SQLException e) {
			System.out.println("INSERT CLOSE ERR :" + e.getMessage());
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				System.out.println("INSERT CLOSE ERR :" + e.getMessage());
			}
		}
	}

	/** ���ڵ� ���� **/
	// update employee set job=?, mgr=?, commission=0, deptno=20 where empno=?
	// ���, 13, 1015
	// Connection, PreparedStatement, int result
	public void update() {
		PreparedStatement pstmt = null;
		String query = "update employee set job=?, mgr=?, commission=0, deptno=20 where empno=?";
		int result = 0; // Update �������� Ȯ��
		String job = "���";
		String mgr = "13";
		int empno = 1015;

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, job);
			pstmt.setString(2, mgr);
			pstmt.setInt(3, empno);

			result = pstmt.executeUpdate();
			if (result < 1) {
				System.out.println("UPDATE FAIL!!");
			}

		} catch (SQLException e) {
			System.out.println("UPDATE ERR : " + e.getMessage());
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				System.out.println("UPDATE CLOSE ERR : " + e.getMessage());
			}
		}
	}

	/** ���ڵ� ���� **/
	// delete from employee where empno=?
	// 1015
	// Connection, PreparedStatement, int result
	public void delete() {
		String query = "delete from employee where empno =?";

		PreparedStatement pstmt = null;
		int result = 0;
		int empno = 1015;

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, empno);
			
			result = pstmt.executeUpdate();
			if(result <1) {
				System.out.println("DELETE FAIL!!");
			}
		} catch (SQLException e) {
			System.out.println("DELETE ERR : " + e.getMessage());
		}finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				System.out.println("DELETE CLOSE ERR : " + e.getMessage());
			}
		}
	}
}