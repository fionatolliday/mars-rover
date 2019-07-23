package rover;

import enums.Command;
import enums.Direction;

import java.util.List;

public class RoverEngine {

    private RoverPosition changeRoverFacingDirectionToLeft(RoverPosition currentRoverPosition) {
        switch (currentRoverPosition.getFacingDirection()) {
            case NORTH:
                return new RoverPosition(currentRoverPosition.getPositionX(),
                        currentRoverPosition.getPositionY(), Direction.WEST);

            case EAST:
                return new RoverPosition(currentRoverPosition.getPositionX(),
                        currentRoverPosition.getPositionY(), Direction.NORTH);

            case SOUTH:
                return new RoverPosition(currentRoverPosition.getPositionX(),
                        currentRoverPosition.getPositionY(), Direction.EAST);

            case WEST:
                return new RoverPosition(currentRoverPosition.getPositionX(),
                        currentRoverPosition.getPositionY(), Direction.SOUTH);

            default:
                throw new IllegalArgumentException("Invalid facing direction");
        }
    }

    private RoverPosition changeRoverFacingDirectionToRight(RoverPosition currentRoverPosition) {
        switch (currentRoverPosition.getFacingDirection()) {
            case NORTH:
                return new RoverPosition(currentRoverPosition.getPositionX(),
                        currentRoverPosition.getPositionY(), Direction.EAST);

            case EAST:
                return new RoverPosition(currentRoverPosition.getPositionX(),
                        currentRoverPosition.getPositionY(), Direction.SOUTH);

            case SOUTH:
                return new RoverPosition(currentRoverPosition.getPositionX(),
                        currentRoverPosition.getPositionY(), Direction.WEST);

            case WEST:
                return new RoverPosition(currentRoverPosition.getPositionX(),
                        currentRoverPosition.getPositionY(), Direction.NORTH);

            default:
                throw new IllegalArgumentException("Invalid facing direction");
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


    public boolean isThereAnObstacle(List<List<String>> planetMap, int positionX, int positionY) {
        return planetMap.get(positionX).get(positionY).equals("X");
    }


    public RoverPosition run(Command command, List<List<String>> planetMap, int positionX, int positionY,
                             Direction facingDirection) {

        RoverPosition currentRoverPosition = new RoverPosition(positionX, positionY, facingDirection);

        switch (command) {
            case LEFT:
                return changeRoverFacingDirectionToLeft(currentRoverPosition);

            case RIGHT:
                return changeRoverFacingDirectionToRight(currentRoverPosition);

            case BACKWARDS:
                return moveRoverBackward(currentRoverPosition, planetMap);

            case FORWARDS:
                return moveRoverForward(currentRoverPosition, planetMap);

            default:
                throw new IllegalArgumentException("Invalid command");
        }

    }
}
