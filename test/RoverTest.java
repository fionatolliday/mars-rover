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
    public void roverCanMoveLeft() {

        Rover rover = new Rover();

        String expectedPosition ="0,-1";
        Assert.assertEquals(expectedPosition, rover.moveRoverLeftRightBackOrForward('L'));
    }

    @Test
    public void roverCanMoveRight() {
        Rover rover = new Rover();

        String expectedPosition ="0,1";
        Assert.assertEquals(expectedPosition, rover.moveRoverLeftRightBackOrForward('R'));
    }

    @Test
    public void roverCanMoveForward() {
        Rover rover = new Rover();

        String expectedPosition ="-1,0";
        Assert.assertEquals(expectedPosition, rover.moveRoverLeftRightBackOrForward('F'));
    }

    @Test
    public void roverCanMoveBackwards() {
        Rover rover = new Rover();

        String expectedPosition ="1,0";
        Assert.assertEquals(expectedPosition, rover.moveRoverLeftRightBackOrForward('B'));
    }

//    @Test
//    public void roverCanTurnSouth() {
//
//        assert.AssertTrue(rover.turnSouth);
//    }
//
//    @Test
//    public void roverCanTurnEast() {
//
//        assert.AssertTrue(rover.turnEast);
//    }
//
//    @Test
//    public void roverCanTurnWest() {
//
//        assert.AssertTrue(rover.turnWest);
//    }
//
//    @Test
//    public void roverCanTurnNorth() {
//
//        assert.AssertTrue(rover.turnNorth);
//    }
//
//    @Test
//    public void roverDetectsAnObstacleAtNextCommand() {
//
//    }
//
//    @Test
//    public void roverReportsAnObstacle() {
//    }
}