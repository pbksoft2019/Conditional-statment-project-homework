import java.util.Scanner;

public class LeapYear { // class created to find out entered year is leap year or not
    public static void main(String[] args) { //main method
        //public static void isLeapYear(int a)
        {
            Scanner scanner = new Scanner( System.in ); //method to get input from user
            System.out.println( "Enter year" );// statement asking user to enter year
            int a = scanner.nextInt(); // store user input
            if ((a % 400 == 0) || (a % 4 == 0 && a % 100 != 0)) { // if else method to find whether entered year is leap year or not
                System.out.println("year " +a + "  is a leap Year" ); // print result if leap year
            } else {
                System.out.println("Year " + a + " is not a leap year" ); // print result if enterd year is not leap year
            } } } }
