package org.kata

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RoverTest {

    @Test
    fun `it can move forward when facing North`() {
        val rover = Rover(facingDirection = Direction.NORTH)

        rover.receiveCommands("F")

        assertThat(rover.position).isEqualTo(Position(1, 2))
    }

    @Test
    fun `it can move forward when facing East`() {
        val rover = Rover(facingDirection = Direction.EAST)

        rover.receiveCommands("F")

        assertThat(rover.position).isEqualTo(Position(2, 1))
    }

    @Test
    fun `it can move forward 2 steps when facing East`() {
        val rover = Rover(facingDirection = Direction.EAST)

        rover.receiveCommands("FF")

        assertThat(rover.position).isEqualTo(Position(3, 1))
    }

    @Test
    fun `it can move forward when facing South`() {
        val rover = Rover(position = Position(3, 2), facingDirection = Direction.SOUTH)

        rover.receiveCommands("F")

        assertThat(rover.position).isEqualTo(Position(3, 1))
    }

}
