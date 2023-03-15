import java.util.Scanner;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class GuessTheNumber {
    public static void main(String args[])
        throws IOException, InterruptedException {

        String User1 = "";  //Creates a string to be used for the first User's name
        String User2 = "";  //Creates a string to be used for the seconds User's name
        int RandomNumber = 0;  //Creates an int for the number that will be chosen randomly
        String User1Guess = "0";  //Creates a string to be used for the first User's guess
        String User2Guess = "0";  //Creates a string to be used for the seconds User's guess
        int User1GuessNumber = 0;  //Creates an int to be used for the numerical value of User 1's guess
        int User2GuessNumber = 0;  //Creates an int to be used for the numerical value of User 2's guess
        Scanner UserNames = new Scanner(System.in);  //Creates a scanner to read keyboard input for the user names
        Scanner UserGuesses = new Scanner(System.in);  //Creates a scabber to read keyboard input for the user guesses
        Random Random = new Random(); //Creates a "Random" for getting a random number
        boolean User1AnswerValid = false;  //Creates a boolean to allow the try catch block to run later in the code
        boolean User2AnswerValid = false;  //Creates a boolean to allow the try catch block to run later in the code

        System.out.println("\nPlease input a name for User 1: \n"); 

        if(UserNames.hasNextLine() == true ) User1 = UserNames.nextLine(); //Reads the keyboard input for User 1's name

        System.out.println("\n \n \nPlease input a name for User 2\n");

        if(UserNames.hasNextLine() == true) User2 = UserNames.nextLine();  //Reads the keyboard input for User 2's name

        RandomNumber = Random.nextInt(20);  //Creates a random number from 0 - 20

        TimeUnit.SECONDS.sleep(1);  //Pauses the output for 1 second

        System.out.println("\n \nA random number from 0-20 has been chosen. See who can get the closer number.\n");

        TimeUnit.SECONDS.sleep(1);  //Pauses the output for 1 second

        while (!User1AnswerValid){  //Tells the program to execute the following code if User1AnswerValid is false

        try {  //Checks for errors in the user's input

          System.out.println(User1 + "'s Guess: \n");  //Asks for User 1's guess

          if(UserGuesses.hasNextLine() == true) User1Guess = UserGuesses.nextLine();  //Reads the keyboard input for User 1's guess
  
          User1GuessNumber = Integer.valueOf(User1Guess);  //Sets User1GuessNumber to the numerical value of the string User1Guess

          User1AnswerValid = true;  //Causes the program to not loop this code
  
        } catch (Exception e){  //This tells the program what to do if the user inputs an invalid value

          TimeUnit.SECONDS.sleep(1);  //Pauses the output for 1 second

          System.out.println("\nPlease input a valid guess\n");  //Asks the user to enter a different input

          TimeUnit.SECONDS.sleep(1);  //Pauses the output for 1 second
        }

      }

      while (!User2AnswerValid){  //Tells the program to execute the following code if User2AnswerValid is false

        try {  //Checks for errors in the user's input

          System.out.println("\n" + User2 + "'s Guess: \n");  //Asks for User 2's guess

          if(UserGuesses.hasNextLine() == true) User2Guess = UserGuesses.nextLine();  //Reads the keyboard input for User 2's guess
  
          User2GuessNumber = Integer.valueOf(User2Guess);  //Sets User2GuessNumber to the numerical value of the string User2Guess

          User2AnswerValid = true;  //Causes the program to not loop this code
  
        } catch (Exception e){  //This tells the program what to do if the user inputs an invalid value

          TimeUnit.SECONDS.sleep(1);  //Pauses the output for 1 second

          System.out.println("\nPlease input a valid guess\n");  //Asks the user to enter a different input

          TimeUnit.SECONDS.sleep(1);  //Pauses the output for 1 second
        }

      }

        TimeUnit.SECONDS.sleep(1);  //Pauses the output for 1 second

        System.out.println("\n \n" + User1 + "'s guess was: " + User1Guess);  //Prints User 1's guess

        TimeUnit.SECONDS.sleep(1);  //Pauses the output for 1 second

        System.out.println("\n" + User2 + "'s guess was: " + User2Guess);  //Prints User 2's guess

        TimeUnit.SECONDS.sleep(1);  //Pauses the output for 1 second

        System.out.println("\nThe number was " + RandomNumber + "\n");  //Prints the random number

        TimeUnit.SECONDS.sleep(1);  //Pauses the output for 1 second

        if (Math.abs(User1GuessNumber - RandomNumber) <= Math.abs(User2GuessNumber - RandomNumber)) {  //Finds which guess is closer

            System.out.println("\n" + User1 + " Wins!");  //Prints the winner

          } else {

            System.out.println("\n" + User2 + " Wins!");  //Prints the winner
          }


    }
    
}
