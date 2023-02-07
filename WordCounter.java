import java.util.Scanner;

public class WordCounter {
    public static void main(String args[]){

        Scanner InputString = new Scanner(System.in); //Adds a new scanner

        String UserInput = "Default String"; //Creates the UserInput String and gives it a default value

        System.out.println("Please put a string here: \n "); //Requests the user for a string

        if(InputString.hasNextLine() == true) UserInput = InputString.nextLine(); //Reads the User's input

        String UserInput2 = UserInput.replace(".", ""); //Removes periods for the re-print

        String UserString = UserInput2.replace(",", ""); //Removes commas for the re-print

        String Words[] = UserString.split(" "); //Separates each words in the string and adds them to an array

        int WordCount = Words.length; //Reads how many words are in the array

        System.out.println("\nYour string reads: ");

        for(int i = 0; i < Words.length; i++){

            System.out.println(" \n" + Words[i] + " "); //Prints out each word from the string with a gap between them

        }

        System.out.println("\n Word Count : " + WordCount); //Shows the word count

        InputString.close(); //Closes the Scanner

    }
}
