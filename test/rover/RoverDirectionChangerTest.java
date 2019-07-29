package rover;
import enums.Command;
import enums.Direction;
import org.junit.Assert;
import org.junit.Test;


public class RoverDirectionChangerTest {

    RoverDirectionChanger directionChanger = new RoverDirectionChanger();
    Command leftCommand = Command.LEFT;
    Command rightCommand = Command.RIGHT;

    @Test
    public void whenCommandIsLeftAndFacingNorth_RoverTurnsLeftChangingFacingDirectionToWest() {
        RoverPosition roverPosition = new RoverPosition(0, 1, Direction.NORTH);

        String actualPosition = directionChanger.changeRoverFacingDirectionTo(leftCommand,
                roverPosition).toString();

        String expectedPosition = new RoverPosition(0, 1, Direction.WEST).toString();

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCommandIsLeftAndFacingWest_RoverTurnsLeftChangingFacingDirectionToSouth() {
        RoverPosition roverPosition = new RoverPosition(1, 1, Direction.WEST);

        String actualPosition = directionChanger.changeRoverFacingDirectionTo(leftCommand,
                roverPosition).toString();

        String expectedPosition = new RoverPosition(1, 1, Direction.SOUTH).toString();

        Assert.assertEquals(expectedPosition, actualPosition);

    }

    @Test
    public void whenCommandIsLeftAndFacingSouth_RoverTurnsLeftChangingFacingDirectionToEast() {
        RoverPosition roverPosition = new RoverPosition(1, 1, Direction.SOUTH);

        String actualPosition = directionChanger.changeRoverFacingDirectionTo(leftCommand,
                roverPosition).toString();

        String expectedPosition = new RoverPosition(1, 1, Direction.EAST).toString();

        Assert.assertEquals(expectedPosition, actualPosition);
    }


    @Test
    public void whenCommandIsLeftAndFacingEast_RoverTurnsLeftChangingFacingDirectionToNorth() {
        RoverPosition roverPosition = new RoverPosition(1, 1, Direction.EAST);

        String actualPosition = directionChanger.changeRoverFacingDirectionTo(leftCommand,
                roverPosition).toString();

        String expectedPosition = new RoverPosition(1, 1, Direction.NORTH).toString();

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCommandIsRightAndFacingNorth_RoverTurnsRightChangingFacingDirectionToEast() {
        RoverPosition roverPosition = new RoverPosition(1, 1, Direction.NORTH);

        String actualPosition = directionChanger.changeRoverFacingDirectionTo(rightCommand,
                roverPosition).toString();

        String expectedPosition = new RoverPosition(1, 1, Direction.EAST).toString();

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCommandIsRightAndFacingEast_RoverTurnsRightChangingFacingDirectionToSouth() {
        RoverPosition roverPosition = new RoverPosition(1, 1, Direction.EAST);

        String actualPosition = directionChanger.changeRoverFacingDirectionTo(rightCommand,
                roverPosition).toString();

        String expectedPosition = new RoverPosition(1, 1, Direction.SOUTH).toString();

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCommandIsRightAndFacingSouth_RoverTurnsRightChangingFacingDirectionToWest() {
        RoverPosition roverPosition = new RoverPosition(1, 1, Direction.SOUTH);

        String actualPosition = directionChanger.changeRoverFacingDirectionTo(rightCommand,
                roverPosition).toString();

        String expectedPosition = new RoverPosition(1, 1, Direction.WEST).toString();

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCommandIsRightAndFacingWest_RoverTurnsRightChangingFacingDirectionToNorth() {
        RoverPosition roverPosition = new RoverPosition(1, 1, Direction.WEST);

        String actualPosition = directionChanger.changeRoverFacingDirectionTo(rightCommand,
                roverPosition).toString();

        String expectedPosition = new RoverPosition(1, 1, Direction.NORTH).toString();

        Assert.assertEquals(expectedPosition, actualPosition);
    }

}