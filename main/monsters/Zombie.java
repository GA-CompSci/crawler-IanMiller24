package main.monsters;
import main.Player;

public class Zombie extends Monster {
    public Zombie(int h, int l, int min, int max){
        super(h, l, min, max, "Zombie", false);

        //WE MUST ANNOUNCE THE MONSTER
        System.out.println("Is that your ex-wife?!?!  Oh, it's only a Zombie");
    }

    //not static because individual zombie
    public void attack(){
        System.out.println("The zombie throws a pamphlet at you and cries");
        Player.takeDamage(getDamage());
    }

    public void taunt(){
        System.out.println("The zombie yells: I doubt that you have bathed");
    }

}