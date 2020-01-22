import java.util.Scanner;

public class interchangeValue { //method created to interchange 2 inputs from user
    public static void main(String[] args) { // main method
        int a, b; // declared 2 variable
        Scanner sc = new Scanner( System.in );// method to get users first input
        System.out.println("Enter first number"); // statement asking user to input first value
        a = sc.nextInt(); // store first value as a
        System.out.println("Enter second number"); // statement asking user to input second value
        b = sc.nextInt(); //store second value
        a= a+b; // addition of first and second input
        b= a-b;
        a=a-b;
        System.out.println("Result of interchange value will be "); // statement for result
        System.out.print("First number is "); // statement for first input after interchange
        System.out.println(a); // value after interchange
        System.out.println("and ");
        System.out.print("Second number is "); // statement for second input after interchange
        System.out.println(b); // value of second input after interchange
    }}

