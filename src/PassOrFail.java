import java.util.Scanner;

public class PassOrFail { // class created to find out student pass or fail on the basis of all subject
    public static void main(String[] args) { // main method
                Scanner sc = new Scanner(System.in);// method to get input from user
                System.out.print("Enter Student Name ");//statement asking user to enter name
                String name = sc.next(); // store value for name
                System.out.print("Enter Roll Number "); // statement asking user to input roll number
                String RollNumber = sc.next(); // store value for roll number
                System.out.print("Enter Maths Marks "); // statement for asking user to enter maths marks
                int Maths = sc.nextInt(); // store value for maths marks
                System.out.print("Enter English Marks "); // statement for asking user to enter english marks
                int English = sc.nextInt(); // store value for english marks
                System.out.print("Enter Science Marks "); // statement for asking user to enter science marks
                int Science = sc.nextInt(); // store value for science marks
                System.out.print(name+ "'s Total Marks is "); //total marks
                System.out.println(Maths + English + Science); // total marks
                if (Maths < 35 || Science < 35 || English < 35) { //condition for pass
                    System.out.println(name+ " is Fail"); // result
                } else {
                    System.out.println(name+" is Pass"); // result if pass
                }}}


