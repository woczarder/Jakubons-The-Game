public class Creature {

	public int health, maxHealth, attack, defense, exp, lvl;

    public String name = "BLANK";

    public boolean isAlive = true;


    /* attack */
    public void attackCreature(Creature target) {
        target.health = target.health - (this.attack - target.defense);
        System.out.println(this.name + " attacked " + target.name);
        System.out.println(target.name + " HP:" + target.health + "/" + target.maxHealth);
        System.out.println();

        target.checkHealth();
    }

    public void checkHealth() {
        if (health >= maxHealth)
            health = maxHealth;
        if (health <= 0)
            isAlive = false;
    }

    public void heal() {
        this.health = maxHealth;
    }

}
