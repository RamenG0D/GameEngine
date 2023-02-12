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
        this.setBackground(Color.BLUE);
        //
        panel = new testPanel();
        this.add(panel);
        //
    }
    //
    class testPanel extends JComponent {
        //
        public testPanel() {
            this.setSize(720, 600);
            this.setBackground(Color.BLACK);
        }
        //
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            //
            draw(g);
        }
        //
        public void draw(Graphics g) {
            //
            g.setColor(Color.RED);
            g.fillRect(0, 0, 400, 400);
            //
        }
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
        g.translate(x, y);
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
}
