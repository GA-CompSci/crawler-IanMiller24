import java.util.Scanner;
import monsters.Monster;

public class Runner {

    public static void main(String[] args){
        //Set up key variables
        int level = 1;
        boolean gameOver = false;
        Scanner input = new Scanner(System.in);
        
        //print a welcome message to the user
        System.out.println("Welcome to Ian Miller's Gloriously Mindful Monster Game!");

        //game loop
        while(!gameOver){
            printMenu();
            String choice = input.nextLine();

            Monster m = generateMonster(level);

            if(choice.equalsIgnoreCase("q")){
                gameOver = true;
            } else if(choice.equalsIgnoreCase("a")){

            } else if(choice.equalsIgnoreCase("h")){
                Player.heal(level);
            }else{
                System.out.println("Invalid choice. Try again");
            }
        }

        //goodbye message

        input.close();
    }

    public static Monster generateMonster(int level){
        return null;
    }
    
    public static void printMenu() {
        System.out.println("Press q to quit.");
        System.out.println("Press a to attack.");
        System.out.println("Press h to heal.");
        System.out.print("\nSELECTION:");
    }

}
