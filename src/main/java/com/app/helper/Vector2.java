package com.app.helper;

/**
 * The class responsible for controlling most, if not all velocity based movement
 * @author RamenGOD
 */
public class Vector2 {
    public int x;
    public int y;
    //
    /**
     *  creates a new Vector at (0, 0) with an accessable values such as x, and y
     */
    public Vector2() {}
    /**
     *  creates a new Vector at the inputed (x, y) with an accessable values such as x, and y
     */
    public Vector2(int x, int y) {
        //
        this.x = x;
        this.y = y;
        //
    }
    //
    public void add(int x, int y) {
        this.x += x;
        this.y += y;
    }
    /**
     * set the min and max value of this vector
     * @param min the minimum value this vector can be set to
     * @param max the maximum value this vector can be set to
     */
    public void clamp(int min, int max) {
        //
        if(x > max) { Math.min(x, max); System.out.println("tests failed" + "1 " + x); }
        else if(y > max) { Math.min(y, max); System.out.println("tests failed" + "2 " + y); }
        else if(x < min) { Math.max(x, min); System.out.println("tests failed" + "3 " + x); }
        else if(y < min) { Math.max(y, min); System.out.println("tests failed" + "4 " + y); }
        //
    }
    //
}