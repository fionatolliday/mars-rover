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


//    public String changeFacingDirectionOfRover(){
//
//    }


    public Rover() {
        this.positionX = 0;
        this.positionY = 0;
        this.facingDirection = 'N';
    }
}
