import java.util.ArrayList;
import java.util.List;

public class Rover {

    private int positionX;
    private int positionY;
    private Direction facingDirection;
    private List<List<String>> currentMap;
    private RoverEngine roverEngine;


    public Rover(RoverEngine roverEngine) {
        this.roverEngine = roverEngine;

    }

    public void landRover(List<List<String>> map, int positionX, int positionY,
                        Direction facingDirection) {
        if (positionX > map.size() - 1 || map.get(0).size() - 1 < positionY) {
            throw new IllegalArgumentException("Rover position is out of bounds");

        } else if (facingDirection != Direction.NORTH && facingDirection != Direction.SOUTH && facingDirection != Direction.EAST && facingDirection != Direction.WEST) {
            throw new IllegalArgumentException("Facing direction is not valid");

        } else if (map.get(positionX).get(positionY).equals("X")) {
            throw new IllegalArgumentException("Obstacle detected. Rover cannot be dropped here.");
        }

        this.currentMap = map;
        this.positionX = positionX;
        this.positionY = positionY;
        this.facingDirection = facingDirection;

        System.out.println("Rover has landed on Mars at position " + getPosition() +
                ". \n");
    }

    public String getPosition() {
        String position = "";
        position += positionX + ",";
        position += positionY + ",";
        position += facingDirection;
        return position;
    }



    public void moveRover(List<Command> commands) {

        List<String> roversJourney = new ArrayList<>();

        for (Command command : commands){
            roverEngine.run(command, currentMap, positionX, positionY, facingDirection);

            String position = "";
            position += positionX + ",";
            position += positionY + ",";
            position += facingDirection;

            roversJourney.add(position);
            }

        System.out.println("Rover travelled through " + "coordinates  " + roversJourney + ".");
        }

}

//            if (isThereAnObstacle(positionX, positionY)) {
//                System.out.println("Can no longer move. Obstacle " +
//                        "detected at position " + positionX + "," + positionY + ".");
