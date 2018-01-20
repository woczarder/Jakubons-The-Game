import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("LOL IM GAY");

        System.out.println("Dziki Jakub pojawia się!");

        Player player = new Player("Dominiczek");
        Enemy enemy = new Enemy("Jakub");

        Scanner input = new Scanner(System.in);

        String choice;

        while (player.isAlive && enemy.isAlive) {
            choice = input.nextLine();

            if (choice.equals("a"))
                player.attackCreature(enemy);

            enemy.attackCreature(player);
        }
    }
}
