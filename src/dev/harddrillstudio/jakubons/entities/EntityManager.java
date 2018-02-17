package dev.harddrillstudio.jakubons.entities;

import dev.harddrillstudio.jakubons.Handler;
import dev.harddrillstudio.jakubons.entities.creatures.Player;

import java.awt.*;
import java.util.ArrayList;

public class EntityManager {

    private Handler handler;

    private ArrayList<Entity> entities;

    Player player;

    public EntityManager(Handler handler) {
        this.handler = handler;
        entities = new ArrayList<Entity>();

        player = new Player(handler, 300, 300);

        System.out.println("Entity manager created!");
    }


    public void tick() {
        player.tick();
    }

    public void render(Graphics2D g) {
        player.render(g);
    }


}
