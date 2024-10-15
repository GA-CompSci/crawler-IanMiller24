package main;
import java.util.Scanner;
import main.monsters.Monster;
import main.monsters.Zombie;

public class Runner {
    private static int level = 1;
    public static void main(String[] args){
        //Set up key variables
        boolean gameOver = false;
        Scanner input = new Scanner(System.in);
        
        //print a welcome message to the user
        System.out.println("Welcome to Ian Miller's Gloriously Mindful Monster Game!");

        //game loop
        while(!gameOver){
            printMenu();
            String choice = input.nextLine();

            Monster m = generateMonster();

            if(choice.equalsIgnoreCase("q")){
                gameOver = true;
            } else if(choice.equalsIgnoreCase("a")){

            } else if(choice.equalsIgnoreCase("h")){
                //if in the same folder, no import
                Player.heal(level);
            }else{
                System.out.println("Invalid choice. Try again");
            }
        }

        //goodbye message

        input.close();
    }

    public static Monster generateMonster(){
        int minHit = 1 + level;
        int maxHit = 5 + level;
        int health = 10 + level;
        

    }
    
    public static void printMenu() {
        System.out.println("You're now on level " + level);
        System.out.println("Your health is " + Player.health);
        System.out.println("Press q to quit.");
        System.out.println("Press a to attack.");
        System.out.println("Press h to heal.");
        System.out.print("\nSELECTION:");
    }

}
