package org.kata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class FizzBuzzTest {

    @Test
    public void should_return_number_as_string() {
        assertThat(new FizzBuzz().convert(1), is("1"));
    }
}
