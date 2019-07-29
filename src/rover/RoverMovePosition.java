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
                newPositionX += 1;
                newPositionX = getNextPosition(planetMap, newPositionX);
                break;

            case SOUTH:
                newPositionX -= 1;
                newPositionX = getNextPosition(planetMap, newPositionX);
                break;

            case EAST:
                newPositionY -= 1;
                newPositionY = getNextPosition(planetMap, newPositionY);
                break;

            case WEST:
                newPositionY += 1;
                newPositionY = getNextPosition(planetMap, newPositionY);
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
                newPositionX -= 1;
                newPositionX = getNextPosition(planetMap, newPositionX);
                break;

            case SOUTH:
                newPositionX += 1;
                newPositionX = getNextPosition(planetMap, newPositionX);
                break;

            case EAST:
                newPositionY += 1;
                newPositionY = getNextPosition(planetMap, newPositionY);
                break;

            case WEST:
                newPositionY -= 1;
                newPositionY = getNextPosition(planetMap, newPositionY);
                break;
        }
        return new RoverPosition(newPositionX, newPositionY, currentRoverPosition.getFacingDirection());
    }

    private int getNextPosition(List<List<String>> planetMap, int position) {
        int lowestBoundary = 0;
        int highestBoundary = planetMap.size() - 1;

        if (position > highestBoundary) {
            return lowestBoundary;
        } else if (position < lowestBoundary) {
            return highestBoundary;
        }
        return position;
    }
}
