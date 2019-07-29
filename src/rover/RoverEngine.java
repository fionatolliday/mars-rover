package rover;
import enums.Command;
import enums.Direction;
import java.util.List;

public class RoverEngine {

    private RoverDirectionChanger roverDirectionChanger;
    private RoverMovePosition roverMovePosition;

    public RoverEngine(){
        roverDirectionChanger = new RoverDirectionChanger();
        roverMovePosition = new RoverMovePosition();
    }


    public boolean isThereAnObstacle(List<List<String>> planetMap, int positionX, int positionY) {
        return planetMap.get(positionX).get(positionY).equals("X");
    }


    public RoverPosition run(Command command, List<List<String>> planetMap, int positionX, int positionY,
                             Direction facingDirection) {

        RoverPosition currentRoverPosition = new RoverPosition(positionX, positionY, facingDirection);

        switch (command) {
            case LEFT:
                return roverDirectionChanger.changeRoverFacingDirectionTo(Command.LEFT,
                        currentRoverPosition);

            case RIGHT:
                return roverDirectionChanger.changeRoverFacingDirectionTo(Command.RIGHT,
                        currentRoverPosition);

            case BACKWARDS:
                return roverMovePosition.moveRoverPosition(Command.BACKWARDS,
                        currentRoverPosition, planetMap);

            case FORWARDS:
                return roverMovePosition.moveRoverPosition(Command.FORWARDS,
                        currentRoverPosition, planetMap);

            default:
                throw new IllegalArgumentException("Invalid command");
        }

    }
}
