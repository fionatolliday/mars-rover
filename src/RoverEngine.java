import java.util.List;

public class RoverEngine {

    private RoverPosition changeRoverFacingDirectionToLeft(RoverPosition oldRoverPosition) {
        switch (oldRoverPosition.getFacingDirection()) {
            case NORTH:
                return new RoverPosition(oldRoverPosition.getPositionX(),
                        oldRoverPosition.getPositionY(), Direction.WEST);

            case EAST:
                return new RoverPosition(oldRoverPosition.getPositionX(),
                        oldRoverPosition.getPositionY(), Direction.NORTH);

            case SOUTH:
                return new RoverPosition(oldRoverPosition.getPositionX(),
                        oldRoverPosition.getPositionY(), Direction.EAST);

            case WEST:
                return new RoverPosition(oldRoverPosition.getPositionX(),
                        oldRoverPosition.getPositionY(), Direction.SOUTH);

            default:
                throw new IllegalArgumentException("Invalid facing direction");
        }
    }

    private RoverPosition changeRoverFacingDirectionToRight(RoverPosition oldRoverPosition) {
        switch (oldRoverPosition.getFacingDirection()) {
            case NORTH:
                return new RoverPosition(oldRoverPosition.getPositionX(),
                        oldRoverPosition.getPositionY(), Direction.EAST);

            case EAST:
                return new RoverPosition(oldRoverPosition.getPositionX(),
                        oldRoverPosition.getPositionY(), Direction.SOUTH);

            case SOUTH:
                return new RoverPosition(oldRoverPosition.getPositionX(),
                        oldRoverPosition.getPositionY(), Direction.WEST);

            case WEST:
                return new RoverPosition(oldRoverPosition.getPositionX(),
                        oldRoverPosition.getPositionY(), Direction.NORTH);

            default:
                throw new IllegalArgumentException("Invalid facing direction");
        }

    }


    private RoverPosition moveRoverBackward(RoverPosition oldRoverPosition
            , List<List<String>> map) {
        int newPositionX = oldRoverPosition.getPositionX();
        int newPositionY = oldRoverPosition.getPositionY();


        switch (oldRoverPosition.getFacingDirection()) {
            case NORTH:
                newPositionX = oldRoverPosition.getPositionY() + 1;
                newPositionX = getNextPosition(map, newPositionX);
                break;

            case SOUTH:
                newPositionX -= 1;
                newPositionX = getNextPosition(map, newPositionX);
                break;

            case EAST:
                newPositionY -= 1;
                newPositionY = getNextPosition(map, newPositionY);
                break;

            case WEST:
                newPositionY += 1;
                newPositionY = getNextPosition(map, newPositionY);
                break;

        }
        return new RoverPosition(newPositionX, newPositionY, oldRoverPosition.getFacingDirection());
    }

    private RoverPosition moveRoverForward(RoverPosition oldRoverPosition,
                                           List<List<String>> map) {

        int newPositionX = oldRoverPosition.getPositionX();
        int newPositionY = oldRoverPosition.getPositionY();

        switch (oldRoverPosition.getFacingDirection()) {
            case NORTH:
                newPositionX -= 1;
                newPositionX = getNextPosition(map, newPositionX);
                break;

            case SOUTH:
                newPositionX += 1;
                newPositionX = getNextPosition(map, newPositionX);
                break;

            case EAST:
                newPositionY += 1;
                newPositionY = getNextPosition(map, newPositionY);
                break;

            case WEST:
                newPositionY -= 1;
                newPositionY = getNextPosition(map, newPositionY);
                break;
        }
        return new RoverPosition(newPositionX, newPositionY, oldRoverPosition.getFacingDirection());
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
        RoverPosition oldRoverPosition = new RoverPosition(positionX, positionY, facingDirection);


        switch (command) {
            case LEFT:
                return changeRoverFacingDirectionToLeft(oldRoverPosition);

            case RIGHT:
                return changeRoverFacingDirectionToRight(oldRoverPosition);

            case BACKWARDS:
                return moveRoverBackward(oldRoverPosition,map);

            case FORWARDS:
                return moveRoverForward(oldRoverPosition, map);

            default:
                throw new IllegalArgumentException("Invalid command");
        }

    }
}
