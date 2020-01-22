import java.util.Scanner;

public class positiveOrNegativeOrZero { //class created to find out entered number is positive negative or Zero
    public static void main(String[] args) { //main method
        Scanner sc = new Scanner( System.in ); // method to get input from user
        System.out.print("Please enter number "); //statement asking user to enter any number
        int num = sc.nextInt(); // store users input
        if (num == 0)// condition if given number is zero
            System.out.println( "Given number is Zero" ); // print result if input is zero
        else if (num>0) // condition for positive number
            System.out.println("Given Number is positive");// print result if input is positive number
        else System.out.println("Given number is negative"); // print result if input is negative number
    }}
