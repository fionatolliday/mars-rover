import java.util.List;

public class Rover {

    Mars mars = new Mars();

    private int positionX;
    private int positionY;
    private char facingDirection;
    private String roverPosition;

    Rover() {
        this.positionX = 1;
        this.positionY = 1;
        this.facingDirection = 'N';
        this.roverPosition = "";
    }

    String roversStartingPosition() {
        String startingPosition = "";
        startingPosition += positionX + ",";
        startingPosition += positionY + ",";
        startingPosition += facingDirection;
        return startingPosition;
    }


    char changeFacingDirectionOfRover(char command) {
        if (command == 'L') switch (facingDirection) {
            case 'N':
                facingDirection = 'W';
                break;

            case 'E':
                facingDirection = 'N';
                break;

            case 'S':
                facingDirection = 'E';
                break;

            case 'W':
                facingDirection = 'S';
                break;
        }
        else if (command == 'R') switch (facingDirection) {
            case 'N':
                facingDirection = 'E';
                break;

            case 'E':
                facingDirection = 'S';
                break;

            case 'S':
                facingDirection = 'W';
                break;

            case 'W':
                facingDirection = 'N';
                break;
        }

        return facingDirection;
    }


    void moveRoverBackward(char command) {
        int newPosition;

        if (command == 'B') {
            switch (facingDirection) {
                case 'N':
                    positionX += 1;
                    newPosition = positionX;
                    positionX = checkForEdge(newPosition);
                    break;

                case 'S':
                    positionX -= 1;
                    newPosition = positionX;
                    positionX = checkForEdge(newPosition);
                    break;

                case 'E':
                    positionY -= 1;
                    newPosition = positionY;
                    positionY = checkForEdge(newPosition);
                    break;

                case 'W':
                    positionY += 1;
                    newPosition = positionY;
                    positionY = checkForEdge(newPosition);
                    break;
            }
        }
    }

    void moveRoverForward(char command) {
        int newPosition;

        if (command == 'F') {
            switch (facingDirection) {
                case 'N':
                    positionX -= 1;
                    newPosition = positionX;
                    positionX = checkForEdge(newPosition);
                    break;

                case 'S':
                    positionX += 1;
                    newPosition = positionX;
                    positionX = checkForEdge(newPosition);
                    break;

                case 'E':
                    positionY += 1;
                    newPosition = positionY;
                    positionY = checkForEdge(newPosition);
                    break;

                case 'W':
                    positionY -= 1;
                    newPosition = positionY;
                    positionY = checkForEdge(newPosition);
                    break;
            }
        }
    }

    int checkForEdge(int position) {
        if (position > mars.getMaxHeightAndWidthOfMars()) {
            return mars.getMinHeightAndWidthOfMars();
        } else if (position < mars.getMinHeightAndWidthOfMars()) {
            return mars.getMaxHeightAndWidthOfMars();
        }
        return position;
    }

    void userCommandsToMoveRover(List<Character> arrOfCommands) {
        String roversJourney = "";

        for (Character command : arrOfCommands) {
            changeFacingDirectionOfRover(command);

            if (!mars.isAnObstacleFoundAtPosition(positionX, positionY)) {
                moveRoverBackward(command);
                moveRoverForward(command);
            }
            roversJourney += positionX + ",";
            roversJourney += positionY + ",";
            roversJourney += facingDirection + "  ";

            if (mars.isAnObstacleFoundAtPosition(positionX, positionY)) {
                System.out.println("Can no longer move. Obstacle " +
                        "detected at position " + positionX + "," + positionY + ".");
                break;
            }
        }
        System.out.println("Rover travelled through coordinates " + roversJourney + ".");
    }

    void moveRover(List<Character> arrOfCommands) {
        for (Character command : arrOfCommands) {
//            change direction
//            move rover if possible
//              if yes, move rover + store journey
//                if no, do not move + print end of trip message

        }

//
    }

}
