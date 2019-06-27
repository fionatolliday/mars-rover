import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class RoverTest {

    private Rover rover = new Rover();

    @Test
    public void roverIsOnMarsAt00FacingNorth() {
        String expectedPosition = "1,1,N";
        Assert.assertEquals(expectedPosition, rover.roversStartingPosition());
    }


    @Test
    public void moveRoverForward() {
        String expectedForwardPosition = "0,1";
        Assert.assertEquals(expectedForwardPosition, rover.moveRoverForward('F'));
    }

    @Test
    public void moveRoverBackward() {
        String expectedBackPositionFromNorth11 = "2,1";
        Assert.assertEquals(expectedBackPositionFromNorth11, rover.moveRoverBackward('B'));

    }

    @Test
    public void roverCanTurnLeftAndChangeFacingDirection() {
        char expectedWest = 'W';
        Assert.assertEquals(expectedWest, rover.changeFacingDirectionOfRover('L'));

        char expectedSouth = 'S';
        Assert.assertEquals(expectedSouth, rover.changeFacingDirectionOfRover('L'));

        char expectedEast = 'E';
        Assert.assertEquals(expectedEast, rover.changeFacingDirectionOfRover('L'));

        char expectedNorth = 'N';
        Assert.assertEquals(expectedNorth, rover.changeFacingDirectionOfRover('L'));

    }


    @Test
    public void roverCanTurnRight() {
        char expectedEast = 'E';
        Assert.assertEquals(expectedEast, rover.changeFacingDirectionOfRover('R'));

        char expectedSouth = 'S';
        Assert.assertEquals(expectedSouth, rover.changeFacingDirectionOfRover('R'));

        char expectedWest = 'W';
        Assert.assertEquals(expectedWest, rover.changeFacingDirectionOfRover('R'));

        char expectedNorth = 'N';
        Assert.assertEquals(expectedNorth, rover.changeFacingDirectionOfRover('R'));

    }

    @Test
    public void marsGridWrapsAtEdge() {
        int expectedPosition = 2;
        int actual = rover.checkForEdge(-1);

        Assert.assertEquals(expectedPosition, actual);
    }

    @Test
    public void commandsMoveRover() {
        ArrayList<Character> userCommands = new ArrayList<>();
        userCommands.add('F');
        userCommands.add('F');
        userCommands.add('L');
        userCommands.add ('B');
        rover.userCommandsToMoveRover(userCommands);

        
    }
}