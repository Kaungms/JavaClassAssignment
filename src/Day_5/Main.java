package Day_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Student [] studentArray = new Student[100];


    public static Student getStudentInfo() throws IOException {
        System.out.print("Enter Student Name: ");
        String name = br.readLine();
        System.out.print("Enter Student Nickname: ");
        String nickname = br.readLine();
        System.out.print("Enter Address 1: ");
        String address1 = br.readLine();
        System.out.print("Enter Address 2: ");
        String address2 = br.readLine();

        int[] marks = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Subject " + (i + 1) + " : ");
            int mark = Integer.parseInt(br.readLine());
            marks[i] = mark;
        }
        Student student;
        if (address2.isEmpty()) {
            student = new Student(name,nickname,address1,marks);

        }else {
            student = new Student(name,nickname,address1,address2,marks);

        }
        student.display();


        return student;
    }


    public static void main(String[] args) throws IOException {


        String flag;

        do {
            Student student = getStudentInfo();
            studentArray[Student.getStudentCount()-1] = student;
            System.out.print("Do you want to add new student? yes/no: ");
            flag = br.readLine();

        }while(flag.equalsIgnoreCase("yes"));

        for(int i=0; i<Student.getStudentCount();i++){
            studentArray[i].display();
        }
        display();





    }

    public static void display(){
        System.out.println("Mean Mark: " + Student.getMeanMark());
        System.out.println("Total Students: "+Student.getStudentCount());

    }
}
