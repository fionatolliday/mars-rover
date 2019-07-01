import java.util.List;

public class Rover {

    private int positionX;
    private int positionY;
    private char facingDirection = 'x';
    private String roverPosition;
    private List<List<String>> currentMap;

//    Rover() {
//        this.positionX = 0;
//        this.positionY = 0;
//        this.facingDirection = 'N';
//        this.roverPosition = "";
//    }

    public void landRover(List<List<String>> map, int positionX, int positionY, char facingDirection) {
        if (positionX > map.size() - 1|| map.get(0).size() - 1 < positionY) {
            throw new IllegalArgumentException("Rover position is out of bounds");
        } else if (facingDirection != 'N' && facingDirection != 'S' && facingDirection != 'E' && facingDirection != 'W'){
            throw new IllegalArgumentException("Facing direction is not valid");
        }
//        else if there is an obstacle where rover is being dropped.

        this.currentMap = map;
        this.positionX = positionX;
        this.positionY = positionY;
        this.facingDirection = facingDirection;
    }

    public String getPosition() {
        String position = "";
        position += positionX + ",";
        position += positionY + ",";
        position += facingDirection;
        return position;
    }


    private void changeFacingDirectionOfRover(char command) {
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
        int lowestBoundary = 0;
        int highestBoundary = currentMap.size() - 1;

        if (position > highestBoundary) {
            return lowestBoundary;
        } else if (position < lowestBoundary) {
            return highestBoundary;
        }
        return position;
    }


    private boolean isThereAnObstacle(int positionX, int positionY) {
        return currentMap.get(positionX).get(positionY).equals("X");
    }


    void moveRover(List<Character> arrayOfCommands) {
        String roversJourney = "";
        for (Character command : arrayOfCommands) {
            changeFacingDirectionOfRover(command);

            if (!isThereAnObstacle(positionX, positionY)) {
                moveRoverBackward(command);
                moveRoverForward(command);
            }
            roversJourney += getPosition() + "  ";


            if (isThereAnObstacle(positionX, positionY)) {
                System.out.println("Can no longer move. Obstacle " +
                        "detected at getPosition " + positionX + "," + positionY + ".");
                break;
            }
        }
        System.out.println("Rover travelled through coordinates " + roversJourney + ".");
    }

    void moveRover1(List<Character> arrayOfCommands) {
        String roversJourney = "";
        for (Character command : arrayOfCommands) {
//            change direction
            changeFacingDirectionOfRover(command);

//            move rover if possible
            if(isThereAnObstacle(positionX, positionY)){
                System.out.println("Can no longer move. Obstacle " +
                        "detected at Position " + positionX + "," + positionY + ".");
                break;
            } else {
                moveRoverBackward(command);
                moveRoverForward(command);
            }

//            roversJourney += getPosition() + "  ";
//              if yes, move rover + store journey
//                if no, do not move + print end of trip message

        }
        roversJourney += getPosition() + "  ";
        System.out.println("Rover travelled through coordinates " + roversJourney + ".");
//
    }

}
