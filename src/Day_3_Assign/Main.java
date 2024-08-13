package Day_3_Assign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        ArrayList<Animal> animals = new ArrayList<>();
        int animalCount = 0;
        String flag;

        do{
            System.out.print("Enter animal name: ");
            String name = br.readLine();
            System.out.print("Enter animal age: ");
            int age = Integer.parseInt(br.readLine());
            System.out.print("Enter animal species: ");
            String species = br.readLine();

            Animal aml = new Animal();
            aml.name = name;
            aml.age = age;
            aml.species = species;

            animals.add(aml);
            animalCount++;

            System.out.print("Do you want to continue? yes/no: ");
            flag = br.readLine();


        } while (flag.equalsIgnoreCase("yes"));
        System.out.println("Total Animal Number: "+ animalCount);
        for (int i=0; i<animalCount;i++){
            System.out.println("Animal "+(i+1)+ " :");
            animals.get(i).display();
        }

    }
}
