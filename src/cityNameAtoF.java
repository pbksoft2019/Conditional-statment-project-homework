import java.util.Scanner;

public class cityNameAtoF {
    //Input any alphabet from a to f and print their city name accordingly (use if else) any other
    // alphabet should be invalid entry
    public static void main(String[] args) {//main method
        Scanner sc =new Scanner( System.in ); // method for getting input from user
        System.out.println("enter first letter of city from A to F");// input from user
        String city=sc.next();//store value of user input
        System.out.print("name of city is ");//description for result
        switch (city){//using switch method
            case "a"://first case for letter a
                System.out.println("Ahmadabad");// city name ahmadabad if user types A
                break; // break if match with first case
            case "b": //second case for letter b
                System.out.println("Birmingham");//if usr types B city name will be Birmingham
                break;// break if match with second case
            case "c": //third case for letter C
                System.out.println("Chennai"); // if user types C then city name is Chennai
                break; //break if match with third case
            case"d"://forth case for letter D
                System.out.println("Delhi"); //if user types D then city name will be Delhi
                break;//break if match with forth case
            case"e": //fifth case for letter E
                System.out.println("El Monte");// if usr types E then city name is El Monte
                break;// break if condition match with fifth case
            case"f": // sixth case
                System.out.println("Fargo");  // if user types F then city name is Fargo
                break;// break if condition match with sixth case
            default: // default if user types any other letter apart from A to F, its invalid entry
                System.out.println("invalid entry");// message for invalid entry

        }} }


