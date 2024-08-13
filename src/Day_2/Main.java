package Day_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.IOException;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Employee [] employeeArray = new Employee[100];
        int employeeCount = 0;
        String flag;

        do{
            System.out.print("Enter Employee Name: ");
            String name = br.readLine();
            System.out.print("Enter Employee Age: ");
            int age = Integer.parseInt(br.readLine());
            System.out.print("Enter Employee Address: ");
            String address = br.readLine();

            Employee emp = new Employee();
            emp.name = name;
            emp.age = age;
            emp.address = address;

            employeeArray[employeeCount] = emp;
            employeeCount++;

            System.out.print("Do you want to add new employee? yes/no :");
            flag = br.readLine();
        }while(flag.equalsIgnoreCase("yes"));
        System.out.println("Employee Information");
        for(int i=0; i<employeeCount;i++){
            employeeArray[i].display();
        }
    }

}
