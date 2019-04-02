package Encapsulation;

public class Player {
    private String name;
    private int hitPoints = 100; //default value
    private String weapon;  //public because i have reason

    public Player(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 200) {
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitPoints -= damage;
        if (this.hitPoints <= 0)
            System.out.println("player knocked out");
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int healthRemaining() {
        return this.hitPoints;
    }
}
