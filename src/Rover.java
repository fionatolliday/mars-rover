import java.util.List;

public class Rover {

    private Rover rover;


    private int positionX;
    private int positionY;
    private char facingDirection;

    public Rover getRover() {
        return rover;
    }


    public String roversStartingPosition() {
        String startingPosition = "";
        startingPosition += positionX + ",";
        startingPosition += positionY + ",";
        startingPosition += facingDirection;
        return startingPosition;
    }

    Commands commands = new Commands();


    public char changeFacingDirectionOfRover(char command) {
        if (command == 'L' && facingDirection == 'N') {
            facingDirection = 'W';
        } else if (command == 'R' && facingDirection == 'N') {
            facingDirection = 'E';
        } else if (command == 'L' && facingDirection == 'E') {
            facingDirection = 'N';
        } else if (command == 'R' && facingDirection == 'E') {
            facingDirection = 'S';
        } else if (command == 'L' && facingDirection == 'S') {
            facingDirection = 'E';
        } else if (command == 'R' && facingDirection == 'S') {
            facingDirection = 'W';
        } else if (command == 'L' && facingDirection == 'W') {
            facingDirection = 'S';
        } else if (command == 'W' && facingDirection == 'S') {
            facingDirection = 'N';
        }
        return facingDirection;
    }


    String roverPosition = "";

    public String moveRoverBackOrForward(char command) {

        if (command == 'B' && facingDirection == 'N') {
            positionX += 1;
            if (positionX > mars.heightOfMarsX){
                positionX = 0;
                roverPosition += positionX + ",";
                roverPosition += positionY;
            } else
            roverPosition += positionX + ",";
            roverPosition += positionY;
            return roverPosition;
        } else if (command == 'F' && facingDirection == 'N') {
            positionX -= 1;
            if (positionX < mars.heightOfMarsX){
                positionX = 2;
                roverPosition += positionX + ",";
                roverPosition += positionY;
            } else
            roverPosition += positionX + ",";
            roverPosition += positionY;
            return roverPosition;
        } else if (command == 'B' && facingDirection == 'S') {
            positionX -= 1;
            if (positionX < mars.heightOfMarsX){
                positionX = 2;
                roverPosition += positionX + ",";
                roverPosition += positionY;
            } else
            roverPosition += positionX + ",";
            roverPosition += positionY;
            return roverPosition;
        } else if (command == 'F' && facingDirection == 'S') {
            positionX += 1;
            if (positionX > mars.heightOfMarsX){
                positionX = 0;
                roverPosition += positionX + ",";
                roverPosition += positionY;
            } else
            roverPosition += positionX + ",";
            roverPosition += positionY;
            return roverPosition;
        } else if (command == 'B' && facingDirection == 'E') {
            positionY -= 1;
            if (positionY < mars.widthOfMarsY){
                positionY = 2;
                roverPosition += positionX + ",";
                roverPosition += positionY;
            } else
            roverPosition += positionX + ",";
            roverPosition += positionY;
            return roverPosition;
        } else if (command == 'F' && facingDirection == 'E') {
            positionY += 1;
            if (positionY > mars.widthOfMarsY){
                positionY = 0;
                roverPosition += positionX + ",";
                roverPosition += positionY;
            } else
            roverPosition += positionX + ",";
            roverPosition += positionY;
            return roverPosition;
        } else if (command == 'B' && facingDirection == 'W') {
            positionY += 1;
            if (positionY > mars.widthOfMarsY){
                positionY = 0;
                roverPosition += positionX + ",";
                roverPosition += positionY;
            } else
            roverPosition += positionX + ",";
            roverPosition += positionY;
            return roverPosition;
        } else if (command == 'F' && facingDirection == 'W') {
            positionY -= 1;
            if (positionY < mars.widthOfMarsY){
                positionY = 2;
                roverPosition += positionX + ",";
                roverPosition += positionY;
            } else
            roverPosition += positionX + ",";
            roverPosition += positionY;
            return roverPosition;
        }
        return roverPosition;

    }

Mars mars = new Mars();

    public void userCommandsToMoveRover(List<Character> arrOfcommands) {

        for (Character command : arrOfcommands) {
            changeFacingDirectionOfRover(command);
            if (mars.thereIsAnObstacleAtPosition(positionX, positionY)) {
                System.out.println("Cannot move. Obstacle " +
                        "ahead.");
            } else {
                moveRoverBackOrForward(command);
            }

        }

    }


    public Rover() {
        this.positionX = 0;
        this.positionY = 0;
        this.facingDirection = 'N';
    }
}
