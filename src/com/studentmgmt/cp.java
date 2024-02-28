package com.studentmgmt;
import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.Driver;
public class cp {
   static Connection con;
    public static Connection creatC(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/student_manage";
        String user="root";
        String password="Password@123";
        con=DriverManager.getConnection(url, user, password);

    }
        catch (Exception e){
            e.printStackTrace();
        }
     return con;
}
}

