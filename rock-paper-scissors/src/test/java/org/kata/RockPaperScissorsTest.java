package org.kata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class RockPaperScissorsTest {

    Shape aRock = new Rock();
    Shape aPaper = new Paper();
    Shape aScissors = new Scissors();

    @Test
    public void rock_should_win_scissors() {
        // Then
        assertThat(aRock.winsAgainst(aScissors), is(true));
    }

    @Test
    public void rock_should_not_win_paper() {
        assertThat(aRock.winsAgainst(aPaper), is(false));
    }

    @Test
    public void rock_should_not_win_rock() {
        assertThat(aRock.winsAgainst(aRock), is(false));
    }

    @Test
    public void paper_should_win_rock() {
        // Then
        assertThat(aPaper.winsAgainst(aRock), is(true));
    }

    @Test
    public void paper_should_not_win_scissors() {
        assertThat(aPaper.winsAgainst(aScissors), is(false));
    }

    @Test
    public void paper_should_not_win_paper() {
        assertThat(aPaper.winsAgainst(aPaper), is(false));
    }

    @Test
    public void scissors_should_win_paper() {
        // Then
        assertThat(aScissors.winsAgainst(aPaper), is(true));
    }

    @Test
    public void scissors_should_not_win_rock() {
        assertThat(aScissors.winsAgainst(aRock), is(false));
    }

    @Test
    public void scissors_should_not_win_scissors() {
        assertThat(aScissors.winsAgainst(aScissors), is(false));
    }

    //TODO Next: Stage 3
    //Add Spock and Lizard to the equation
}
