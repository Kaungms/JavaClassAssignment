package Week_1;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int factorial = 1;
        for(int i=1;i<=number;i++){
            factorial *=i;
        }

        System.out.println("The factorial of " +number +" is: "+ factorial);
        scanner.close();

    }
}
