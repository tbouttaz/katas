package org.kata;

public class Rock implements Shape {

    @Override
    public boolean winsAgainst(Shape aShape) {
        return aShape instanceof Scissors;
    }
}
