import java.util.List;

public class Rover {

    private int positionX;
    private int positionY;
    private char facingDirection;
    private String roverPosition;

    public Rover() {
        this.positionX = 0;
        this.positionY = 0;
        this.facingDirection = 'N';
        this.roverPosition = "";
    }

    public String roversStartingPosition() {
        String startingPosition = "";
        startingPosition += positionX + ",";
        startingPosition += positionY + ",";
        startingPosition += facingDirection;
        return startingPosition;
    }


    public char changeFacingDirectionOfRover(char command) {
        if (command == 'L') {
            if (facingDirection == 'N') {
                facingDirection = 'W';
            } else if (facingDirection == 'E') {
                facingDirection = 'N';
            } else if (facingDirection == 'S') {
                facingDirection = 'E';
            } else if (facingDirection == 'W') {
                facingDirection = 'S';
            }
        } else if (command == 'R') {
            if(facingDirection == 'N') {
                facingDirection = 'E';
            }else if(facingDirection == 'E'){
                facingDirection = 'S';
            } else if (facingDirection == 'S'){
                facingDirection = 'W';
            } else if (facingDirection == 'W'){
                facingDirection = 'N';
            }
        } return facingDirection;
    }


    public String moveRoverBackOrForward(char command) {

        if (command == 'B' && facingDirection == 'N') {
            positionX += 1;
                roverPosition += positionX + ",";
                roverPosition += positionY;
            return roverPosition;
        } else if (command == 'F' && facingDirection == 'N') {
            positionX -= 1;
                roverPosition += positionX + ",";
                roverPosition += positionY;
            return roverPosition;
        } else if (command == 'B' && facingDirection == 'S') {
            positionX -= 1;
                roverPosition += positionX + ",";
                roverPosition += positionY;
            return roverPosition;
        } else if (command == 'F' && facingDirection == 'S') {
            positionX += 1;
                roverPosition += positionX + ",";
                roverPosition += positionY;
            return roverPosition;
        } else if (command == 'B' && facingDirection == 'E') {
            positionY -= 1;
                roverPosition += positionX + ",";
                roverPosition += positionY;
            return roverPosition;
        } else if (command == 'F' && facingDirection == 'E') {
            positionY += 1;
                roverPosition += positionX + ",";
                roverPosition += positionY;
            return roverPosition;
        } else if (command == 'B' && facingDirection == 'W') {
            positionY += 1;
                roverPosition += positionX + ",";
                roverPosition += positionY;
            return roverPosition;
        } else if (command == 'F' && facingDirection == 'W') {
            positionY -= 1;
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


}
