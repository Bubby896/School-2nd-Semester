import java.util.Scanner;

public class ScannerInput {
    
    public static void main(String args[]){

        Scanner keyboardInput = new Scanner(System.in);

        String Name = "That's not a valid input";

        System.out.println("What is your name?\n");

        if(keyboardInput.hasNextLine() == true) Name = keyboardInput.nextLine();

            System.out.println("\nNice to meet you " + Name + "!\n");

        int Age = 0;

        System.out.println("How old are you?\n");

        if(keyboardInput.hasNextInt() == true) Age = keyboardInput.nextInt();

        if(Age > 0){
            System.out.println("\n" + Age + " is a good age.");
        }
        else{
            System.out.println("\nI don't think that's how that works\n");
        }

        Float Money = (float) 1.1;

        System.out.println("\nHow much money would you pay for a box of macaroni?\n");

        if(keyboardInput.hasNextFloat() == true) Money = keyboardInput.nextFloat();

        if(Money < 0){
            System.out.println("\nSo... Would the macaroni pay you?");
        }
        else if(Money > 10){
            System.out.println("\nWow, that's a lot of money for macaroni.");
        }
        else{
            System.out.println("\nI think that $" + Money + " is fair.");
        }

       
    }
}
