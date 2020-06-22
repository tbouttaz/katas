package org.kata;

public class Scissors implements Shape {

    @Override
    public boolean winsAgainst(Shape aShape) {
        return aShape instanceof Paper;
    }
}
