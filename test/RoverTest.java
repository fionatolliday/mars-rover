import org.junit.Assert;
import org.junit.Test;

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
        String expectedBackPosition = "2,1";
        Assert.assertEquals(expectedBackPosition, rover.moveRoverBackward('B'));
    }

    @Test
    public void roverCanTurnLeft() {
        char expectedFacingDirection = 'W';
        Assert.assertEquals(expectedFacingDirection, rover.changeFacingDirectionOfRover('L'));
    }

    @Test
    public void roverCanTurnLeftFromWestAndFaceSouth() {
        char facingDirection = 'W';
        char expectedFacingDirection = 'S';

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