package session6.encapsulation;

public class Main {
    public static void main(String[] args) {

        Player player = new Player();
        player.name = "leo";
        player.health = 20;

        player.loseHealth(10);
        System.out.println("remaining health: " + player.remainingHealth());

    }
}
