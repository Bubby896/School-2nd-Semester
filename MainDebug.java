import java.util.concurrent.TimeUnit;
import java.util.Scanner;

/*
Error filled file created by
Kimg@techtrepacademy.com
for my java class to learn troubleshooting on
*/
public class MainDebug {
    public static void main(String args[]) throws InterruptedException{

        boolean Debug = true;
        Scanner scanner = new Scanner(System.in);
        int debug = 1;

        System.out.println("Enter 1 if you want to activate debug log, Enter 0 if you want to disable debug log.");

        if(scanner.hasNextLine() == true) debug = Integer.parseInt(scanner.nextLine());

        if(debug == 1){

            System.out.println("Debug log has been enabled\n\n");
        }
        else{
            Debug = false;
            System.out.println("Program will continue without debug log\n\n");
        }

        TimeUnit.SECONDS.sleep(2);

    System.out.println("Hello everybody!");
    System.out.println("Am I doing this correctly?\n");

    for (int i=0;i<10;i++){
        System.out.println("The number i is " + i);

        
    if (Debug){

        System.out.println("\n\nThe value of i is: " + i + "\n\n");

    }
    }

    for (int i=0; i < 10; i++){
        System.out.println("\nThe new number i is " + i);

        if (i == 0){
            System.out.println("i is equal to zero");
    
        }else {
            System.out.println("i is not equal to zero");
    
        }

        if (Debug) {

            System.out.println("\n\nThe value of i is: " + i + "\n\n");

        }
    }

}
}
    //I put the debug after the use of every variable since these are the valued that may need to be changed to recieve the wanted output
