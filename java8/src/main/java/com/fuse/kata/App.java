package com.fuse.kata;

import com.fuse.kata.feature.Car;
import com.fuse.kata.feature.Moveable;
import com.fuse.kata.feature.Vehicle;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        callDefault();
        //callAnonymousClass();

    }

    private static void callAnonymousClass() {
        Moveable m = new Moveable() {

            @Override
            public String left() {
                return "custom left";
            }

            @Override
            public String right() {
                return "custom right";
            }

            @Override
            public int move(int kmh) {
                return kmh;
            }
        };
        System.out.println(m.left());
        System.out.println(m.right());
        System.out.println(m.move(30));
        System.out.println(m.moveFactor2(30));


    }


    private static void callDefault(){
        Vehicle car = new Car();
        System.out.print(car.left());
        System.out.print(car.right());
        System.out.print(car.move(30));
        // Default method from interface
        System.out.print(car.moveFactor2(30));
    }
}
