import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SongQueue {

    public static void main(String[] args){

        String SongName = "";
        Scanner scanner = new Scanner(System.in);
        Queue<String> Queue = new LinkedList<>();
        boolean AddSong = true;
        String choice = "";

        
        System.out.println("\nTo demonstrate Queues, this project will create a fake music queue similar to what you would use on a streaming service.");
        System.out.println("\nTo start off, add three songs to the queue:");
        System.out.println("\n\nSong 1:\n");

        if(scanner.hasNextLine() == true) SongName = scanner.nextLine();

        Queue.add(SongName);


        System.out.println("\n\nSong 2:\n");

        if(scanner.hasNextLine() == true) SongName = scanner.nextLine();

        Queue.add(SongName);


        System.out.println("\n\nSong 3:\n");

        if(scanner.hasNextLine() == true) SongName = scanner.nextLine();

        Queue.add(SongName);


        while (AddSong == true){

            System.out.println("\n\nIf you would like to add another song to the queue, enter 1.");
            System.out.println("If you would like to stop now and see the order, enter 2\n");

            if(scanner.hasNextLine() == true) choice = scanner.nextLine();

            if(Integer.parseInt(choice) == 1){

                System.out.println("\n\nSong Name:\n");
                if(scanner.hasNextLine() == true) SongName = scanner.nextLine();
                Queue.add(SongName);
                AddSong = true;
            }

            else if(Integer.parseInt(choice) == 2){

                AddSong = false;
            }
        }



        int Size = Queue.size();

        System.out.println("\n\n\n");
        System.out.println("You're songs would play in this order from top to bottom:\n");

            for(int i = 0; i < Size; i++){

                System.out.println(Queue.poll());

            }
        
    }
    
}
