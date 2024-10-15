package main.monsters;
import main.Player;

public class Zombie extends Monster {
    public Zombie(int h, int l, int min, int max, String n){
        super(h, l, min, max, n);
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