import java.util.Scanner;

public class ScannerInput {
    
    public static void main(String args[]){

        Scanner keyboardInput = new Scanner(System.in);  //Creates a scanner to read input from the keyboard

        String Name = "That's not a valid input";  //Creates a string to be used for the name

        System.out.println("What is your name?\n");  //Asks the User for their name

        if(keyboardInput.hasNextLine() == true) Name = keyboardInput.nextLine();  //Reads the keyboard input for the name

            System.out.println("\nNice to meet you " + Name + "!\n");  //Greets the User by name

        int Age = 0;  //Creates an int for the age with a default of 0

        System.out.println("How old are you?\n");  //Asks the User for their age

        if(keyboardInput.hasNextInt() == true) Age = keyboardInput.nextInt();  //Reads the keyboard input for the age

        if(Age > 0){  //Checks if the age is above zero
            System.out.println("\n" + Age + " is a good age.");
        }
        else{  //if the age is equal to or below zero it prints this message
            System.out.println("\nI don't think that's how that works\n");
        }

        Float Money = (float) 1.1;  //Creates a float to be used for the money value

        System.out.println("\nHow much money would you pay for a box of macaroni?\n");

        if(keyboardInput.hasNextFloat() == true) Money = keyboardInput.nextFloat();  //Reads the keyboard input for the amount of money

        if(Money < 0){  //Prints a message if the amount of money is below zero
            System.out.println("\nSo... Would the macaroni pay you?");
        }
        else if(Money > 10){  //Prints a message if the amount of money is above ten dollars
            System.out.println("\nWow, that's a lot of money for macaroni.");
        }
        else{  //Prints a message if the amount of money is in-between zero and ten dollars
            System.out.println("\nI think that $" + Money + " is fair.");
        }

        keyboardInput.close();  //Closes the scanner for the keyboard input

       
    }
}
