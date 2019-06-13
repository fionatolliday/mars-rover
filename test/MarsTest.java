import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MarsTest {


    @Test
    public void printsOutEmptyMarsGrid() {
        Mars mars = new Mars();

        String expectedMarsGrid = "   \n" +
                "   \n" +
                "   ";

        String actualMarsGrid = mars.printMars();

        assertEquals(expectedMarsGrid, actualMarsGrid);
    }

//    @Test
//    public void marsHasAnObstacleAtLocation() {
//
//        assert.AssertTrue(mars.printObstacle);
//    }
}






