import java.util.List;

public class Rover {


    private int positionX;
    private int positionY;
    private char facingDirection;
    private String roverPosition;
    private List<List<String>> currentMap;

    Rover() {
        this.positionX = 1;
        this.positionY = 1;
        this.facingDirection = 'N';
        this.roverPosition = "";
    }

    public void landRover(List<List<String>> map) {
        currentMap = map;
    }

    public String getPosition() {
        String position = "";
        position += positionX + ",";
        position += positionY + ",";
        position += facingDirection;
        return position;
    }


    private char changeFacingDirectionOfRover(char command) {
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


    private void moveRoverBackward(char command) {
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

    private void moveRoverForward(char command) {
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

    private int checkForEdge(int position) {
//        int firstPosition = currentMap.size(0);

        if (position > currentMap.size() - 1) {
            return 0;
        } else if (position < 0) {
            return currentMap.size() - 1;
        }
        return position;
    }


    boolean isAnObstacleFoundAtPosition(int positionX, int positionY) {
        return currentMap.get(positionX).get(positionY).equals("X");
    }

    void userCommandsToMoveRover(List<Character> arrOfCommands) {
        String roversJourney = "";
        for (Character command : arrOfCommands) {
            changeFacingDirectionOfRover(command);

            if (!isAnObstacleFoundAtPosition(positionX, positionY)) {
                moveRoverBackward(command);
                moveRoverForward(command);
            }
            roversJourney += getPosition() + "  ";


            if (isAnObstacleFoundAtPosition(positionX, positionY)) {
                System.out.println("Can no longer move. Obstacle " +
                        "detected at getPosition " + positionX + "," + positionY + ".");
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
