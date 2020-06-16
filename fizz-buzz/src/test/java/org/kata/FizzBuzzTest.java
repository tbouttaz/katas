package org.kata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class FizzBuzzTest {

    @Test
    public void should_return_number_as_string() {
        assertThat(new FizzBuzz().convert(1), is("1"));
        assertThat(new FizzBuzz().convert(2), is("2"));
        assertThat(new FizzBuzz().convert(4), is("4"));
        assertThat(new FizzBuzz().convert(4), is("4"));
        assertThat(new FizzBuzz().convert(7), is("7"));
        assertThat(new FizzBuzz().convert(8), is("8"));
        assertThat(new FizzBuzz().convert(11), is("11"));
        assertThat(new FizzBuzz().convert(13), is("13"));
        assertThat(new FizzBuzz().convert(14), is("14"));
    }
}
