import java.util.Scanner;

public class percentageAndGrade { // class created for students mark sheet
    // WAP to input student name, roll no, 3 subjects marks..and find out total, percentage and result if he is
    // pass or fail on basis of percentage (pass>=35) and also give them grade >= 80 A+, >= 60 A, >= 50 B, >= 35 C
    public static void main(String[] args) { // main method
    Scanner sc = new Scanner( System.in ); // method to get users input
    System.out.print("Enter name "); //statement asking user to enter name
    String name = sc.nextLine(); // store value for name
    System.out.print("Enter roll number "); //statement asking user to enter roll number
    int rollNo = sc.nextInt(); // store value for roll number
    System.out.println("Enter 3 subjects marks "); //statement asking user to enter 3 subjects marks
    System.out.print("Maths marks are "); // statement asking user to enter maths marks
    int maths = sc.nextInt(); // store value for maths marks
        System.out.print("English's marks are "); //statement asking user to enter english marks
    int english = sc.nextInt(); // store value for english marks
        System.out.print("science marks are "); //statement asking user to enter science marks
    int science = sc.nextInt(); // store value for science marks
        System.out.print("Total marks are ");// total marks
    int total = maths + science + english;//addition of all 3 subjects marks
    System.out.println(total);// print total marks
    double percentage =(total/300.0)*100;// calculate percentage
    System.out.println("Percentage " +percentage);// print value of percentage
    if (percentage>=35) { // condition for pass
        System.out.println(name+" is Passed");  } //message if student is pass
    else System.out.println(name+" is Failed"); //message if student is fail
    if (percentage>=80){ // condition for Grade A+
        System.out.println("Grade is A+");} // print result if grade is A+
    else if(percentage>=60){ // condition for Grade A
        System.out.println("Grade is A");} // print result if grade is A
    else if(percentage>=50){ // condition for Grade B
        System.out.println("Grade is B");} // print result if grade is B
    else if(percentage>=35){ // condition for Grade C
        System.out.println("Grade is C");} // print result if grade is C
    else System.out.println("No grade"); // print result if no grade
        }
    }

