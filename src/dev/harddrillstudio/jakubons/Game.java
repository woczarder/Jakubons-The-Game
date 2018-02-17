package dev.harddrillstudio.jakubons;

import dev.harddrillstudio.jakubons.display.Display;
import dev.harddrillstudio.jakubons.states.GameState;
import dev.harddrillstudio.jakubons.states.State;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class Game {

    private Display display;

    private final int width = 800, height = 480;

    // Graphics stuff
    private BufferStrategy bs;
    private Graphics2D g2;

    //States
    public State gameState;
    //public State menuState;

    // Handler
    private Handler handler;

    public Game() {
        init();

        /* Game Loop */
        int fps = 60, ticks = 0;
        double timePerTick = 1000000000 / fps;
        double delta = 0;
        long now, timer = 0;
        long lastTime = System.nanoTime();

        // Loop itself
        while(true){
            now = System.nanoTime();
            delta += (now - lastTime) / timePerTick;
            timer += now - lastTime;
            lastTime = now;

            if(delta >= 1){

                tick();
                render();

                Toolkit.getDefaultToolkit().sync(); // For Linux
                ticks++;
                delta--;
            }

            if(timer >= 1000000000){
                System.out.println("Ticks and Frames: " + ticks);
                ticks = 0;
                timer = 0;
            }
        }


    }

    private void init() {
        /* Create display */
        display = new Display(width, height);

        /* Set handler */
        handler = new Handler(this);

        /* States */
        gameState = new GameState(handler);
        State.setState(gameState);
    }


    private void tick() {

        if (State.getState() != null)
            State.getState().tick();

    }


    private void render() {
        bs = display.getCanvas().getBufferStrategy();
        if (bs == null) {
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        g2 = (Graphics2D) bs.getDrawGraphics();

        // Clear Screen
        g2.clearRect(0, 0, width, height);

        // Draw Here, my gay!

        g2.setColor(Color.GRAY);
        g2.fillRect(0,0, width, height);
        g2.setColor(Color.WHITE);

        if (State.getState() != null)
            State.getState().render(g2);

        // End Drawing!
        bs.show();
        g2.dispose();
    }



    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}