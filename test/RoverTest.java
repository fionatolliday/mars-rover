import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RoverTest {

    Rover rover = new Rover();

//    @Test
//    public void roverIsOnMarsAt00FacingNorth() {
//        String expectedPosition = "0,0,N";
//        Assert.assertEquals(expectedPosition, rover.roversStartingPosition());
//    }


    @Test
    public void roverCanMoveForward() {
        String expectedForwardPosition = "-1,0";
        Assert.assertEquals(expectedForwardPosition, rover.moveRoverBackOrForward('F'));
    }

    @Test
    public void roverCanMoveBackwards() {
        String expectedBackPosition = "1,0";
        Assert.assertEquals(expectedBackPosition, rover.moveRoverBackOrForward('B'));
    }

    @Test
    public void roverCanTurnLeft() {
        char expectedFacingDirection = 'W';
        Assert.assertEquals(expectedFacingDirection, rover.changeFacingDirectionOfRover('L'));
    }

    @Test
    public void roverCanTurnRight() {
        String expectedFacingDirection = "E";
        Assert.assertEquals(expectedFacingDirection, rover.changeFacingDirectionOfRover('R'));
    }

}