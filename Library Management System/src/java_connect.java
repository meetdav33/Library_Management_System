/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */

import java.sql.*;
import javax.swing.JOptionPane;
public class java_connect {
    Connection connect;
    
    public static Connection ConnectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection connect=DriverManager.getConnection("jdbc:sqlite:E:\\Library Management System\\Library Management System\\LibraryDatabase.sqlite");
                return connect;
        }catch(Exception e)
        {
                JOptionPane.showMessageDialog(null, e);
                        return null;
        }
}
}
