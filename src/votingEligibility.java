import java.util.Scanner;

public class votingEligibility { // class created to check voting eligibility
    //Write Java program to allow the user to input his/her age. Then the program will show if the person is
    // eligible to vote. A person who is eligible to vote must be older than or equal to 18 years old.
    public static void main(String[] args) { //main method
        Scanner sc = new Scanner( System.in ); //method to get users input
        System.out.println("enter your Age"); //statement asking user to enter age
        int age = sc.nextInt(); // store users input
        if  (age>=18){ //condition if age is >= 18
            System.out.println("person is eligible to vote");  } // result to print if condition match
        else {System.out.println("Person is not eligible to vote"); }} } //result to print if condition don't match