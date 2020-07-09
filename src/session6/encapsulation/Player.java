package session6.encapsulation;

public class Player {

    public String name;
    public int health;

    public void loseHealth(int damage) {
        this.health -= damage;
        if (this.health <= 0)
            System.out.println("Player knockout.");
    }

    public int remainingHealth() {
        return this.health;
    }

}
