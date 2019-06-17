import org.junit.Assert;
import org.junit.Test;


public class MarsTest {

    Mars mars = new Mars();


    @Test
    public void marsHasAnObstacleAtLocation() {
        Assert.assertTrue(mars.thereIsAnObstacleAtPosition(0, 2));
    }

}






