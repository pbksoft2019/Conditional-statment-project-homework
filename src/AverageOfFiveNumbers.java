import java.util.Scanner;
//7. WAP input any five number and then find average of five numbers
public class AverageOfFiveNumbers {
    public static void main(String[] args) { //Main method
        Scanner sc = new Scanner( System.in );//input from user
        System.out.println("Enter First Number"); //first input from user
        int firstNumber = sc.nextInt();// store first input
        System.out.println("Enter Second Number");//second input from user
        int secondNumber = sc.nextInt();// store second input
        System.out.println("Enter Third Number"); //third input from user
        int thirdNumber = sc.nextInt(); //store third input
        System.out.println("Enter forth Number");//forth input from user
        int forthNumber = sc.nextInt();// store forth input
        System.out.println("Enter fifth Number");//fifth input from user
        int fifthNumber = sc.nextInt(); // store fifth input
        double average = (fifthNumber+secondNumber+thirdNumber+forthNumber+fifthNumber)/(5);//method to to find average of five input
        System.out.println(average);// print result
    } }