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
        // 기본 생성자
    }

    public void connectMySQL() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // 드라이버 로드
            Class.forName(driver);
            System.out.println("드라이버 로드 성공");

            // DB 접속
            conn = DriverManager.getConnection(url + "test", id_mysql, pw_mysql);
            System.out.println("DB 접속 성공");

            // SQL 쿼리 객체 생성
            stmt = conn.createStatement();
            System.out.println("Statement 객체 생성 완료");

            // SQL 쿼리 실행
            String query = "SELECT * FROM tbl";
            rs = stmt.executeQuery(query);
            System.out.println("조회 성공");

            // 조회 결과 출력
            while (rs.next()) {
                System.out.println(rs.getString("id") + ": " + rs.getString("name"));
            }
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFound ERR : " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        } finally {
            // 사용이 완료된 DB 자원해제
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
                System.out.println("자원해제 성공");
            } catch (SQLException e) {
                System.out.println("SQLException during closing resources: " + e.getMessage());
            }
        }
    }
}
