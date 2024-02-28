package com.studentmgmt;


import java.sql.*;

public class StudentDao {
    public static boolean createStudent(Student st)
    {
        boolean f= false;
        try {
            Connection con = cp.creatC();
            String q = "insert into students(sname,scity,sphone) values(?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1, st.getStudentName());
            pstmt.setString(2,st.getStudentCity());
            pstmt.setString(3,st.getStudentPhone());

            pstmt.executeUpdate();
            f=true;


        } catch (Exception e) {
            e.printStackTrace();

        }
        return f;
    }

    public static boolean deleteStudent(int studentid) {
        boolean f= false;
        try {
            Connection con = cp.creatC();
            String q = "delete from students where sid=?";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setInt(1, studentid);

            pstmt.executeUpdate();
            f=true;


        } catch (Exception e) {
            e.printStackTrace();

        }
        return f;
    }

    public static void getStudent(int studentid) throws SQLException {

        try {
            Connection con =cp.creatC();
            String q= "select * from students where sid=?";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setInt(1, studentid);
            ResultSet resultSet = pstmt.executeQuery();
            if (resultSet.next()) {
                String StudentName = resultSet.getString("sname");
                String StudentCity = resultSet.getString("scity");
                String StudentPhone = resultSet.getString("sphone");

                System.out.println("Student ID: " + studentid);
                System.out.println("Student Name: " + StudentName);
                System.out.println("City: " + StudentCity);
                System.out.println("Phone: " + StudentPhone);
            } else {
                System.out.println("User not found.");
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean updateStudent(int studentid, Student st) {

        boolean f= false;
        try {
            Connection con = cp.creatC();
            String q = "update students set sname=?,scity=?,sphone=? where sid=?";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1, st.getStudentName());
            pstmt.setString(2,st.getStudentCity());
            pstmt.setString(3,st.getStudentPhone());
            pstmt.setInt(4,studentid);


            pstmt.executeUpdate();
            f=true;


        } catch (Exception e) {
            e.printStackTrace();

        }
        return f;
    }
}
