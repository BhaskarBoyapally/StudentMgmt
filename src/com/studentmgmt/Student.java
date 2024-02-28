package com.studentmgmt;

public class Student {
    private int StudentId;
    private String studentName;
    private String studentCity;
    private String studentPhone;

    @Override
    public String toString() {
        return "com.Student{" +
                "StudentId=" + StudentId +
                ", studentName='" + studentName + '\'' +
                ", studentCity='" + studentCity + '\'' +
                ", studentPhone='" + studentPhone + '\'' +
                '}';
    }

    public Student(int studentId, String studentName, String studentCity, String studentPhone) {
        super();
        this.StudentId = studentId;
        this.studentName = studentName;
        this.studentCity = studentCity;
        this.studentPhone = studentPhone;
    }

    public Student(String studentName, String studentCity, String studentPhone) {
        super();
        this.studentName = studentName;
        this.studentCity = studentCity;
        this.studentPhone = studentPhone;
    }
    public Student(){
        super();
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public int getStudentId() {
        return StudentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

}
