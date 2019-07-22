import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RoverEngineTest {

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
    public void whenCommandIsLeftAndFacingNorth_RoverTurnsLeftChangingFacingDirectionToWest() {

        RoverEngine roverEngine = new RoverEngine();

        Command command = Command.LEFT;
        int positionX = 0;
        int positionY = 1;
        Direction facing = Direction.NORTH;

        roverEngine.run(command, map, positionX, positionY, facing);

        String actualPosition = roverEngine.run(command, map, positionX, positionY,
                facing).toString();
        String expectedPosition = "0,1,WEST";

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCommandIsLeftAndFacingWest_RoverTurnsLeftChangingFacingDirectionToSouth() {
        RoverEngine roverEngine = new RoverEngine();

        Command command = Command.LEFT;
        int positionX = 1;
        int positionY = 1;
        Direction facing = Direction.WEST;

        roverEngine.run(command, map, positionX, positionY, facing);

        String actualPosition = roverEngine.run(command, map, positionX, positionY, facing).toString();
        String expectedPosition = "1,1,SOUTH";

        Assert.assertEquals(expectedPosition, actualPosition);

    }

    @Test
    public void whenCommandIsLeftAndFacingSouth_RoverTurnsLeftChangingFacingDirectionToEast() {
        RoverEngine roverEngine = new RoverEngine();

        Command command = Command.LEFT;
        int positionX = 1;
        int positionY = 1;
        Direction facing = Direction.SOUTH;

        roverEngine.run(command, map, positionX, positionY, facing);

        String actualPosition = roverEngine.run(command, map, positionX, positionY, facing).toString();
        String expectedPosition = "1,1,EAST";

        Assert.assertEquals(expectedPosition, actualPosition);
    }


    @Test
    public void whenCommandIsLeftAndFacingEast_RoverTurnsLeftChangingFacingDirectionToNorth() {
        RoverEngine roverEngine = new RoverEngine();

        Command command = Command.LEFT;

        int positionX = 1;
        int positionY = 1;
        Direction facing = Direction.EAST;

        String expectedPosition = "1,1,NORTH";
        String actualPosition = roverEngine.run(command, map, positionX, positionY, facing).toString();

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCommandIsRightAndFacingNorth_RoverTurnsRightChangingFacingDirectionToEast() {
        RoverEngine roverEngine = new RoverEngine();

        Command command = Command.RIGHT;

        int positionX = 1;
        int positionY = 1;
        Direction facing = Direction.NORTH;

        String expectedPosition = "1,1,EAST";
        String actualPosition = roverEngine.run(command, map, positionX, positionY, facing).toString();

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCommandIsRightAndFacingEast_RoverTurnsRightChangingFacingDirectionToSouth() {
        RoverEngine roverEngine = new RoverEngine();

        Command command = Command.RIGHT;

        int positionX = 1;
        int positionY = 1;
        Direction facing = Direction.EAST;

        String expectedPosition = "1,1,SOUTH";
        String actualPosition = roverEngine.run(command, map, positionX, positionY, facing).toString();

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCommandIsRightAndFacingSouth_RoverTurnsRightChangingFacingDirectionToWest() {
        RoverEngine roverEngine = new RoverEngine();

        Command command = Command.RIGHT;

        int positionX = 1;
        int positionY = 1;
        Direction facing = Direction.SOUTH;

        String expectedPosition = "1,1,WEST";
        String actualPosition = roverEngine.run(command, map, positionX, positionY, facing).toString();

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCommandIsRightAndFacingWest_RoverTurnsRightChangingFacingDirectionToNorth() {
        RoverEngine roverEngine = new RoverEngine();

        Command command = Command.RIGHT;

        int positionX = 1;
        int positionY = 1;
        Direction facing = Direction.WEST;

        String expectedPosition = "1,1,NORTH";
        String actualPosition = roverEngine.run(command, map, positionX, positionY, facing).toString();

        Assert.assertEquals(expectedPosition, actualPosition);    }


    @Test
    public void whenCommandIsBackwardsAndFacingNorth_RoverMovesBackwardOneSpot() {
        RoverEngine roverEngine = new RoverEngine();

        Command command = Command.BACKWARDS;

        int positionX = 2;
        int positionY = 1;
        Direction facing = Direction.NORTH;

        String expectedPosition = "0,1,NORTH";
        String actualPosition = roverEngine.run(command, map, positionX, positionY, facing).toString();

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCommandIsBackwardsAndFacingSouth_RoverMovesBackwardOneSpot() {
        RoverEngine roverEngine = new RoverEngine();

        Command command = Command.BACKWARDS;

        int positionX = 0;
        int positionY = 1;
        Direction facing = Direction.SOUTH;

        String expectedPosition = "2,1,SOUTH";
        String actualPosition = roverEngine.run(command, map, positionX, positionY, facing).toString();

        Assert.assertEquals(expectedPosition, actualPosition);    }

    @Test
    public void whenCommandIsBackwardsAndFacingEast_RoverMovesBackwardOneSpot() {
        RoverEngine roverEngine = new RoverEngine();

        Command command = Command.BACKWARDS;

        int positionX = 1;
        int positionY = 1;
        Direction facing = Direction.EAST;

        String expectedPosition = "1,0,EAST";
        String actualPosition = roverEngine.run(command, map, positionX, positionY, facing).toString();

        Assert.assertEquals(expectedPosition, actualPosition);    }

    @Test
    public void whenCommandIsBackwardsAndFacingWest_RoverMovesBackwardOneSpot() {
        RoverEngine roverEngine = new RoverEngine();

        Command command = Command.BACKWARDS;

        int positionX = 1;
        int positionY = 1;
        Direction facing = Direction.WEST;

        String expectedPosition = "1,2,WEST";
        String actualPosition = roverEngine.run(command, map, positionX, positionY, facing).toString();

        Assert.assertEquals(expectedPosition, actualPosition);    }

    @Test
    public void whenCommandIsForwardsAndFacingNorth_RoverMovesForwardOneSpot() {
        RoverEngine roverEngine = new RoverEngine();

        Command command = Command.FORWARDS;

        int positionX = 0;
        int positionY = 1;
        Direction facing = Direction.NORTH;

        String expectedPosition = "2,1,NORTH";
        String actualPosition = roverEngine.run(command, map, positionX, positionY, facing).toString();

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCommandIsForwardsAndFacingSouth_RoverMovesForwardOneSpot() {
        RoverEngine roverEngine = new RoverEngine();

        Command command = Command.FORWARDS;

        int positionX = 2;
        int positionY = 1;
        Direction facing = Direction.SOUTH;

        String expectedPosition = "0,1,SOUTH";
        String actualPosition = roverEngine.run(command, map, positionX, positionY, facing).toString();

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCommandIsForwardsAndFacingEast_RoverMovesForwardOneSpot() {
        RoverEngine roverEngine = new RoverEngine();

        Command command = Command.FORWARDS;

        int positionX = 1;
        int positionY = 1;
        Direction facing = Direction.EAST;

        String expectedPosition = "1,2,EAST";
        String actualPosition = roverEngine.run(command, map, positionX, positionY, facing).toString();

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCommandIsForwardsAndFacingWest_RoverMovesForwardOneSpot() {
        RoverEngine roverEngine = new RoverEngine();

        Command command = Command.FORWARDS;

        int positionX = 1;
        int positionY = 1;
        Direction facing = Direction.WEST;

        String expectedPosition = "1,0,WEST";
        String actualPosition = roverEngine.run(command, map, positionX, positionY, facing).toString();

        Assert.assertEquals(expectedPosition, actualPosition);
    }


    @Test
    public void whenThereIsAnObstacleAtPosition_ShouldReturnTrue() {
        RoverEngine roverEngine = new RoverEngine();

        int positionX = 0;
        int positionY = 2;

        Assert.assertTrue(roverEngine.isThereAnObstacle(map, positionX, positionY));

    }

    @Test
    public void whenThereIsNoObstacleAtPosition_ShouldReturnFalse() {
        RoverEngine roverEngine = new RoverEngine();

        int positionX = 0;
        int positionY = 1;

        Assert.assertFalse(roverEngine.isThereAnObstacle(map, positionX, positionY));

    }
}
