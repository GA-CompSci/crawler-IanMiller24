package main;
public class Player {
    //static variables -- LEFT TOTALLY PUBLIC
    public static int health = 100;
    
    
    public static void heal(int currentLevel){
        int heal = (int) (Math.random() * 6) + 5;
        heal -= (int) (currentLevel * 0.5);
        if(heal > 0){
            health += heal;
            System.out.println("You healed " + heal + " health");
            System.out.println("Your health is now " + health);
        } else {
            System.out.println("Heal failed");
        }
    }

    /**
     * takeDamage subtracts damage from the player's health
     * prints damage before the new health is shown in the menu
     * @param damage the amount of damage to subtract from the player's health
     */

    public static void takeDamage(int damage){
        health -= damage;
        System.out.println("You took " + damage + " damage");
    }
}