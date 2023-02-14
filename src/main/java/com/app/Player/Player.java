package com.app.Player;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JComponent;

import com.app.Objects.Tile;
import com.app.Scenes.Scene;
import com.app.helper.Entity;
import com.app.helper.Vector2;

import java.awt.Image;

public class Player extends JComponent implements Entity {
    private Vector2 velocity = new Vector2();
    private double health;
    private Image img;
    public int x;
    public int y;
    //
    public Player(int x, int y, double health, Image PlayerSprite) {
        //
        this.health = health;
        this.x = x;
        this.y = y;
        this.img = PlayerSprite;
        //
    }
    //
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //
        g.drawImage(img, x, y, null);
        //
    }
    //
    public Vector2 getVelocity() {
        return velocity;
    }
    //
    @Override
    public int getX() {
        return x;
    }
    //
    @Override
    public int getY() {
        return y;
    }
    //
	@Override
	public boolean isHostile() {
		return false;
	}
    //
	@Override
	public double getHealth() {
		return health;
	}
    //
	@Override
	public void setHealth(double health) {
		this.health += health;
	}
    //
    public boolean isColliding(Scene currentScene) {
        for(Tile tile : currentScene.getTiles()) {
            if(tile.getId() != 0 /* checks the tile to make sure it not air */) {
                //
                if(x + velocity.x == tile.getX() || x + velocity.x == tile.getY()) { 
                    System.out.println("Collision was detected!");
                    return true;
                }
                //
            }
            //
        }
        System.out.println("no Collision detected");
        return false;
    }
    //
    public void continueMoving() {
        //
        if (velocity.x > 0) {
            velocity.add(-1, 0);
            x += velocity.x;
        } else if (velocity.x < 0) {
            velocity.add(1, 0);
            x -= velocity.x;
        }
        //
    }
    //
    @Override
    public void gravity() {
        velocity.add(0, gravity);
        this.y += gravity * speed;
    }
    //
    @Override
    public void update(float delta) {
        //
        continueMoving();
        //
    }
}