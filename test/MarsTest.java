import org.junit.Assert;
import org.junit.Test;

public class MarsTest {

    private Mars mars = new Mars();

    @Test
    public void marsHasAnObstacleAtLocation00() {
        Assert.assertFalse(mars.thereIsAnObstacleAtPosition(0, 0));
    }

    @Test
    public void marsHasAnObstacleAtLocation01() {
        Assert.assertFalse(mars.thereIsAnObstacleAtPosition(0, 1));
    }

    @Test
    public void marsHasAnObstacleAtLocation02() {
        Assert.assertTrue(mars.thereIsAnObstacleAtPosition(0, 2));
    }

    @Test
    public void marsHasAnObstacleAtLocation10() {
        Assert.assertFalse(mars.thereIsAnObstacleAtPosition(1, 0));
    }

    @Test
    public void marsHasAnObstacleAtLocation11() {
        Assert.assertFalse(mars.thereIsAnObstacleAtPosition(1, 1));
    }

    @Test
    public void marsHasAnObstacleAtLocation12() {
        Assert.assertFalse(mars.thereIsAnObstacleAtPosition(1, 2));
    }

    @Test
    public void marsHasAnObstacleAtLocation20() {
        Assert.assertFalse(mars.thereIsAnObstacleAtPosition(2, 0));
    }

    @Test
    public void marsHasAnObstacleAtLocation21() {
        Assert.assertTrue(mars.thereIsAnObstacleAtPosition(2, 1));
    }

    @Test
    public void marsHasAnObstacleAtLocation22() {
        Assert.assertFalse(mars.thereIsAnObstacleAtPosition(2, 2));
    }

}






