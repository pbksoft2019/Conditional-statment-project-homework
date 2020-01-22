import java.util.Scanner;

class findNumberSymbolAlphabet { // class created to find out users input is digit, alphabet of spacial character
    public static void main(String args[])//main method
    {   Scanner scanner=new Scanner(System.in); // method to get users input
        System.out.println("please enter any character");// statement for asking user to put their input
        char input =scanner.next().charAt(0);//store value of users input
        if((input>=48 && input<=57) || input == 45)// method to find input is digit
        { System.out.print("Entered character is Digit"); } // result to display if input is digit
        else if((input>='a' && input<='z')||(input>='A' && input<='Z'))// method to find input is alphabet
        { System.out.print("Entered character is Alphabet"); }// result to display if input is alphabet
        else { System.out.print("Entered character is special character"); // result for any spacial character
             } } }