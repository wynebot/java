package com.fuse.kata.feature;

/**
 * Created by fuse1 on 20.09.17.
 */
public interface Moveable {
    String left();

    String right();

    int move(int kmh);

    default int moveFactor2(int kmh) {

        return move(kmh) * 2;
    }

}
