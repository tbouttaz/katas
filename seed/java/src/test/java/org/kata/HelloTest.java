package org.kata;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloTest {

    @Test
    public void should_say_hello() {
        String aString = new Hello().sayHello();
        assertThat(aString).isEqualTo("hello");
    }
}
