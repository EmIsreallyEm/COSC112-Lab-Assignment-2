/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//import classes
import java.util.Scanner;

/**
 *
 * @author Instructor Base code
 */
public class SimpleInputOutput {

    public static void main(String[] args) {
        //variable declaration
        Scanner console = new Scanner(System.in);

        final int SECRET = 11;
        final double RATE = 12.50;

        int num1;
        int num2;
        int newNum;
        String name;
        double hoursWorked;
        double wages;

        //executable statements
        System.out.print("Enter the first integer: ");
        num1 = console.nextInt();

        System.out.print("Enter the second integer: ");
        num2 = console.nextInt();

        System.out.println("The value of num1 = " + num1
                + " and the value of num2 = " + num2 + ".");

        newNum = (num1 * 2) + num2;

        System.out.println("The value of newNum = " + newNum);

        newNum = newNum + SECRET;

        System.out.println("After adding SECRET, newNum = " + newNum);

        System.out.print("Enter the last name: ");
        name = console.next();

        System.out.print("Enter hours worked: ");
        hoursWorked = console.nextDouble();

        wages = RATE * hoursWorked;

        System.out.println("Name: " + name);
        System.out.println("Pay Rate: $" + RATE);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Salary: $" + wages);
    }

}