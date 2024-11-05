package main.monsters;
import main.Player;

public class MrAdilettasEvilTwinNamedMrBadiletta extends Monster{
    
    //change base health, min/max damage, etc
    public MrAdilettasEvilTwinNamedMrBadiletta(int h, int l, int min, int max){
        super(25, l, min, max, "Mr. Adiletta's Evil Twin Named Mr. Badiletta", true);
        System.out.println("Hey, since when did Mr. A start wearing a monocle and oversized top hat? Wait, that's not Mr. A! That's his evil twin!");
    }

    public void attack(){
        //Mr. Badiletta would never use ChatGPT. Only Google Gemini is sufficiently evil for him
        System.out.println("Mr. Badiletta [insert brilliant attack idea he got from Google Gemini]");
        if(Player.health < 30){
            System.out.println("Mr. Badiletta does extra damage because you're weak!");
            Player.takeDamage(getDamage() * 2);
        } else {
            Player.takeDamage(getDamage());
        }
    }

    public void taunt(){
        System.out.println("Mr. Badiletta squeaks: Not even Udemy can teach me how to withstand your odour");
    }
}