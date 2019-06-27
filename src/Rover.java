import java.util.List;

public class Rover {

    private int positionX;
    private int positionY;
    private char facingDirection;
    private String roverPosition;
    private Mars mars;

    Rover() {
        this.positionX = 1;
        this.positionY = 1;
        this.facingDirection = 'N';
        this.roverPosition = "";
        this.mars = new Mars();
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


    String moveRoverBackward(char command) {
        int newPosition;

        if (command == 'B') {
            switch (facingDirection) {
                case 'N':
                    newPosition = positionX += 1;
                    positionX = checkForEdge(newPosition);
                    return roverPosition;

                case 'S':
                    newPosition = positionX -= 1;
                    positionX = checkForEdge(newPosition);
                    return roverPosition;

                case 'E':
                    newPosition = positionY -= 1;
                    positionY = checkForEdge(newPosition);
                    return roverPosition;

                case 'W':
                    newPosition = positionY += 1;
                    positionY = checkForEdge(newPosition);
                    return roverPosition;
            }
        }
        return roverPosition;
    }

    String moveRoverForward(char command) {
        int newPosition;

        if (command == 'F') {
            switch (facingDirection) {
                case 'N':
                    newPosition = positionX -= 1;
                    positionX = checkForEdge(newPosition);
                    return roverPosition;

                case 'S':
                    newPosition = positionX += 1;
                    positionX = checkForEdge(newPosition);
                    return roverPosition;

                case 'E':
                    newPosition = positionY += 1;
                    positionY = checkForEdge(newPosition);
                    return roverPosition;

                case 'W':
                    newPosition = positionY -= 1;
                    positionY = checkForEdge(newPosition);
                    return roverPosition;
            }
        }
        return roverPosition;
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

}
