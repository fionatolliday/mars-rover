import org.junit.Before;
import org.junit.Test;

public class Mars {

    @Before
    public void setUp() throws Exception {
        Mars mars = new Mars();
    }

    @Test
    public void printsOutEmptyMarsGrid() {

    }

    @Test
    public void marsHasAnObstacleAtLocation() {

        assert.AssertTrue(mars.printObstacle);
    }
}
