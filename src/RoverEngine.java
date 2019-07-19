import java.util.List;

public class RoverEngine {

    private Direction changeRoverFacingDirectionToLeft(Direction currentFacingDirection) {
        switch (currentFacingDirection) {
            case NORTH:
                return Direction.WEST;

            case EAST:
                return Direction.NORTH;

            case SOUTH:
                return Direction.EAST;

            case WEST:
                return Direction.SOUTH;
        }
        return currentFacingDirection;
    }

    private Direction changeRoverFacingDirectionToRight(Direction currentFacingDirection) {
        switch (currentFacingDirection) {
            case NORTH:
                return Direction.EAST;

            case EAST:
                return Direction.SOUTH;

            case SOUTH:
                return Direction.WEST;

            case WEST:
                return Direction.NORTH;
        }
        return currentFacingDirection;
    }


    private int moveRoverBackward(Direction currentFacingDirection, int positionX, int positionY
            , List<List<String>> map) {

        switch (currentFacingDirection) {
            case NORTH:
                positionX += 1;
                positionX = getNextPosition(map, positionX);
                return positionX;

            case SOUTH:
                positionX -= 1;
                positionX = getNextPosition(map, positionX);
                return positionX;

            case EAST:
                positionY -= 1;
                positionY = getNextPosition(map, positionY);
                return positionY;

            case WEST:
                positionY += 1;
                positionY = getNextPosition(map, positionY);
                return positionY;
        }
        throw new IllegalArgumentException("Facing Direction invalid");
    }

    private int moveRoverForward(Direction currentFacingDirection, int positionX, int positionY,
                                 List<List<String>> map) {

        switch (currentFacingDirection) {
            case NORTH:
                positionX -= 1;
                positionX = getNextPosition(map, positionX);
                return positionX;

            case SOUTH:
                positionX += 1;
                positionX = getNextPosition(map, positionX);
                return positionX;

            case EAST:
                positionY += 1;
                positionY = getNextPosition(map, positionY);
                return positionY;

            case WEST:
                positionY -= 1;
                positionY = getNextPosition(map, positionY);
                return positionY;
        }
        throw new IllegalArgumentException("Facing Direction invalid");
    }

    private int getNextPosition(List<List<String>> map, int position) {
        int lowestBoundary = 0;
        int highestBoundary = map.size() - 1;

        if (position > highestBoundary) {
            return lowestBoundary;
        } else if (position < lowestBoundary) {
            return highestBoundary;
        }
        return position;
    }


    private boolean isThereAnObstacle(List<List<String>> map, int positionX, int positionY) {
        return map.get(positionX).get(positionY).equals("X");
    }


    public RoverPosition run(Command command, List<List<String>> map, int positionX, int positionY,
                             Direction facingDirection) {
// CREATE A NEW ROVERPOSITION AND RETURN IT TO ROVER

//        run should take current position, get new position. if obstacle in way, throw exception.

        if (!isThereAnObstacle(map, positionX, positionY)) {
            switch (command) {
                case LEFT:
                    changeRoverFacingDirectionToLeft(facingDirection);
                    return new RoverPosition(positionX, positionY, facingDirection);

                case RIGHT:
                    changeRoverFacingDirectionToRight(facingDirection);
                    return new RoverPosition(positionX, positionY, facingDirection);

                case BACKWARDS:
                    moveRoverBackward(facingDirection, positionX, positionY, map);
                    return new RoverPosition(positionX, positionY, facingDirection);

                case FORWARDS:
                    moveRoverForward(facingDirection, positionX, positionY, map);
                    return new RoverPosition(positionX, positionY, facingDirection);
            }
            return new RoverPosition(positionX, positionY, facingDirection);
        } else throw new IllegalArgumentException("Rover can no longer move. Obstacle ahead.");
    }
}
