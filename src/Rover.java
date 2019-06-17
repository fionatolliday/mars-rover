import java.util.List;

public class Rover {

    private int positionX;
    private int positionY;
    private char facingDirection;
    private String roverPosition;
    private Mars mars;

    public Rover() {
        this.positionX = 1;
        this.positionY = 1;
        this.facingDirection = 'N';
        this.roverPosition = "";
        this.mars = new Mars();
    }

    public String roversStartingPosition() {
        String startingPosition = "";
        startingPosition += positionX + ",";
        startingPosition += positionY + ",";
        startingPosition += facingDirection;
        return startingPosition;
    }


    public char changeFacingDirectionOfRover(char command) {
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


    public String moveRoverBackward(char command) {

        if (command == 'B') {
            switch (facingDirection) {
                case 'N':
                    positionX += 1;
                    roverPosition += checkForEdge(positionX) + ",";
                    roverPosition += checkForEdge(positionY);
                    break;

                case 'S':
                    positionX -= 1;
                    roverPosition += checkForEdge(positionX) + ",";
                    roverPosition += checkForEdge(positionY);
                    break;

                case 'E':
                    positionY -= 1;
                    roverPosition += checkForEdge(positionX) + ",";
                    roverPosition += checkForEdge(positionY);
                    break;

                case 'W':
                    positionY += 1;
                    roverPosition += checkForEdge(positionX) + ",";
                    roverPosition += checkForEdge(positionY);
                    break;
            }
        }
        return roverPosition;
    }

    public String moveRoverForward(char command) {

        if (command == 'F') {
            switch (facingDirection) {
                case 'N':
                    positionX -= 1;
                    roverPosition += checkForEdge(positionX) + ",";
                    roverPosition += checkForEdge(positionY);
                    break;

                case 'S':
                    positionX += 1;
                    roverPosition += checkForEdge(positionX) + ",";
                    roverPosition += checkForEdge(positionY);
                    break;

                case 'E':
                    positionY += 1;
                    roverPosition += checkForEdge(positionX) + ",";
                    roverPosition += checkForEdge(positionY);
                    break;

                case 'W':
                    positionY -= 1;
                    roverPosition += checkForEdge(positionX) + ",";
                    roverPosition += checkForEdge(positionY);
                    break;
            }
        }
        return roverPosition;
    }

    public int checkForEdge(int position) {
        if (position > mars.getMaxHeightAndWidthOfMars()) {
            return mars.getMinHeightAndWidthOfMars();
        } else if (position < mars.getMinHeightAndWidthOfMars()) {
            return mars.getMaxHeightAndWidthOfMars();
        }
        return position;
    }

    public void userCommandsToMoveRover(List<Character> arrOfCommands) {

        for (Character command : arrOfCommands) {
            changeFacingDirectionOfRover(command);
            if (mars.thereIsAnObstacleAtPosition(positionX, positionY)) {
                System.out.println("Cannot move. Obstacle " +
                        "ahead at position " + roverPosition);
            } else {
                moveRoverBackward(command);
            }
            moveRoverForward(command);
        }

    }


}
