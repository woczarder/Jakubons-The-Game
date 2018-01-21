public class Player extends Creature{

    int expToAdvance = (int)((this.lvl*this.lvl) / 0.04);

    public Player(String name) {
        this.name = name;
        maxHealth = health = 20;
    }

    private void lvlUp() {
        this.maxHealth += Math.round((this.lvl*this.lvl)/4 + 4);
        this.lvl++;
    }

    public void check_lvl() {
        while (exp >= expToAdvance) {
            lvlUp();
            expToAdvance = (int)((this.lvl*this.lvl) / 0.04);
        }
    }

    public void printStats() {
        System.out.println("LVL: " + lvl + " Exp: " + exp + "/" + expToAdvance);
        System.out.println("Health: " + health + "/" + maxHealth);
    }

}
