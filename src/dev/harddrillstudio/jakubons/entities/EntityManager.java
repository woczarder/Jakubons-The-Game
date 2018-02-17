package dev.harddrillstudio.jakubons.entities;

import dev.harddrillstudio.jakubons.Handler;

import java.awt.*;
import java.util.ArrayList;

public class EntityManager {

    private Handler handler;

    private ArrayList<Entity> entities;


    public EntityManager(Handler handler) {
        this.handler = handler;
        entities = new ArrayList<Entity>();

        System.out.println("Entity manager created!");
    }


    public void tick() {

    }

    public void render(Graphics2D g) {

    }


}
