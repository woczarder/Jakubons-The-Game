package dev.harddrillstudio.jakubons.entities;

import dev.harddrillstudio.jakubons.Handler;

import java.awt.*;

public abstract class Entity {

    protected Handler handler;
    protected int x, y;


    public Entity(Handler handler, int x, int y) {
        this.handler = handler;
        this.x = x;
        this.y = y;
    }

    public abstract void tick();
    public abstract void render(Graphics2D g);

}
