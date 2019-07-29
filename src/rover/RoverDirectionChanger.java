package rover;
import enums.Command;
import enums.Direction;

public class RoverDirectionChanger {

    public RoverPosition changeRoverFacingDirectionTo(Command turningDirection,
                                                      RoverPosition currentRoverPosition)
    {
        switch (turningDirection){
            case LEFT:
                return changeRoverFacingDirectionToLeft(currentRoverPosition);

            case RIGHT:
                return changeRoverFacingDirectionToRight(currentRoverPosition);

            default:
                throw new IllegalArgumentException("Unrecognized direction");
        }
    }

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

}

