package main;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;
import main.monsters.Monster;
import main.monsters.Zombie;
import main.monsters.MrAdilettasEvilTwinNamedMrBadiletta;

public class Runner {
    private static int level = 1;
    public static void main(String[] args){
        //Set up key variables
        boolean gameOver = false;
        Scanner input = new Scanner(System.in);
        
        //print a welcome message to the user
        System.out.println("Welcome to Ian Miller's Gloriously Mindful Monster Game!");

        //initial monster
        Monster m = generateMonster();

        //game loop
        while(!gameOver){

            if (m.getFastAttack()){
                m.attack();
                if(Player.health <= 0){
                    m.taunt();
                    gameOver = true;
                    break;
                }
            }
            
            printMenu(m);
            String choice = input.nextLine();

            if(choice.equalsIgnoreCase("q")){
                gameOver = true;

            } else if(choice.equalsIgnoreCase("a")){
                Player.attack(m);
                if(m.isDead()){
                    level++;
                    System.out.println("You have defeated the " + m.getName() + "!");
                    m = generateMonster();
                    continue;
                }

            } else if(choice.equalsIgnoreCase("h")){
                //if in the same folder, no import
                Player.heal(level);
                m.taunt();
            }else{
                System.out.println("Invalid choice. Try again");
            }

            if (!m.getFastAttack()){
                m.attack();
                if(Player.health <= 0){
                    m.taunt();
                    gameOver = true;
                }
            }
        }

        System.out.println("Goodbye! You made it to level " + level + "!");

        input.close();
    }

    public static Monster generateMonster() {
        // We are setting the initial stats for the monster based on the player's level
        int minHit = level;            // The minimum damage the monster can deal
        int maxHit = 5 + level;        // The maximum damage the monster can deal
        int health = 10 + level;       // The monster's health, increasing as the player levels up

        /* 
        Using a List instead of an array for Suppliers to avoid type safety issues.
        List provides better type safety with generics.
        */
        
        List<Supplier<Monster>> constructors = Arrays.asList(
            // Each lambda here is like a "blueprint" that builds a specific type of Monster when we call .get()
            () -> new Zombie(health, level, minHit, maxHit),
            // Add more monster types here as needed, following the same pattern.
            () -> new MrAdilettasEvilTwinNamedMrBadiletta(health, health, minHit, maxHit)
        );

        // Create an instance of the Random class, which helps us choose a random monster from our list
        Random random = new Random();
        
        // We randomly pick an index from the list of suppliers
        int index = random.nextInt(constructors.size());

        // We call .get() on the chosen Supplier, which finally runs the constructor for the selected monster
        return constructors.get(index).get();  

        /* 
        This method will only run the constructor for the monster after we've picked one randomly.
        This avoids unnecessary work and ensures efficiency.
        */
    }
    
    public static void printMenu(Monster m) {
        System.out.println(m.getStatus());
        System.out.println("You're now on level " + level);
        System.out.println("Your health is " + Player.health);
        System.out.println("Press q to quit.");
        System.out.println("Press a to attack.");
        System.out.println("Press h to heal.");
        System.out.print("\nSELECTION:");
    }

}
