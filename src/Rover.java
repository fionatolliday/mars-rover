public class Rover {

    private Rover rover;

    private int positionX;
    private int positionY;
    private char facingDirection;

    char north = 'N';
    char east = 'E';
    char south = 'S';
    char west = 'W';


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


    public String moveRoverLeftRightBackOrForward(char command) {
        String roverPosition = "";
        if (command == 'L') {
            positionY -= 1;
            roverPosition += positionX + ",";
            roverPosition += positionY;
            return roverPosition;
        } else if (command == 'R') {
            positionY += 1;
            roverPosition += positionX + ",";
            roverPosition += positionY;
            return roverPosition;
        } else if (command == 'B') {
            positionX += 1;
            roverPosition += positionX + ",";
            roverPosition += positionY;
            return roverPosition;
        } else if (command == 'F') {
            positionX -= 1;
            roverPosition += positionX + ",";
            roverPosition += positionY;
            return roverPosition;
        }
        return roverPosition;

    }


    public String changeFacingDirectionOfRover(char command) {
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
        return roversStartingPosition();
    }


    public Rover() {
        this.positionX = 0;
        this.positionY = 0;
        this.facingDirection = 'N';
    }
}
