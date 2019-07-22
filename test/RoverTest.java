import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
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
        RoverPosition landingPosition = new RoverPosition(1, 1, Direction.NORTH);

        String expectedPosition = "1,1,NORTH";
        String landingActual = rover.landRover(map, landingPosition).toString();

        Assert.assertEquals(expectedPosition, landingActual);
    }


    @Test(expected = IllegalArgumentException.class)
    public void whenRoverIsLandedOutOfBounds_ItShouldThrowAnIllegalArgumentException() {

        Rover rover = new Rover(roverEngine);
        RoverPosition landingPosition = new RoverPosition(1, 4, Direction.NORTH);

        rover.landRover(map, landingPosition);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenRoverIsLandedOnAnObstacle_ItShouldThrowAnIllegalArgumentException() {

        Rover rover = new Rover(roverEngine);
        RoverPosition landingPosition = new RoverPosition(1, 1, Direction.NORTH);

        rover.landRover(map, landingPosition);
    }


}