import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoverTest {

    @Before
    public void setUp() throws Exception {
        Rover rover = new Rover();
    }

    @Test
    public void roverIsOnMarsAt00FacingNorth(Position x, Position y, Facing n) {
        Mars mars = new Mars();
        assert.AssertTrue(mars.printRoverlocation);
    }

    @Test
    public void roverCanMoveLeft(Command) {

        assert.AssertTrue(rover.moveleft);
    }

    @Test
    public void roverCanMoveRight(Command) {

        assert.AssertTrue(rover.moveright);
    }

    @Test
    public void roverCanMoveForward(Command) {

        assert.AssertTrue(rover.moveForward);
    }

    @Test
    public void roverCanMoveBackwards(Command) {

        assert.AssertTrue(rover.moveBack);
    }

    @Test
    public void roverCanTurnSouth() {

        assert.AssertTrue(rover.turnSouth);
    }

    @Test
    public void roverCanTurnEast() {

        assert.AssertTrue(rover.turnEast);
    }

    @Test
    public void roverCanTurnWest() {

        assert.AssertTrue(rover.turnWest);
    }

    @Test
    public void roverCanTurnNorth() {

        assert.AssertTrue(rover.turnNorth);
    }

    @Test
    public void roverDetectsAnObstacleAtNextCommand() {
        
    }

    @Test
    public void roverReportsAnObstacle() {
    }
}