package Day_5_Student_Management_Redo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Student [] studentArray = new Student[100];

    public static Student getStudentInfo() throws IOException{
        System.out.println("Enter details for a new student: ");
        System.out.print("Name: ");
        String name = br.readLine();

        int[] marks = new int[6];

        System.out.println("Enter marks for 6 subjects(or less,defaults to 0) : ");

        for(int i=0;i<6;i++){
            System.out.print("Subject "+ (i+1)+" : ");
            int mark = Integer.parseInt(br.readLine());
            marks[i] = mark;
        }

        System.out.print("Enter address 1: ");
        String address1 = br.readLine();
        System.out.print("Enter address 2: ");
        String address2 = br.readLine();

        Student student;
        if (address2.isEmpty()){
            student = new Student(name,marks,address1);
        }else{
            student = new Student(name,marks,address1,address2);
        }

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
        System.out.println(" ");
        System.out.println("All Students: ");


        for(int i = 0; i< Student.getStudentCount(); i++){
            studentArray[i].display();
        }
        MeanMarks();
        System.out.println(" ");
        highestGPA();

    }
    public static void MeanMarks(){
        double [] meanMarks = new double [6];
        int studentCount = Student.getStudentCount();

        for(int i=0; i<studentCount;i++){
            int[] marks = studentArray[i].getMarks();
            for(int j=0; j<marks.length; j++){
                meanMarks[j] += marks[j];
            }
        }
        System.out.println("Mean Marks: ");
        for(int i=0; i<meanMarks.length;i++){
            meanMarks[i] /= studentCount;
            System.out.println("Subject "+(i+1)+" : "+ meanMarks[i]);
        }
    }

    public static void highestGPA(){
        Student topStudent = studentArray[0];
        double highestGPA = topStudent.calculateGPA();

        for(int i=1; i<Student.getStudentCount();i++){
            double currentGPA = studentArray[i].calculateGPA();
            if(currentGPA>highestGPA){
                topStudent = studentArray[i];
                highestGPA = currentGPA;
            }
        }
        System.out.println("Student with the highest GPA: ");
        topStudent.display();
    }
}
