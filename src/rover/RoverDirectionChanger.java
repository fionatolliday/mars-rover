package rover;
import enums.Command;

public class RoverDirectionChanger {

    public RoverPosition changeRoverFacingDirectionTo(Command turningDirection,
                                                      RoverPosition currentRoverPosition)
    {
        switch (turningDirection){
            case LEFT:
                return new RoverPosition(currentRoverPosition.getPositionX(),
                        currentRoverPosition.getPositionY(),
                        currentRoverPosition.getFacingDirection().getLeft());

            case RIGHT:
                return new RoverPosition(currentRoverPosition.getPositionX(),
                        currentRoverPosition.getPositionY(),
                        currentRoverPosition.getFacingDirection().getRight());

            default:
                throw new IllegalArgumentException("Unrecognized direction");
        }
    }

}

