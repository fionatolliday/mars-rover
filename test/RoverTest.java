import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RoverTest {

    Rover rover = new Rover();

    @Test
    public void roverIsOnMarsAt00FacingNorth() {
        String expectedPosition = "1,1,N";
        Assert.assertEquals(expectedPosition, rover.roversStartingPosition());
    }


    @Test
    public void roverCanMoveForward() {
        String expectedForwardPosition = "0,1";
        Assert.assertEquals(expectedForwardPosition, rover.moveRoverBackOrForward('F'));
    }

    @Test
    public void roverCanMoveBackwards() {
        String expectedBackPosition = "2,1";
        Assert.assertEquals(expectedBackPosition, rover.moveRoverBackOrForward('B'));
    }

    @Test
    public void roverCanTurnLeft() {
        char expectedFacingDirection = 'W';
        Assert.assertEquals(expectedFacingDirection, rover.changeFacingDirectionOfRover('L'));
    }

    @Test
    public void roverCanTurnRight() {
        char expectedFacingDirection = 'E';
        Assert.assertEquals(expectedFacingDirection, rover.changeFacingDirectionOfRover('R'));
    }

    @Test
    public void marsGridWrapsAtEdge() {
        int expectedPosition = 2;
        int actual = rover.checkForEdge(-1);

        Assert.assertEquals(expectedPosition, actual);
    }


}