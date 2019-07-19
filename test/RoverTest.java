import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RoverTest {

    List<List<String>> map;
    RoverEngine roverEngine;

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
    public void whenRoverIsLanded_ItShouldGetCorrectPosition() {

        Rover rover = new Rover(roverEngine);

        int expectedPositionX = 1;
        int expectedPositionY = 2;
        Direction expectedFacing = Direction.NORTH;
        String expectedPosition = "1,2,NORTH";

        rover.landRover(map, expectedPositionX, expectedPositionY, expectedFacing);

        String actualPosition = rover.getPosition();

        Assert.assertEquals(expectedPosition, actualPosition);
    }


    @Test(expected = IllegalArgumentException.class)
    public void whenRoverIsLandedOutOfBounds_ItShouldThrowAnIllegalArgumentException() {

        Rover rover = new Rover(roverEngine);

        int positionX = 1;
        int positionY = 4;
        Direction facing = Direction.NORTH;
        rover.landRover(map, positionX, positionY, facing);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenRoverIsLandedOnAnObstacle_ItShouldThrowAnIllegalArgumentException() {

        Rover rover = new Rover(roverEngine);

        int positionX = 2;
        int positionY = 1;
        Direction facing = Direction.NORTH;

        rover.landRover(map, positionX, positionY, facing);
    }

//    @Test
//    public void whenCommandsGivenToMoveRover_RoverMoves() {
//
//        Rover rover = new Rover(roverEngine);
//
//        List<Command> commands = new ArrayList<>();
//
//        commands.add(Command.LEFT);
//        commands.add(Command.LEFT);
//        commands.add(Command.BACKWARDS);
//        commands.add(Command.RIGHT);
//        commands.add(Command.FORWARDS);
//
//        rover.moveRover(commands);
//    }
}