import com.studentmgmt.Student;
import com.studentmgmt.StudentDao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws IOException, SQLException {
        System.out.println("Hello and welcome to student management app");
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            System.out.println("Press 1 to Add student");
            System.out.println("Press 2 to delete student");
            System.out.println("Press 3 to display student");
            System.out.println("Press 4 to update student info");
            System.out.println("Press 5 to exit student");
            int c= Integer.parseInt(br.readLine());
            if (c==1)
            {
                //add student
                System.out.println("Enter student name");
                String name=br.readLine();
                System.out.println("Enter City :");
                String city=br.readLine();
                System.out.println("Enter Phone :");
                String phone =br.readLine();
                Student st =new Student(name,city,phone);
                boolean answer = StudentDao.createStudent(st);
                if(answer){
                    System.out.println("student added successfully..");
                }else {
                    System.out.println("something went wrong while adding student...");
                }
            } else if (c==2) {
                //delete student
                System.out.println("Enter studentid");
                int studentid = Integer.parseInt(br.readLine());
                StudentDao.deleteStudent(studentid);
                boolean f = StudentDao.deleteStudent(studentid);
                if(f){
                    System.out.println("student deleted successfully..");
                }else {
                    System.out.println("Student Id not found or something went wrong while deleting student...");
                }
                
            } else if (c==3) {
                
                //display student
                System.out.println("Enter student id");
                int studentid=Integer.parseInt(br.readLine());
                StudentDao.getStudent(studentid);
            } else if (c==4) {
                //update student info
                System.out.println("Enter student ID to update: ");
                int studentid =Integer.parseInt(br.readLine());
                System.out.println("Enter student name");
                String name=br.readLine();
                System.out.println("Enter City :");
                String city=br.readLine();
                System.out.println("Enter Phone :");
                String phone =br.readLine();
                Student st =new Student(name,city,phone);
                StudentDao.updateStudent(studentid,st);
                boolean answer = StudentDao.updateStudent(studentid,st);
                if(answer){
                    System.out.println("student id: "+studentid+" updated successfully..");
                }else {
                    System.out.println("Student ID not found...");
                }


                
            } else if (c==5) {
                System.out.println("Thanks for using Student management app.., see you soon");
                break;
            }
        }
    }
        

       
}
