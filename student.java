import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class student {
    
    public static void main(String args[])
    throws IOException{
        
        String name = "Name";
        String year = "Year";
        String school = "School";

        Path txtFile = Path.of("/Users/Hiram Silva/Downloads/student.txt");

        Scanner Answer = new Scanner(System.in);

        System.out.println("What is your name?\n");

        if(Answer.hasNextLine() == true) name = Answer.nextLine();

        Files.writeString(txtFile, "\nHello " + name + "!");


        System.out.println("\nWhat year are you in high school? (ie: Freshmen, Sophomore...)\n");

        if(Answer.hasNextLine() == true) year = Answer.nextLine();

        Files.writeString(txtFile, "\nYou are a " + year + ", and you go to ", StandardOpenOption.APPEND);


        System.out.println("\nWhat school do you go to?\n");

        if(Answer.hasNextLine() == true) school = Answer.nextLine();

        Files.writeString(txtFile, school + ".", StandardOpenOption.APPEND);


        String file_content = Files.readString(txtFile);

        System.out.println("\nYour File Reads: \n");
        System.out.println(file_content);
    }
}
