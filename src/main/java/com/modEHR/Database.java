package com.modEHR;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

  private static volatile Database db;

  private Database() {
    this.getConn();
    this.getStmt();
    this.crypto = AESCrypto.getInstance();
  }

  private AESCrypto crypto;
  private Connection conn;
  private Statement stmt;

  public Connection getConn() {
    try {
      if (conn == null || conn.isClosed()) {
        final String JDBC_DRIVER = "org.h2.Driver";
        final String DB_URL = "jdbc:h2:./res/";

        final String USER = "";
        final String PASS = "";

        conn = DriverManager.getConnection(DB_URL, USER, PASS);
      }
    } catch (SQLException e) {
      System.out.println("Failed to create connection: " + e.getMessage());
    }
    return conn;
  }

  public Statement getStmt() {
    try {
      if (stmt == null || stmt.isClosed()) {
        stmt = conn.createStatement();
      }
    } catch (SQLException e) {
      System.out.println("Failed to create statement: " + e.getMessage());
    }
    return stmt;
  }

  public static Database getInstance() {
    if (db == null) {
      synchronized (Database.class) {
        if (db == null) {
          db = new Database();
        }
      }

    }
    return db;
  }
}
