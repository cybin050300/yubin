package com.cyb.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseClass {

    public static void connMySQL() {
        try {							
            // ����̹� �ε�
            Class.forName("com.mysql.cj.jdbc.Driver");					
            // Connection ��ü ���
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "1234"); 	
            System.out.println("����̹� ���� ����!!");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFound ERR : " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("DriverManager.getConnection ERR" + e.getMessage());
        }
    }

    public void dayItem() {
        // TODO: Implement this method
    }

    public void maxItem() {
        // TODO: Implement this method
    }

    public void maxDate() {
        // TODO: Implement this method
    }

    public void maxCategory() {
        // TODO: Implement this method
    }
}
