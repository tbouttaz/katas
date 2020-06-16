package org.kata;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void init(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void should_return_number_as_string() {
        assertThat(fizzBuzz.convert(1), is("1"));
        assertThat(fizzBuzz.convert(2), is("2"));
        assertThat(fizzBuzz.convert(4), is("4"));
        assertThat(fizzBuzz.convert(4), is("4"));
        assertThat(fizzBuzz.convert(7), is("7"));
        assertThat(fizzBuzz.convert(8), is("8"));
        assertThat(fizzBuzz.convert(11), is("11"));
        assertThat(fizzBuzz.convert(13), is("13"));
        assertThat(fizzBuzz.convert(14), is("14"));
    }

    @Test
    public void should_return_Fizz_given_multiple_of_three() {
        assertThat(fizzBuzz.convert(3), is("Fizz"));
    }

}
