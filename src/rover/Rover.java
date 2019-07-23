package rover;
import enums.Command;
import java.util.ArrayList;
import java.util.List;

public class Rover {

    private List<List<String>> currentMap;
    private RoverEngine roverEngine;
    private RoverPosition roverPosition;


    public Rover(RoverEngine roverEngine) {
        this.roverEngine = roverEngine;
    }


    public RoverPosition landRover(List<List<String>> planetMap, RoverPosition landingPosition) {

        if (areLandingCoordinatesOutOfBounds(planetMap, landingPosition)) {
            throw new IllegalArgumentException("Rover position is out of bounds");
        }

        if (roverEngine.isThereAnObstacle(planetMap, landingPosition.getPositionX(),
                landingPosition.getPositionY())){
            throw new IllegalArgumentException("Obstacle detected. Rover cannot be dropped here.");
        }

        System.out.println("Rover has landed on planet.Mars at position " + landingPosition +
                ". \n");

        this.currentMap = planetMap;
        this.roverPosition = landingPosition;
        return landingPosition;
    }

    private boolean areLandingCoordinatesOutOfBounds(List<List<String>> planetMap, RoverPosition landingPosition){
        return landingPosition.getPositionX() > planetMap.size() - 1 || planetMap.get(0).size() - 1 < landingPosition.getPositionY();
    }


    public void moveRover(List<Command> commands) {

        List<String> roversJourney = new ArrayList<>();

        for (Command command : commands) {

            RoverPosition nextPosition = roverEngine.run(command, currentMap, roverPosition.getPositionX(),
                    roverPosition.getPositionY(), roverPosition.getFacingDirection());

            if (!roverEngine.isThereAnObstacle(currentMap, nextPosition.getPositionX(),
                    nextPosition.getPositionY())) {

                roverPosition = nextPosition;
                roversJourney.add(nextPosition.toString());

            } else System.out.println("Can no longer move. Obstacle " +
                    "detected at position " + nextPosition.getPositionX() + "," + nextPosition.getPositionY() + "," + nextPosition.getFacingDirection() + ".");
        }

        System.out.println("Rover travelled through coordinates   " + roversJourney + ".");
    }

}

