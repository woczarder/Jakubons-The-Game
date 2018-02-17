package dev.harddrillstudio.jakubons.entities.creatures;

import dev.harddrillstudio.jakubons.Handler;
import dev.harddrillstudio.jakubons.entities.Entity;

import java.awt.*;

public class Player extends Entity {

    public Player(Handler handler, int x, int y) {
        super(handler, x, y);

        System.out.println("Player created!");
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics2D g) {
        g.fillOval(x, y, 10, 10);
    }
}
