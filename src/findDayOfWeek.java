import java.util.Scanner;

public class findDayOfWeek { // created class for Find out day of the week from users inputs number
    public static void main(String[] args) {// main method
        Scanner sc =new Scanner( System.in ); //method to get users input
        System.out.println("Enter any number from 1 to 7 to find Day of week");// statement for user to ask for their input from number 1 to 7
        int dayOfWeekNumber=sc.nextInt();// store value of users input
        switch (dayOfWeekNumber){ // using switch statement to find out day of the week
            case 1 :// case 1 for monday
                System.out.println("First day of the week is Monday");// first day of week is monday
                break;// break if condition match with first statement
            case 2:// second case for tuesday
                System.out.println("Second day of the week is Tuesday");// second day of week is tuesday
                break;// break if condition match with second case
            case 3:// third case for Wednesday
                System.out.println("Third day of week is Wednesday");// third day of the week is Wednesday
                break;// break if condition match with third case
            case 4: //forth case
                System.out.println("Forth day of week is Thursday");// forth day of week is Thursday
                break;// break if condition match with forth case
            case 5: //fifth case for friday
                System.out.println("Fifth day of the week is Friday");// fifth day of week is friday
                break; //break if condition match with fifth case
            case 6://sixth case for Saturday
                System.out.println("Sixth day of week is Saturday");// if users input is 6 then its Saturday
                break; //break if condition match with sixth case
            case 7: // seventh case for Sunday
                System.out.println("Seventh day of week is Sunday");// if users input is 7 then its Sunday
                break;// break if inputs match with seventh case
            default:// if users input is anything apart from 1 to 7 is invalid input
                System.out.println("invalid entry"); //message for invalid input
        } } }
