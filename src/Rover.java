import java.util.List;

public class Rover {

    private int positionX;
    private int positionY;
    private char facingDirection = 'x';
    private List<List<String>> currentMap;

    public void landRover(List<List<String>> map, int positionX, int positionY, char facingDirection) {
        if (positionX > map.size() - 1 || map.get(0).size() - 1 < positionY) {
            throw new IllegalArgumentException("Rover position is out of bounds");
        } else if (facingDirection != 'N' && facingDirection != 'S' && facingDirection != 'E' && facingDirection != 'W') {
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


    private void changeRoverFacingDirectionToLeft() {
        switch (facingDirection) {
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
    }

    private void changeRoverFacingDirectionToRight() {
        switch (facingDirection) {
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


    private void moveRoverBackward() {
        switch (facingDirection) {
            case 'N':
                positionX += 1;
                positionX = getNextPosition(positionX);
                break;

            case 'S':
                positionX -= 1;
                positionX = getNextPosition(positionX);
                break;

            case 'E':
                positionY -= 1;
                positionY = getNextPosition(positionY);
                break;

            case 'W':
                positionY += 1;
                positionY = getNextPosition(positionY);
                break;
        }

    }

    private void moveRoverForward() {

        switch (facingDirection) {
            case 'N':
                positionX -= 1;
                positionX = getNextPosition(positionX);
                break;

            case 'S':
                positionX += 1;
                positionX = getNextPosition(positionX);
                break;

            case 'E':
                positionY += 1;
                positionY = getNextPosition(positionY);
                break;

            case 'W':
                positionY -= 1;
                positionY = getNextPosition(positionY);
                break;
        }

    }

    private int getNextPosition(int position) {
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


    void moveRover(List<String> arrayOfCommands) {
        for (String command : arrayOfCommands) {
            if ("L".equalsIgnoreCase(command)) {
                changeRoverFacingDirectionToLeft();
            } else if ("R".equalsIgnoreCase(command)) {
                changeRoverFacingDirectionToRight();
            } else if ("B".equalsIgnoreCase(command)) {
                moveRoverBackward();
            } else if ("F".equalsIgnoreCase(command)) {
                moveRoverForward();
            }
            if (isThereAnObstacle(positionX, positionY)) {
                System.out.println("Can no longer move. Obstacle " +
                        "detected at position " + positionX + "," + positionY + ".");
                break;
            }
            System.out.println("For Command: " + command + "," + "Rover travelled through " +
                    "coordinates  " + getPosition() +
                    ".");
        }
    }
}