package Day_5_Student_Management_Redo;

import java.util.Arrays;

public class Student {
    private String name;
    private String address1;
    private String address2;
    private int[] marks;
    private static int studentCount;

    public Student (String name, int[] marks,String address1){
        this.name = name;
        this.marks = marks;
        this.address1 = address1;
        studentCount++;
    }

    public Student (String name, int[] marks,String address1,String address2){
        this.name = name;
        this.marks = marks;
        this.address1 = address1;
        this.address2 = address2;
        studentCount++;
    }

    public static int getStudentCount(){
        return studentCount;
    }

    private int totalMark(){
        int total = 0;
        for(int i=0; i<this.marks.length;i++){
            total = total + this.marks[i];

        }
        return total;
    }

    public double calculateGPA() {
        int total = this.totalMark();
        double gpa = total / this.marks.length;
        return gpa;

    }

    public void display(){
        System.out.println("Name: "+this.name);
        System.out.println("Marks: "+ Arrays.toString(this.marks));
        System.out.println("GPA: "+this.calculateGPA());
        System.out.println("Address 1: "+this.address1);
        System.out.println("Address 2: "+this.address2);
        System.out.println(" ");

    }


    public int[] getMarks() {
        return marks;
    }
}
