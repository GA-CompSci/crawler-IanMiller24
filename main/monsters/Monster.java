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
    private boolean fastAttack;

    //OVERLOADED CONSTRUCTORS
    //blank constructor
    public Monster(){
        health = 100;
        levelModifier = 1;
        minDamage = 1;
        maxDamage = 10;
        name = "monster";
        fastAttack = false;
    }

    //constructor
    public Monster(int h, int l, int min, int max, String n, boolean fast){
        health = h;
        levelModifier = l;
        minDamage = min;
        maxDamage = max;
        name = n;
        fastAttack = fast;
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

    public boolean getFastAttack(){
        return fastAttack;
    }

    public boolean isDead(){
        return health <= 0;
    }

    public String getStatus(){
        return name + " (lvl " + levelModifier + ") - " + health + " hp";
    }

    public String getName(){
        return name;
    }

    //abstract promises
    //if you're going to be a monster, you must have these methods
    public abstract void attack();
    public abstract void taunt();
}