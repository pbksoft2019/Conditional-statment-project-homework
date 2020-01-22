import java.util.Scanner;

public class UpperCaseToLowerCase { //class created to swap upper case to lower case
    //12. Input any alphabet in uppercase and print it in lowercase
    public static void main(String[] args) { //MAIN METHOD
        Scanner sc = new Scanner( System.in ); //method to get input from user
        System.out.print("Enter any character in UPPERCASE "); // statement asking user to enter any alphabet in UPPERCASE
        String a = sc.next();// store users input
        System.out.println("result of Uppercase to lowercase will be "+a.toLowerCase()); // method and result to print

    } }
