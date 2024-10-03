package monsters;
//connects to monsters folder

public abstract class Monster {
    //encapsulated variables
    private int health;
    private int levelModifier;
    private int minDamage;
    private int maxDamage;
    private String name;

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
}