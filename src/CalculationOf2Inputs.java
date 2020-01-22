import java.util.Scanner;

public class CalculationOf2Inputs {// class created for calculation for 2 inputs
    //WAP to input enter any two number and ask user to enter their symbol (+, -, /, *) find addition,
    //subtraction, multiplication and division according to their symbol (using if else)
    public static void main(String[] args) {//main method
        Scanner sc= new Scanner( System.in ); // method to get input from user
        System.out.println("Enter first Number");// message for user to enter first input
        double a = sc.nextDouble();//store first input from usr
        System.out.println("Enter second Number");// message for user to input second input
        double b = sc.nextDouble();// store second input
        System.out.println("select symbol form(+, -, *, /)");//message for user to enter symbol
        String symbol=sc.next(); //store symbol input
        int result;//int result declared to reuse
        switch (symbol){ // using switch method
        case"+": result= (int) (a+b);  // method for addition
            System.out.println("Addition is " +result); //printing result for addition
            break;
            case "-": result=(int)(a-b); // method for subtraction
                System.out.println("subtraction is " +result);// printing result for subtraction
                break;
            case "*": result=(int)(a*b); // multiplication method
                System.out.println("Multiplication is" +result);// printing result for multiplication
                break;
            case "/": result=(int)(a/b);// method for division
                System.out.println("Division is");// printing result for division
                break;
            default:
                System.out.println("invalid symbol");// message for invalid entry
    }}}
