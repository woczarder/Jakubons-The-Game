package dev.harddrillstudio.jakubons;

import dev.harddrillstudio.jakubons.display.Display;

public class Game {

    private Display display;

    private final int width = 800, height = 480;

    public Game() {
        init();
    }

    private void init() {
        /* Create display */
        display = new Display(width, height);
    }

}
