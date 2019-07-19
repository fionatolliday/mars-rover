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
        List<String> row3 = Arrays.asList(" ", "X", " ");

        map.add(row1);
        map.add(row2);
        map.add(row3);
    }

    @Test
    public void whenCommandIsLeftAndFacingNorth_RoverTurnsLeftChangingFacingDirectionToWest() {

        RoverEngine roverEngine = new RoverEngine();

        Command command = Command.LEFT;
        int positionX = 1;
        int positionY = 1;
        Direction facing = Direction.NORTH;

        roverEngine.run(command, map, positionX, positionY, facing);

        RoverPosition actualPosition = roverEngine.run(command, map, positionX, positionY, facing);
        String expectedPosition = "1,1,WEST";

        Assert.assertEquals(expectedPosition, actualPosition);
    }

//    @Test
//    public void whenCommandIsLeftAndFacingWest_RoverTurnsLeftChangingFacingDirectionToSouth() {
//        RoverEngine roverEngine = new RoverEngine();
//
//        Command command = Command.LEFT;
//        int positionX = 1;
//        int positionY = 1;
//        Direction facing = Direction.WEST;
//
//        roverEngine.run(command, map, positionX, positionY, facing);
//
//        RoverPosition actualPosition = roverEngine.run(command, map, positionX, positionY, facing);
//        String expectedPosition = "1,1,SOUTH";
//
//        Assert.assertEquals(expectedPosition, actualPosition);
//
//    }

//    @Test
//    public void whenCommandIsLeftAndFacingSouth_RoverTurnsLeftChangingFacingDirectionToEast() {
//        RoverEngine roverEngine = new RoverEngine();
//
//        Command command = Command.LEFT;
//        int positionX = 1;
//        int positionY = 1;
//        Direction facing = Direction.SOUTH;
//
//        roverEngine.run(command, map, positionX, positionY, facing);
//
//        RoverPosition actualPosition = roverEngine.run(command, map, positionX, positionY, facing);
//        String expectedPosition = "1,1,EAST";
//
//        Assert.assertEquals(expectedPosition, actualPosition);
//    }
//    @Test
//    public void whenCommandIsLAndFacingEast_RoverTurnsLeftChangingFacingDirectionToNorth() {
//
//        List<String> commands = Arrays.asList("L");
//
//        rover.landRover(map, 0, 1, 'E');
//        rover.moveRover(commands);
//        String actualPosition = rover.getPosition();
//        String expectedPosition = "0,1,N";
//
//        Assert.assertEquals(expectedPosition, actualPosition);
//    }
//
//
//    @Test
//    public void whenCommandIsRAndFacingNorth_RoverTurnsRightChangingFacingDirectionToEast() {
//        List<List<String>> map = new ArrayList<>();
//        List<String> row1 = Arrays.asList(" ", " ", " ");
//        map.add(row1);
//
//        List<String> commands = Arrays.asList("R");
//
//        rover.landRover(map, 0, 0, 'N');
//        rover.moveRover(commands);
//        String actualPosition = rover.getPosition();
//        String expectedPosition = "0,0,E";
//
//        Assert.assertEquals(expectedPosition, actualPosition);
//    }
//
//    @Test
//    public void whenCommandIsRAndFacingEast_RoverTurnsRightChangingFacingDirectionToSouth() {
//
//        List<String> commands = Arrays.asList("R");
//
//        rover.landRover(map, 0, 0, 'E');
//        rover.moveRover(commands);
//        String actualPosition = rover.getPosition();
//        String expectedPosition = "0,0,S";
//
//        Assert.assertEquals(expectedPosition, actualPosition);
//    }
//
//    @Test
//    public void whenCommandIsRAndFacingSouth_RoverTurnsRightChangingFacingDirectionToWest() {
//
//        List<String> commands = Arrays.asList("R");
//
//        rover.landRover(map, 0, 0, 'S');
//        rover.moveRover(commands);
//        String actualPosition = rover.getPosition();
//        String expectedPosition = "0,0,W";
//
//        Assert.assertEquals(expectedPosition, actualPosition);
//    }
//
//    @Test
//    public void whenCommandIsRAndFacingWest_RoverTurnsRightChangingFacingDirectionToNorth() {
//
//        List<String> commands = Arrays.asList("R");
//
//        rover.landRover(map, 0, 0, 'W');
//        rover.moveRover(commands);
//        String actualPosition = rover.getPosition();
//        String expectedPosition = "0,0,N";
//
//        Assert.assertEquals(expectedPosition, actualPosition);
//    }
//
//
//    @Test
//    public void whenCommandIsBAndFacingNorth_RoverMovesBackwardOneSpot() {
//
//        List<String> commands = Arrays.asList("B");
//
//        rover.landRover(map, 2, 1, 'N');
//        rover.moveRover(commands);
//        String actualPosition = rover.getPosition();
//        String expectedPosition = "0,1,N";
//
//        Assert.assertEquals(expectedPosition, actualPosition);
//    }
//
//    @Test
//    public void whenCommandIsBAndFacingSouth_RoverMovesBackwardOneSpot() {
//
//        List<String> commands = Arrays.asList("B");
//
//        rover.landRover(map, 0, 1, 'S');
//        rover.moveRover(commands);
//        String actualPosition = rover.getPosition();
//        String expectedPosition = "2,1,S";
//
//        Assert.assertEquals(expectedPosition, actualPosition);
//    }
//
//    @Test
//    public void whenCommandIsBAndFacingEast_RoverMovesBackwardOneSpot() {
//
//        List<String> commands = Arrays.asList("B");
//
//        rover.landRover(map, 1, 1, 'E');
//        rover.moveRover(commands);
//        String actualPosition = rover.getPosition();
//        String expectedPosition = "1,0,E";
//
//        Assert.assertEquals(expectedPosition, actualPosition);
//    }
//
//    @Test
//    public void whenCommandIsBAndFacingWest_RoverMovesBackwardOneSpot() {
//
//        List<String> commands = Arrays.asList("B");
//
//        rover.landRover(map, 0, 1, 'W');
//        rover.moveRover(commands);
//        String actualPosition = rover.getPosition();
//        String expectedPosition = "0,2,W";
//
//        Assert.assertEquals(expectedPosition, actualPosition);
//    }
//
//    @Test
//    public void whenCommandIsFAndFacingNorth_RoverMovesForwardOneSpot() {
//
//        List<String> commands = Arrays.asList("F");
//
//        rover.landRover(map, 0, 1, 'N');
//        rover.moveRover(commands);
//        String actualPosition = rover.getPosition();
//        String expectedPosition = "1,1,N";
//
//        Assert.assertEquals(expectedPosition, actualPosition);
//    }
//
//    @Test
//    public void whenCommandIsFAndFacingSouth_RoverMovesForwardOneSpot() {
//
//        List<String> commands = Arrays.asList("F");
//
//        rover.landRover(map, 1, 1, 'S');
//        rover.moveRover(commands);
//        String actualPosition = rover.getPosition();
//        String expectedPosition = "2,1,S";
//
//        Assert.assertEquals(expectedPosition, actualPosition);
//    }
//
//    @Test
//    public void whenCommandIsBAndFacingEast_RoverMovesForwardOneSpot() {
//
//        List<String> commands = Arrays.asList("F");
//
//        rover.landRover(map, 1, 1, 'E');
//        rover.moveRover(commands);
//        String actualPosition = rover.getPosition();
//        String expectedPosition = "1,2,E";
//
//        Assert.assertEquals(expectedPosition, actualPosition);
//    }
//
//    @Test
//    public void whenCommandIsBAndFacingWest_RoverMovesForwardOneSpot() {
//        List<String> commands = Arrays.asList("F");
//
//        rover.landRover(map, 0, 1, 'W');
//        rover.moveRover(commands);
//        String actualPosition = rover.getPosition();
//        String expectedPosition = "0,0,W";
//
//        Assert.assertEquals(expectedPosition, actualPosition);
//    }




}
