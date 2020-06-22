package org.kata;

public class Paper implements Shape{

    @Override
    public boolean winsAgainst(Shape aShape) {
        return aShape instanceof Rock;
    }
}
