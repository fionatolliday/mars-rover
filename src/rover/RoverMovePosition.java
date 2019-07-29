package rover;

import enums.Command;

import java.util.List;

public class RoverMovePosition {

    public RoverPosition moveRoverPosition(Command movement,
                                                      RoverPosition currentRoverPosition, List<List<String>> planetMap)
    {
        switch (movement){
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

        switch (currentRoverPosition.getFacingDirection()) {
            case NORTH:
                newPositionX = getNextPosition(planetMap, currentRoverPosition.getPositionX() + 1);
                break;

            case SOUTH:
                newPositionX = getNextPosition(planetMap, currentRoverPosition.getPositionX() - 1);
                break;

            case EAST:
                newPositionY = getNextPosition(planetMap, currentRoverPosition.getPositionY() -1);
                break;

            case WEST:
                newPositionY = getNextPosition(planetMap, currentRoverPosition.getPositionY() + 1);
                break;

        }
        return new RoverPosition(newPositionX, newPositionY, currentRoverPosition.getFacingDirection());
    }


    private RoverPosition moveRoverForward(RoverPosition currentRoverPosition,
                                           List<List<String>> planetMap) {

        int newPositionX = currentRoverPosition.getPositionX();
        int newPositionY = currentRoverPosition.getPositionY();

        switch (currentRoverPosition.getFacingDirection()) {
            case NORTH:
                newPositionX = getNextPosition(planetMap, currentRoverPosition.getPositionX() - 1);
                break;

            case SOUTH:
                newPositionX = getNextPosition(planetMap, currentRoverPosition.getPositionX() + 1);
                break;

            case EAST:
                newPositionY = getNextPosition(planetMap, currentRoverPosition.getPositionY() + 1);
                break;

            case WEST:
                newPositionY = getNextPosition(planetMap, currentRoverPosition.getPositionY() - 1);
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
