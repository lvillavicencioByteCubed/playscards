package com.bytecubed.commons.models;

public class Placement {

    private int relativeX;
    private int relativeY;

    public Placement(){
        this(0,0);
    }

    public Placement(int relativeX, int relativeY ) {
        this.relativeX = relativeX;
        this.relativeY = relativeY;
    }

    public int getRelativeX() {
        return relativeX;
    }

    @Override
    public String toString() {
        return "Placement{" +
                "relativeX=" + relativeX +
                ", relativeY=" + relativeY +
                '}';
    }

    public int getRelativeY() {
        return relativeY;
    }

}
