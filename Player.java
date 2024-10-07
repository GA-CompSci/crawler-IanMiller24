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
}