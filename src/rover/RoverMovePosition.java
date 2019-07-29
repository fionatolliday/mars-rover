package rover;

import enums.Command;
import enums.Direction;

import java.util.List;

public class RoverMovePosition {

    public RoverPosition moveRoverPosition(Command movement,
                                           RoverPosition currentRoverPosition, List<List<String>> planetMap) {
        switch (movement) {
            case FORWARDS:
                return moveRoverForward(currentRoverPosition, planetMap);

            case BACKWARDS:
                return moveRoverBackward(currentRoverPosition, planetMap);

            default:
                throw new IllegalArgumentException("Unrecognized movement");
        }
    }


    private RoverPosition moveRoverBackward(RoverPosition currentRoverPosition
            , List<List<String>> planetMap) {

        int newPositionX = currentRoverPosition.getPositionX();
        int newPositionY = currentRoverPosition.getPositionY();
        int factor;

        switch (currentRoverPosition.getFacingDirection()) {
            case NORTH:
            case SOUTH:
                if (currentRoverPosition.getFacingDirection() == Direction.NORTH) {
                    factor = 1;
                } else {
                    factor = -1;
                }

                newPositionX = getNextPosition(planetMap,
                        currentRoverPosition.getPositionX() + factor);
                break;

            case EAST:
            case WEST:
                if(currentRoverPosition.getFacingDirection() == Direction.EAST){
                    factor = -1;
                } else {
                    factor = 1;
                }
                newPositionY = getNextPosition(planetMap, currentRoverPosition.getPositionY() + factor);
                break;

        }
        return new RoverPosition(newPositionX, newPositionY, currentRoverPosition.getFacingDirection());
    }


    private RoverPosition moveRoverForward(RoverPosition currentRoverPosition,
                                           List<List<String>> planetMap) {

        int newPositionX = currentRoverPosition.getPositionX();
        int newPositionY = currentRoverPosition.getPositionY();
        int factor;

        switch (currentRoverPosition.getFacingDirection()) {
            case NORTH:
            case SOUTH:
                if (currentRoverPosition.getFacingDirection() == Direction.NORTH) {
                    factor = -1;
                } else {
                    factor = 1;
                }
                newPositionX = getNextPosition(planetMap, currentRoverPosition.getPositionX() + factor);
                break;

            case EAST:
            case WEST:
                if (currentRoverPosition.getFacingDirection() == Direction.EAST){
                    factor = 1;
                } else {
                    factor = -1;
                }
                newPositionY = getNextPosition(planetMap, currentRoverPosition.getPositionY() + factor);
                break;
        }
        return new RoverPosition(newPositionX, newPositionY, currentRoverPosition.getFacingDirection());
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
