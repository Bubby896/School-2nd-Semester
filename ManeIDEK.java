import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ManeIDEK {
    public static void main(String args[])
        throws IOException, InterruptedException {

        Scanner DataInput = new Scanner(System.in);

        Path txtFile = Path.of("/Users/Hiram Silva/Downloads/User 1-5's information.txt");

        String Name = "Jerry (Default)";
        String Age = "0";
        String FavoriteColor = "Blue (Default)";
        String FavoriteSong = "Mambo No. 5 (Default)";
        String LastMovie = "Inception (Default)";
        String Data[] = {"", "", "", "", ""};
        String UserInput = "Default";

        String Input[] = {"What is your name?", "How old are you?", "What's your favorite color?", "What is your favorite song?", "What's the last movie you watched?"};

        Files.writeString(txtFile, "");

        for(int i= 0; i < 5; i++){

            System.out.println("\n" + "User " + (i+1) + "'s Questions: \n");

            for(int b = 0; b < Data.length; b++){

                System.out.println( "\n" + Input[b] + "\n");

                if(DataInput.hasNextLine() == true) UserInput = DataInput.nextLine();

                Data[b] = UserInput;


            }

            Name = Data[0];
            Age = Data[1];
            FavoriteColor = Data[2];
            FavoriteSong = Data[3];
            LastMovie = Data[4];

            Files.writeString(txtFile, "\n" + "\nUser " + (i+1) + "'s Name: " + Name + "\n", StandardOpenOption.APPEND);
            Files.writeString(txtFile, "User " + (i+1) + "'s Age: " + Age + "\n", StandardOpenOption.APPEND);
            Files.writeString(txtFile, "User " + (i+1) + "'s Favorite Color: " + FavoriteColor + "\n", StandardOpenOption.APPEND);
            Files.writeString(txtFile, "User " + (i+1) + "'s Favorite Song: " + FavoriteSong + "\n", StandardOpenOption.APPEND);
            Files.writeString(txtFile, "The Last Movie User " + (i+1) + " Watched: " + LastMovie + "\n", StandardOpenOption.APPEND);


        }

        String File_Content = Files.readString(txtFile);

        TimeUnit.SECONDS.sleep(1);

        System.out.println("\nThis information has been added to a file in your Downloads folder that reads: \n" + File_Content);


    }
    
}
