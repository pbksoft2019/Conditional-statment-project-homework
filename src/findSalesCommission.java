import java.util.Scanner;

public class findSalesCommission { // class created to find out sales commission
   //WAP input sales id, seller's name, sales amount, salary basic and then find this sales commission
   //sales amount >= 50,000 35%, sales amount >= 30,000 20%, >= 20,000 10%, >= 10,000 5%,  < 10,000 2%
    public static void main(String[] args) { // main method
        Scanner sc = new Scanner( System.in ); // method to get users input
        System.out.println("Enter Sales ID");// print statement for user to put their input
        int salesID = sc.nextInt(); // store value for users input as sales id
        System.out.println("Enter Seller's Name");// print statement for user ti put their input
        String sellerName = sc.next();// store value of users input as sellerName
        System.out.println("Enter Sales Amount");// statement asking user to input sales amount
        double salesAmount = sc.nextDouble(); // store value for sales amount
        System.out.println("Enter Basic Salary"); // statement asking user to input basic salary
        double basicSalary = sc.nextDouble(); // store value of basic salary
        // using if else statement to calculate sales commission
        if(salesAmount>=50000){ //first condition if sales is >= 35000
            System.out.println(salesAmount/100*(35)); }// amount of commission if sales is >=35000
        else if(salesAmount>=30000){// second condition if sales is >= 30000
            System.out.println(salesAmount/100*(20)); } // amount for commission if sales is >=30000
        else if (salesAmount>=20000){ // third condition if sales amount is >= 20000
            System.out.println(salesAmount/100*(10)); } // amount of sales commission if sales is >=20000
        else if (salesAmount>=10000){ //forth condition if sales amount is >= 10000
            System.out.println(salesAmount/100* (5)); } // amount of sales commission if sales is >= 10000
        else { System.out.println(salesAmount/100*(2)); // amount of sales commission if sales is < 10000
        } } }
