//William Reeve, 8-17-2023

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello to my largest of three program");


        String userName = "";
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int largest = 0;

        //prompt for new scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n please enter your username\n");
        //store username into the variable named 'userName'

        userName = scanner.nextLine();

        System.out.println("\n\n The username is \n\n" + userName);

        System.out.println(" please enter number 1");

        num1 = scanner.nextInt();

        System.out.println("You entered " + num1);

        System.out.println(" please enter number 2");

        num2 = scanner.nextInt();

        System.out.println("You entered " + num2);

        System.out.println(" please enter number 3");

        num3 = scanner.nextInt();

        System.out.println("You entered " + num3);


        //if statements

        if (num1 > num2 & num1 > num3) {
            largest = num1;
        }
        if (num2 > num1 & num2 > num3) {
            largest = num2;
        }
        if (num3 > num1 & num3 > num2) {
            largest = num3;
        }

        System.out.println("the largest number is " + largest);

    }
}