package main.monsters;
//connects to monsters folder

//subclasses required to make an instance of one of these
public abstract class Monster {
    //encapsulated variables
    private int health;
    private int levelModifier;
    private int minDamage;
    private int maxDamage;
    private String name;

    //OVERLOADED CONSTRUCTORS
    //blank constructor
    public Monster(){
        health = 100;
        levelModifier = 1;
        minDamage = 1;
        maxDamage = 10;
        name = "monster";
    }

    //constructor
    public Monster(int h, int l, int min, int max, String n){
        health = h;
        levelModifier = l;
        minDamage = min;
        maxDamage = max;
        name = n;
    }

    //health modifier
    public void setHealth(int health){
        //this. is instance; health is local
        this.health = health;
    }

    //accessors
    public int getHealth() {
        return health;
    }

    public int getLevelModifier() {
        return levelModifier;
    }

    public int getDamage() {
        return (int) (Math.random() * (maxDamage - minDamage) + minDamage);
    }

    public boolean isDead(){
        return health <= 0;
    }

    //abstract promises
    //if you're going to be a monster, you must have these methods
    public abstract void attack();
    public abstract void taunt();
}