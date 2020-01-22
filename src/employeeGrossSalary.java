import java.util.Scanner;

public class employeeGrossSalary { // method for find out employee's gross salary
    //WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
    //HRA = basic salary 10%, DA = Basic salary 8%, TA = Basic salary 9%, PF= Basic salary 20%
    //Gross salary = basic salary + HRA + TA + DA -PF
    public static void main(String[] args) {// main method

        Scanner sc = new Scanner( System.in );//method to get input from user
        System.out.println("enter Employee ID");//statement for asking user to insert employee id
        int employeeId=sc.nextInt(); //store value for employee id
        System.out.println("Enter Employee Name"); // statement for asking user to insert name
        String name=sc.next(); //store value for employee name
        System.out.println("Enter Basic Salary");//statement for asking user to insert basic salary
        double basicSalary = sc.nextDouble(); // store value for basic salary
        System.out.print(name + "'s HRA is ");
        double HRA = basicSalary/100*(10);//method for calculating HRA
        System.out.println(HRA); //result value for HRA
        System.out.print(name + "'s DA is ");
        double DA = basicSalary/100*(8);// method to calculate DA
        System.out.println(DA);// result for DA
        System.out.print(name + "'s TA is ");
        double TA = basicSalary/100*(9);//method to calculate TA
        System.out.println(TA);// result for TA
        System.out.print(name + "'s PF is ");
        double PF = basicSalary/100*(20);//method for calculating PF
        System.out.println(PF); // result for PF
        double grossSalary = basicSalary+HRA+DA+TA-PF; //method to calculate Gross salary
        System.out.print(name + "'s Gross salary is ");
        System.out.println(grossSalary); // result for gross salary
    }}


