package com.fuse.kata.feature;

/**
 * Created by fuse1 on 20.09.17.
 */
public class Vehicle implements Moveable {
    @Override
    public String left() {
        return "turn left";
    }

    @Override
    public String right() {
        return "turn right";
    }

    @Override
    public int move(int kmh) {
        return kmh;
    }
}
