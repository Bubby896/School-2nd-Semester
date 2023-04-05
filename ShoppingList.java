import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args){

        String Vegetable = "";
        String Fruit = "";
        String Drink = "";
        String Dessert = "";
        String Snack = "";

        LinkedList list = new LinkedList();

        Scanner scanner = new Scanner(System.in);


        System.out.println("Let's make a shopping list!");


        try {
        System.out.println("\nFirst, add a vegetable:\n");
        if(scanner.hasNextLine() == true) Vegetable = scanner.nextLine();

        } catch (Exception e){
            System.out.println("\nPlease insert a valid item\n");

        }


        try {
        System.out.println("\nNow, add a fruit:\n");
        if(scanner.hasNextLine() == true) Fruit = scanner.nextLine();

        } catch (Exception e){

            System.out.println("\nPlease insert a valid item\n");
        }


        try {
        System.out.println("\nNext, add a drink:\n");
        if(scanner.hasNextLine() == true) Drink = scanner.nextLine();

        } catch (Exception e){

            System.out.println("\nPlease insert a valid item\n");
        }


        try {
        System.out.println("\nThen, add a dessert:\n");
        if(scanner.hasNextLine() == true) Dessert = scanner.nextLine();

        } catch (Exception e){

            System.out.println("\nPlease insert a valid item\n");
        }


        try {
        System.out.println("\nLastly, add a snack:\n");
        if(scanner.hasNextLine() == true) Snack = scanner.nextLine();

        } catch (Exception e){

            System.out.println("\nPlease insert a valid item\n");
        }
        

        System.out.println("\n\nYou're list consists of:\n");

        list.add(Vegetable);
        list.add(Fruit);
        list.add(Drink);
        list.add(Dessert);
        list.add(Snack);


        list.print();
    }
    
}
