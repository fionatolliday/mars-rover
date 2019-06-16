import org.junit.Assert;
import org.junit.Test;


public class MarsTest {

    Mars mars = new Mars();


    @Test
    public void marsHasAnObstacleAtLocation() {
        Assert.assertTrue(mars.thereIsAnObstacleAtPosition(0, 2));
    }

    @Test
    public void marsGridWrapsAtEdge() {
        int expectedPosition = 2;
        int actual = mars.wrapMars(-2);

        Assert.assertEquals(expectedPosition, actual);
    }
}






