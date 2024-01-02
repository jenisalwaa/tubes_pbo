/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;
import java.sql.*;
/**
 *
 * @author aguswahyudi
 */
public class DatabaseClass {
    protected static final String DB_URL = "jdbc:mysql://localhost/qoma";
    protected static final String DB_USER ="root";
    protected static final String DB_PASS ="";
    protected static Connection con;
    protected static Statement stmt;
    protected static ResultSet rs;
}
