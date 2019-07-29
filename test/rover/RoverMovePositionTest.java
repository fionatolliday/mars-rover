package rover;
import enums.Command;
import enums.Direction;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class RoverMovePositionTest {

    RoverMovePosition movePosition = new RoverMovePosition();
    Command forwardCommand = Command.FORWARDS;
    Command backwardCommand = Command.BACKWARDS;
    List<List<String>> map;

    @Before
    public void setUp() throws Exception {
        map = new ArrayList<>();

        List<String> row1 = Arrays.asList(" ", " ", "X");
        List<String> row2 = Arrays.asList(" ", " ", " ");
        List<String> row3 = Arrays.asList(" ", " ", " ");

        map.add(row1);
        map.add(row2);
        map.add(row3);
    }


    @Test
    public void whenCommandIsBackwardsAndFacingNorth_RoverMovesBackwardOneSpot() {
        RoverPosition roverPosition = new RoverPosition(2, 1, Direction.NORTH);

        String actualPosition = movePosition.moveRoverPosition(backwardCommand,
                roverPosition, map).toString();

        String expectedPosition = new RoverPosition(0, 1, Direction.NORTH).toString();

        Assert.assertEquals(expectedPosition, actualPosition);

    }

    @Test
    public void whenCommandIsBackwardsAndFacingSouth_RoverMovesBackwardOneSpot() {
        RoverPosition roverPosition = new RoverPosition(0, 1, Direction.SOUTH);

        String actualPosition = movePosition.moveRoverPosition(backwardCommand,
                roverPosition, map).toString();

        String expectedPosition = new RoverPosition(2, 1, Direction.SOUTH).toString();

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCommandIsBackwardsAndFacingEast_RoverMovesBackwardOneSpot() {
        RoverPosition roverPosition = new RoverPosition(1, 1, Direction.EAST);

        String actualPosition = movePosition.moveRoverPosition(backwardCommand,
                roverPosition, map).toString();

        String expectedPosition = new RoverPosition(1, 0, Direction.EAST).toString();

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCommandIsBackwardsAndFacingWest_RoverMovesBackwardOneSpot() {
        RoverPosition roverPosition = new RoverPosition(1, 1, Direction.WEST);

        String actualPosition = movePosition.moveRoverPosition(backwardCommand,
                roverPosition, map).toString();

        String expectedPosition = new RoverPosition(1, 2, Direction.WEST).toString();

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCommandIsForwardsAndFacingNorth_RoverMovesForwardOneSpot() {
        RoverPosition roverPosition = new RoverPosition(0, 1, Direction.NORTH);

        String actualPosition = movePosition.moveRoverPosition(forwardCommand,
                roverPosition, map).toString();

        String expectedPosition = new RoverPosition(2, 1, Direction.NORTH).toString();

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCommandIsForwardsAndFacingSouth_RoverMovesForwardOneSpot() {
        RoverPosition roverPosition = new RoverPosition(2, 1, Direction.SOUTH);

        String actualPosition = movePosition.moveRoverPosition(forwardCommand,
                roverPosition, map).toString();

        String expectedPosition = new RoverPosition(0, 1, Direction.SOUTH).toString();

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCommandIsForwardsAndFacingEast_RoverMovesForwardOneSpot() {
        RoverPosition roverPosition = new RoverPosition(1, 1, Direction.EAST);

        String actualPosition = movePosition.moveRoverPosition(forwardCommand,
                roverPosition, map).toString();

        String expectedPosition = new RoverPosition(1, 2, Direction.EAST).toString();

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCommandIsForwardsAndFacingWest_RoverMovesForwardOneSpot() {
        RoverPosition roverPosition = new RoverPosition(1, 1, Direction.WEST);

        String actualPosition = movePosition.moveRoverPosition(forwardCommand,
                roverPosition, map).toString();

        String expectedPosition = new RoverPosition(1, 0, Direction.WEST).toString();

        Assert.assertEquals(expectedPosition, actualPosition);
    }

}