package org.kata;

public class FizzBuzz {
    public String convert(int number) {
        if (isMultipleOfThree(number) && isMultipleOfFive(number)) {
            return "FizzBuzz";
        } else if (isMultipleOfThree(number)) {
            return "Fizz";
        } else if (isMultipleOfFive(number)) {
            return "Buzz";
        }

        return String.valueOf(number);
    }

    private boolean isMultipleOfFive(int number) {
        return number % 5 == 0;
    }

    private boolean isMultipleOfThree(int number) {
        return number % 3 == 0;
    }
}
