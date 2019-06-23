import org.junit.Assert;
import org.junit.Test;

public class MarsTest {

    private Mars mars = new Mars();

    @Test
    public void marsHasAnObstacleAtLocation() {
        Assert.assertFalse(mars.thereIsAnObstacleAtPosition(0, 0));
        Assert.assertFalse(mars.thereIsAnObstacleAtPosition(0, 1));
        Assert.assertTrue(mars.thereIsAnObstacleAtPosition(0, 2));
        Assert.assertFalse(mars.thereIsAnObstacleAtPosition(1, 0));
        Assert.assertFalse(mars.thereIsAnObstacleAtPosition(1, 1));
        Assert.assertFalse(mars.thereIsAnObstacleAtPosition(1, 2));
        Assert.assertFalse(mars.thereIsAnObstacleAtPosition(2, 0));
        Assert.assertTrue(mars.thereIsAnObstacleAtPosition(2, 1));
        Assert.assertFalse(mars.thereIsAnObstacleAtPosition(2, 2));
    }
}






