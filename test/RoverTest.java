import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RoverTest {

    @Before
    public void setUp() throws Exception {
        Rover rover = new Rover();
    }


    @Test
    public void roverIsOnMarsAt00FacingNorth() {
        Rover rover = new Rover();

        String expectedPosition = "0,0,N";

        Assert.assertEquals(expectedPosition, rover.roversStartingPosition());
    }


    @Test
    public void roverCanMoveForward() {
        Rover rover = new Rover();

        String expectedPosition = "-1,0";
        Assert.assertEquals(expectedPosition, rover.moveRoverBackOrForward('F'));
    }

    @Test
    public void roverCanMoveBackwards() {
        Rover rover = new Rover();

        String expectedPosition = "1,0";
        Assert.assertEquals(expectedPosition, rover.moveRoverBackOrForward('B'));
    }

    @Test
    public void roverCanTurnLeft() {
        Rover rover = new Rover();

        char expectedFacing = 'W';
        Assert.assertEquals(expectedFacing, rover.changeFacingDirectionOfRover('L'));

    }

    @Test
    public void roverCanTurnRight() {
        Rover rover = new Rover();

        String expectedFacing = "E";
        Assert.assertEquals(expectedFacing, rover.changeFacingDirectionOfRover('R'));
    }



//    @Test
//    public void roverReportsAnObstacle() {
//
//        Rover rover = new Rover();
//
//
//        Assert.assertEquals();
//    }
}