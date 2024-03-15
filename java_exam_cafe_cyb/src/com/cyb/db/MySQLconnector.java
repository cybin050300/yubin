package com.cyb.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLconnector {

    public String driver = "com.mysql.cj.jdbc.Driver";
    public String url = "jdbc:mysql://localhost:3306/";
    public String id_mysql = "root";
    public String pw_mysql = "1234";

    public MySQLconnector() {
        // �⺻ ������
    }

    public void connectMySQL() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // ����̹� �ε�
            Class.forName(driver);
            System.out.println("����̹� �ε� ����");

            // DB ����
            conn = DriverManager.getConnection(url + "test", id_mysql, pw_mysql);
            System.out.println("DB ���� ����");

            // SQL ���� ��ü ����
            stmt = conn.createStatement();
            System.out.println("Statement ��ü ���� �Ϸ�");

            // SQL ���� ����
            String query = "SELECT * FROM tbl";
            rs = stmt.executeQuery(query);
            System.out.println("��ȸ ����");

            // ��ȸ ��� ���
            while (rs.next()) {
                System.out.println(rs.getString("id") + ": " + rs.getString("name"));
            }
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFound ERR : " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        } finally {
            // ����� �Ϸ�� DB �ڿ�����
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
                System.out.println("�ڿ����� ����");
            } catch (SQLException e) {
                System.out.println("SQLException during closing resources: " + e.getMessage());
            }
        }
    }
}
