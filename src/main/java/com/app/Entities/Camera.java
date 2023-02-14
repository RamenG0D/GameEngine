package com.app.Entities;

import javax.swing.JComponent;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

public class Camera extends JPanel {
    private JComponent panel;
    private int x;
    private int y;
    //
    public Camera() {
        //
        this.setSize(720, 600);
        this.setBackground(Color.BLACK);
        //
    }
    //
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //
        draw(g);
    }
    public void draw(Graphics g) {
        if(panel == null) return;
        setPosition(-x, -y);
        setClip(g);
        panel.paint(g);
        //
    }
    /**
     * @return JComponent return the panel
     */
    public JComponent getPanel() {
        return panel;
    }
    /**
     * @param panel the panel to set
     */
    public void setPanel(JComponent panel) {
        this.panel = panel;
    }
    //
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /**
     * @return int return the x
     */
    public int getX() {
        return x;
    }
    /**
     * sets the cameras cliping bounds all things outside it will not be rendered
     */
    public void setClip(Graphics g) {
        g.setClip(-x, -y, 720, 600);
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
}
