package com.app.Scenes;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Timer;

import com.app.Objects.Tile;
import com.app.Player.Player;
import com.app.helper.GameObject;
import com.app.helper.ImageLoader;
import javax.swing.JComponent;
import java.awt.Color;

public class Scene extends JComponent implements World {
    private List<GameObject> objects = new ArrayList<>();
    private Tile[] tiles;
    private int DELAY = 100;
    private Player player;
    
    public Scene() throws IOException {
        setup();
        //
        new Timer(DELAY, (e -> {
            //
            if(player.isColliding(this)) {
                player.getVelocity().y = 0;
            } else {
                player.gravity();
            }
        })).start();
        //
    }

    public void setup() throws IOException {
        //
        this.setBackground(Color.BLACK);
        this.setSize(720, 600);
        //
        player = new Player(0, 0, 10, new ImageLoader("assets/Red.png", 65, 100).get_image());
        //addObjectToWorld();
        this.add(player);
        //
    }
    //
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //
        for (GameObject object : objects) {
            object.paint(g);
        }
        //
        player.paint(g);
    }
    //
    public Player getPlayer() {
        return player;
    }
    //
    public void addObjectToWorld(GameObject object) {
        objects.add(object);
    }
    //
    @Override
    public Tile[][] getTiles() {
        return null;
    }
}