package Day_5;


import java.util.Arrays;

public class Student {
    private String name;
    private String nickname;
    private String address1;
    private String address2;
    private int[] marks;
    private static int studentCount = 0;
    private static int alltotalMarks = 0;


    public Student(String name, String nickname,String address1,int[] marks){
        this.name = name;
        this.nickname = nickname;
        this.address1 = address1;
        this.marks = marks;
        studentCount++;
        alltotalMarks += this.totalMark();

    }

    public Student(String name, String nickname,String address1,String address2, int[]marks){
        this.name = name;
        this.nickname = nickname;
        this.address1 = address1;
        this.address2 = address2;
        this.marks = marks;
        studentCount++;
        alltotalMarks += this.totalMark();

    }

    private int totalMark(){
        int total = 0;
        for (int i=0; i<this.marks.length;i++){
            total = total + this.marks[i];
        }
        return total;
    }

    public static double getMeanMark(){
        double mean = alltotalMarks/studentCount;
        return mean;
    }



    public double calculateGPA(){

        int total = this.totalMark();
        double gpa = total/this.marks.length;
        return gpa;
    }

    public void display(){
        System.out.println("Student Name: "+this.name);
        System.out.println("Student NickName: "+this.nickname);
        System.out.println("Student Address 1: "+this.address1);
        System.out.println("Student Address 2: "+this.address2);
        System.out.println("Marks: "+ Arrays.toString(this.marks));
        System.out.println("Total Marks: "+this.totalMark());
        System.out.println("GPA :"+ this.calculateGPA());
    }

    public static int getStudentCount(){
        return studentCount;
    }


}
