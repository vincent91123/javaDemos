package com.boge.order.jdbc;

import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) {
        // new JdbcTest().queryUser();
        new JdbcDemo().addUser();
    }

    /**
     *
     * 通过JDBC查询用户信息
     */
    public void queryUser(){
        Connection conn = null;
        PreparedStatement stmt = null;
        User user = new User();
        try {
            // 注册 JDBC 驱动
            // Class.forName("com.mysql.cj.jdbc.Driver");
            // 打开连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatisdb?characterEncoding=utf-8&serverTimezone=UTC", "root", "123456");
            // 执行查询

            String sql = "SELECT id,user_name,real_name,password,age,d_id from t_user where id = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1,2);
            ResultSet rs = stmt.executeQuery();
            // 获取结果集
            while (rs.next()) {
                Integer id = rs.getInt("id");
                String userName = rs.getString("user_name");
                String realName = rs.getString("real_name");
                String password = rs.getString("password");
                Integer did = rs.getInt("d_id");
                user.setId(id);
                user.setUserName(userName);
                user.setRealName(realName);
                user.setPassword(password);
                user.setDId(did);

                System.out.println(user);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

    /**
     * 通过JDBC实现添加用户信息的操作
     */
    public void addUser(){
        Connection conn = null;
        Statement stmt = null;
        try {
            // 注册 JDBC 驱动
            // Class.forName("com.mysql.cj.jdbc.Driver");

            // 打开连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatisdb?characterEncoding=utf-8&serverTimezone=UTC", "root", "123456");
            // 执行查询
            stmt = conn.createStatement();
            String sql = "INSERT INTO T_USER(user_name,real_name,password,age,d_id)values('wangwu','王五','111',22,1001)";
            int i = stmt.executeUpdate(sql);
            System.out.println("影响的行数:" + i);
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

    public void addUser1(){
        Connection conn = null;
        Statement stmt = null;
        try {
            // 注册 JDBC 驱动
            // Class.forName("com.mysql.cj.jdbc.Driver");
            // 关闭自动提交
            conn.setAutoCommit(false);
            // 打开连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatisdb?characterEncoding=utf-8&serverTimezone=UTC", "root", "123456");
            // 执行查询
            stmt = conn.createStatement();
            String sql = "INSERT INTO T_USER(user_name,real_name,password,age,d_id)values('wangwu','王五','111',22,1001)";
            int i = stmt.executeUpdate(sql);
            // 再做一个数据的删除操作
            // .....
            System.out.println("影响的行数:" + i);
            conn.commit(); // 手动的提交
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                conn.rollback(); // 显示的回滚
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
