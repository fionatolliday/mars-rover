import enums.Command;
import enums.Direction;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rover.RoverEngine;

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
