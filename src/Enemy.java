public class Enemy extends Creature {

    public void setStats (int sHealthAmount, int sMaxHealthAmount, int sAttack, int sDefense, int sExp, int sLvl) {

        int health = sHealthAmount;
        maxHealth = sMaxHealthAmount;
        attack = sAttack;
        defense = sDefense;
        exp = sExp;
        lvl = sLvl;

    }

    public Enemy(String name) {
        this.name = name;
    }

}
