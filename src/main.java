import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("LOL IM GAY");

        System.out.println("Dziki Jakub pojawia się!");

        Player player = new Player("Dominiczek");
        Enemy enemy = new Enemy("Jakub");

        Scanner input = new Scanner(System.in);

        String choice;

        while (player.isAlive) {
            choice = input.nextLine();

            if (choice.equals("a") && enemy.isAlive)
                player.attackCreature(enemy);

            if (choice.equals("d")) {
                player.exp += 10000;
                player.check_lvl();
            }

            if (choice.equals("h"))
                player.heal();

            player.printStats();
//            enemy.attackCreature(player);
        }
    }
}
