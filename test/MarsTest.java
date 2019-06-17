import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class MarsTest {

    Mars mars;

    @Before
    public void setUp() throws Exception {
        mars = new Mars();
    }


    @Test
    public void marsHasAnObstacleAtLocation() {
        Assert.assertTrue(mars.thereIsAnObstacleAtPosition(0, 2));
    }

}






