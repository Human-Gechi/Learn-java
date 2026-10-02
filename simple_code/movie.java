package simple_code;
import  java.util.Scanner;
public class movie {

    // Simple movie price calculator
    public static void main(String[] args) {

        String name;
        int age;
        boolean isStudent;
        double basePrice = 10000;
        double finalPrice;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Are you a student? (true/false): ");
        isStudent = scanner.nextBoolean();

        if(age < 5){
            finalPrice = 0.0;
        }
       
        else if (age < 13){
            finalPrice = basePrice * 0.5;
        }
        
        else if (age >= 60){
            finalPrice = basePrice * 0.7;
        }

        else if (isStudent){
            finalPrice = basePrice * 0.8;
        }

        else{
            finalPrice = basePrice;
        }

        System.out.println("Hi " + name + " your ticket would cost " + finalPrice + " naira");
        scanner.close();

    }
}
