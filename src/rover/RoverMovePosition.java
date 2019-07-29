package rover;

import enums.Command;
import enums.Direction;

import java.util.List;

public class RoverMovePosition {

    public RoverPosition moveRoverPosition(Command movement,
                                           RoverPosition currentRoverPosition, List<List<String>> planetMap) {

        // Which direction are you facing?
        Direction currentFacingDirection = currentRoverPosition.getFacingDirection();

        // Which compass direction do you want to move to?
        Direction movementDirection;
        if (movement == Command.FORWARDS) movementDirection = currentFacingDirection.getFront();
        else movementDirection = currentFacingDirection.getBack();

        // Use the decision table for the movement in the compass direction
        // N: x - 1
        // E: y + 1
        // W: y - 1
        // S: x + 1
        int factor;
        switch (movementDirection) {
            case NORTH:
            case SOUTH:
                if (movementDirection == Direction.NORTH) factor = -1;
                else factor = 1;

                int newXPosition = getNextPosition(planetMap,
                        currentRoverPosition.getPositionX() + factor);
                return new RoverPosition(newXPosition, currentRoverPosition.getPositionY(),
                        currentFacingDirection);
            case EAST:
            case WEST:
                if (movementDirection == Direction.EAST) factor = 1;
                else factor = -1;

                int newYPosition = getNextPosition(planetMap,
                        currentRoverPosition.getPositionY() + factor);

                return new RoverPosition(currentRoverPosition.getPositionX(), newYPosition,
                        currentFacingDirection);
            default:
                throw new IllegalArgumentException("Invalid direction");
        }
    }

    private int getNextPosition(List<List<String>> planetMap, int position) {
        int lowestBoundary = 0;
        int highestBoundary = planetMap.size() - 1;

        if (position > highestBoundary) {
            return lowestBoundary;
        }

        if (position < lowestBoundary) {
            return highestBoundary;
        }
        return position;
    }
}
