package dev.harddrillstudio.jakubons.states;

import dev.harddrillstudio.jakubons.Handler;
import dev.harddrillstudio.jakubons.entities.EntityManager;
import dev.harddrillstudio.jakubons.gfx.ImageLoader;

import java.awt.*;
import java.awt.image.BufferedImage;

public class GameState extends State {

    private BufferedImage upArrow;

    // entities
    EntityManager entityManager;


    public GameState(Handler handler) {
        super(handler);

        entityManager = new EntityManager(handler);

        upArrow = ImageLoader.loadImage("res/textures/upArrow.png");
    }

    @Override
    public void tick() {
        entityManager.tick();
    }

    @Override
    public void render(Graphics2D g) {
        entityManager.render(g);

        g.drawString("COGS OF TIME HAVE MOVED", 100, 100);
        g.drawString("GameState", 0, 20);

        g.drawImage(upArrow, 600, 200, 64, 64, null);

        g.setColor(Color.BLACK);
        g.fillRect(728, 20, 48,48);
        g.fillRect(728, 88, 48,48);
        g.fillRect(728, 156, 48,48);
        g.fillRect(728, 222, 48,48);
        g.fillRect(728, 288, 48,48);
        g.fillRect(728, 354, 48,48);
        g.fillRect(728, 420, 48,48);
    }
}
