import java.util.Scanner;

public class oddEven { // class created to find entered number is odd or even
    public static void main(String[] args) { //main method
        Scanner sc = new Scanner(System.in); //method to get users input for any number
        System.out.print("Enter a number: "); //statement asking user to enter number
        int a = sc.nextInt();//store value for first input
        String evenOdd = (a % 2 == 0) ? "even number" : "odd number"; // method to find odd or even number by turnery operator
        System.out.println(a + " is " + evenOdd); // result for first input

        System.out.print("Enter another number: "); // statement asking user to enter another number
        int b = sc.nextInt(); // store value for users second input
        String evenOdd2 = (b % 2 == 0) ? "even number" : "odd number"; // method to find odd or even number by turnery operator
        System.out.println(b + " is " + evenOdd2); // result for second input
    } }
