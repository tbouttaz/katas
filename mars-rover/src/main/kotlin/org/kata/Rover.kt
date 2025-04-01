package org.kata

class Rover(
    var facingDirection: Direction,
    var position: Position = Position(1, 1)
) {

    fun receiveCommands(commands: String) {
        commands.forEach { command ->
            if (facingDirection == Direction.NORTH) {
                position = Position(position.x, position.y + 1)
            } else if (facingDirection == Direction.SOUTH) {
                position = Position(position.x, position.y - 1)
            } else {
                position = Position(position.x + 1, position.y)
            }
        }
    }

}
