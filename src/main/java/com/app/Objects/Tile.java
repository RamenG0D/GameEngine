package com.app.Objects;

import java.awt.Graphics;
import java.awt.Image;

import com.app.helper.GameObject;

public class Tile implements GameObject {
    private Image texture;
    private int id;
    private int x;
    private int y;
    //
    public Tile(int x, int y, int id) {
        this.id = id;
        this.x = x;
        this.y = y;
    }
    //
    public Tile(int x, int y, int id, Image texture) {
        this.texture = texture;
        this.id = id;
        this.x = x*;
        this.y = y;
    }
    /**
     * @return int return the x
     */
    public int getX() {
        return x;
    }
    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }
    /**
     * @return int return the y
     */
    public int getY() {
        return y;
    }
    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    /**
     * @return the tiles texture
     */
    public Image getTexture() {
        return texture;
    }
    /**
     * @return the tiles id
     */
    public int getId() {
        return id;
    }
    //
    public void setTexture(Image texture) {
        this.texture = texture;
    }
    //
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public void paint(Graphics g) {
        //
        g.drawImage(texture, x, y, null);
        //
    }
    @Override
    public void update(float delta) {
        //
    }
}
