import java.util.ArrayList;
import java.util.List;

public class Rover {

    private List<List<String>> currentMap;
    private RoverEngine roverEngine;
    private RoverPosition roverPosition;


    public Rover(RoverEngine roverEngine) {
        this.roverEngine = roverEngine;
    }


    public RoverPosition landRover(List<List<String>> map, RoverPosition landingPosition) {
        this.currentMap = map;
        this.roverPosition = landingPosition;
        return landingPosition;
    }


    public void exceptionsForLandingRover(List<List<String>> map, RoverPosition landingPosition) {

        if (landingPosition.getPositionX() > map.size() - 1 || map.get(0).size() - 1 < landingPosition.getPositionY()) {
            throw new IllegalArgumentException("Rover position is out of bounds");

        } else if (landingPosition.getFacingDirection() != Direction.NORTH && landingPosition.getFacingDirection() != Direction.SOUTH && landingPosition.getFacingDirection() != Direction.EAST && landingPosition.getFacingDirection() != Direction.WEST) {
            throw new IllegalArgumentException("Facing direction is not valid");

        } else if (map.get(landingPosition.getPositionX()).get(landingPosition.getPositionY()).equals("X")) {
            throw new IllegalArgumentException("Obstacle detected. Rover cannot be dropped here.");
        }
    }


    public void moveRover(List<Command> commands) {

        List<String> roversJourney = new ArrayList<>();

        for (Command command : commands) {

            RoverPosition commandPosition = roverEngine.run(command, currentMap, roverPosition.getPositionX(),
                    roverPosition.getPositionY(), roverPosition.getFacingDirection());

            if (!roverEngine.isThereAnObstacle(currentMap, commandPosition.getPositionX(),
                    commandPosition.getPositionY())) {

                roversJourney.add(commandPosition.toString());

            } else System.out.println("Can no longer move. Obstacle " +
                    "detected at position " + roverPosition.getPositionX() + "," + roverPosition.getPositionY() + "," + roverPosition.getFacingDirection() + ".");
        }

        System.out.println("Rover travelled through coordinates   " + roversJourney + ".");
    }

}

