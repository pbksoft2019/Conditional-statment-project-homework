import java.util.Scanner;
public class vowelOrConsonant { //class created to find out entered character is vowel or Consonant

        public static void main(String[ ] arg) { // main method
            boolean isVowel=false;; // boolean statement
            Scanner sc=new Scanner(System.in); // method to get input from user
            System.out.println("Enter any letter : "); // statement asking user for input
            char letter=sc.next().charAt(0); //store value of users input
            sc.close();
            switch(letter) //switch cases for vowel character
            {
                case 'a' :
                case 'e' :
                case 'i' :
                case 'o' :
                case 'u' :
                case 'A' :
                case 'E' :
                case 'I' :
                case 'O' :
                case 'U' : isVowel = true;
            }
            if(isVowel == true) { // condition if vowel case is matching
                System.out.println("letter " + letter + "  is  a Vowel");  } // print result if vowel condition match
            else {
                if((letter>='a'&&letter<='z')||(letter>='A'&&letter<='Z'))// condition for consonant
                    System.out.println("letter " + letter +" is a Consonant"); // print result if consonant match
                else
                    System.out.println("Input is not an alphabet"); // print result for invalid entry
            }  }  }
