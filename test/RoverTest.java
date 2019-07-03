import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RoverTest {

    private Rover rover = new Rover();


    @Test
    public void whenRoverIsLanded_ItShouldGetCorrectPosition() {
        List<List<String>> map = new ArrayList<>();

        List<String> row1 = Arrays.asList(" ", " ", "X");
        List<String> row2 = Arrays.asList(" ", " ", " ");
        List<String> row3 = Arrays.asList(" ", "X", " ");

        map.add(row1);
        map.add(row2);
        map.add(row3);

        int expectedPositionX = 1;
        int expectedPositionY = 2;
        char expectedHeading = 'N';
        String expectedPosition = "1,2,N";
        rover.landRover(map, expectedPositionX, expectedPositionY, expectedHeading);

        String actualPosition = rover.getPosition();

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenRoverIsLandedOutOfBounds_ItShouldThrowAnIllegalArgumentException() {
        List<List<String>> map = new ArrayList<>();
        int expectedPositionX = 1;
        int expectedPositionY = 4;
        char expectedHeading = 'N';
        rover.landRover(map, expectedPositionX, expectedPositionY, expectedHeading);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenRoverIsLandedWithInvalidHeading_ItShouldThrowAnIllegalArgumentException() {
        List<List<String>> map = new ArrayList<>();
        List<String> row1 = Arrays.asList(" ", " ", " ");
        map.add(row1);

        int expectedPositionX = 0;
        int expectedPositionY = 0;
        char expectedHeading = 'G';

        rover.landRover(map, expectedPositionX, expectedPositionY, expectedHeading);
    }

    @Test
    public void whenCommandIsLAndFacingN_RoverTurnsLeftChangingFacingDirectionToW() {
        List<List<String>> map = new ArrayList<>();
        List<String> row1 = Arrays.asList(" ", " ", " ");
        map.add(row1);

        List<String> commands = Arrays.asList("L");

        rover.landRover(map, 0, 1, 'N');
        rover.moveRover(commands);
        String actualPosition = rover.getPosition();
        String expectedPosition = "0,1,W";

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCommandIsLAndFacingW_RoverTurnsLeftChangingFacingDirectionToS() {
        List<List<String>> map = new ArrayList<>();
        List<String> row1 = Arrays.asList(" ", " ", " ");
        map.add(row1);

        List<String> commands = Arrays.asList("L");

        rover.landRover(map, 0, 1, 'W');
        rover.moveRover(commands);
        String actualPosition = rover.getPosition();
        String expectedPosition = "0,1,S";

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCommandIsLAndFacingS_RoverTurnsLeftChangingFacingDirectionToE() {
        List<List<String>> map = new ArrayList<>();
        List<String> row1 = Arrays.asList(" ", " ", " ");
        map.add(row1);

        List<String> commands = Arrays.asList("L");

        rover.landRover(map, 0, 1, 'S');
        rover.moveRover(commands);
        String actualPosition = rover.getPosition();
        String expectedPosition = "0,1,E";

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCommandIsLAndFacingE_RoverTurnsLeftChangingFacingDirectionToN() {
        List<List<String>> map = new ArrayList<>();
        List<String> row1 = Arrays.asList(" ", " ", " ");
        map.add(row1);

        List<String> commands = Arrays.asList("L");

        rover.landRover(map, 0, 1, 'E');
        rover.moveRover(commands);
        String actualPosition = rover.getPosition();
        String expectedPosition = "0,1,N";

        Assert.assertEquals(expectedPosition, actualPosition);
    }


    @Test
    public void whenCommandIsRAndFacingN_RoverTurnsRightChangingFacingDirectionToE() {
        List<List<String>> map = new ArrayList<>();
        List<String> row1 = Arrays.asList(" ", " ", " ");
        map.add(row1);

        List<String> commands = Arrays.asList("R");

        rover.landRover(map, 0, 0, 'N');
        rover.moveRover(commands);
        String actualPosition = rover.getPosition();
        String expectedPosition = "0,0,E";

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCommandIsRAndFacingE_RoverTurnsRightChangingFacingDirectionToS() {
        List<List<String>> map = new ArrayList<>();
        List<String> row1 = Arrays.asList(" ", " ", " ");
        map.add(row1);

        List<String> commands = Arrays.asList("R");

        rover.landRover(map, 0, 0, 'E');
        rover.moveRover(commands);
        String actualPosition = rover.getPosition();
        String expectedPosition = "0,0,S";

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCommandIsRAndFacingS_RoverTurnsRightChangingFacingDirectionToW() {
        List<List<String>> map = new ArrayList<>();
        List<String> row1 = Arrays.asList(" ", " ", " ");
        map.add(row1);

        List<String> commands = Arrays.asList("R");

        rover.landRover(map, 0, 0, 'S');
        rover.moveRover(commands);
        String actualPosition = rover.getPosition();
        String expectedPosition = "0,0,W";

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCommandIsRAndFacingW_RoverTurnsRightChangingFacingDirectionToN() {
        List<List<String>> map = new ArrayList<>();
        List<String> row1 = Arrays.asList(" ", " ", " ");
        map.add(row1);

        List<String> commands = Arrays.asList("R");

        rover.landRover(map, 0, 0, 'W');
        rover.moveRover(commands);
        String actualPosition = rover.getPosition();
        String expectedPosition = "0,0,N";

        Assert.assertEquals(expectedPosition, actualPosition);
    }


    @Test
    public void whenCommandIsBAndFacingN_RoverMovesBackwardOneSpot() {
        List<List<String>> map = new ArrayList<>();
        List<String> row1 = Arrays.asList(" ", " ", " ");
        List<String> row2 = Arrays.asList(" ", " ", " ");
        List<String> row3 = Arrays.asList(" ", " ", " ");
        map.add(row1);
        map.add(row2);
        map.add(row3);

        List<String> commands = Arrays.asList("B");

        rover.landRover(map, 1, 1, 'N');
        rover.moveRover(commands);
        String actualPosition = rover.getPosition();
        String expectedPosition = "2,1,N";

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCommandIsBAndFacingS_RoverMovesBackwardOneSpot() {
        List<List<String>> map = new ArrayList<>();
        List<String> row1 = Arrays.asList(" ", " ", " ");
        List<String> row2 = Arrays.asList(" ", " ", " ");
        List<String> row3 = Arrays.asList(" ", " ", " ");
        map.add(row1);
        map.add(row2);
        map.add(row3);

        List<String> commands = Arrays.asList("B");

        rover.landRover(map, 0, 1, 'S');
        rover.moveRover(commands);
        String actualPosition = rover.getPosition();
        String expectedPosition = "2,1,S";

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCommandIsBAndFacingE_RoverMovesBackwardOneSpot() {
        List<List<String>> map = new ArrayList<>();
        List<String> row1 = Arrays.asList(" ", " ", " ");
        List<String> row2 = Arrays.asList(" ", " ", " ");
        List<String> row3 = Arrays.asList(" ", " ", " ");
        map.add(row1);
        map.add(row2);
        map.add(row3);

        List<String> commands = Arrays.asList("B");

        rover.landRover(map, 1, 1, 'E');
        rover.moveRover(commands);
        String actualPosition = rover.getPosition();
        String expectedPosition = "1,0,E";

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCommandIsBAndFacingW_RoverMovesBackwardOneSpot() {
        List<List<String>> map = new ArrayList<>();
        List<String> row1 = Arrays.asList(" ", " ", " ");
        List<String> row2 = Arrays.asList(" ", " ", " ");
        List<String> row3 = Arrays.asList(" ", " ", " ");
        map.add(row1);
        map.add(row2);
        map.add(row3);

        List<String> commands = Arrays.asList("B");

        rover.landRover(map, 0, 1, 'W');
        rover.moveRover(commands);
        String actualPosition = rover.getPosition();
        String expectedPosition = "0,2,W";

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCommandIsFAndFacingN_RoverMovesForwardOneSpot() {
        List<List<String>> map = new ArrayList<>();
        List<String> row1 = Arrays.asList(" ", " ", " ");
        List<String> row2 = Arrays.asList(" ", " ", " ");
        map.add(row1);
        map.add(row2);

        List<String> commands = Arrays.asList("F");

        rover.landRover(map, 1, 1, 'N');
        rover.moveRover(commands);
        String actualPosition = rover.getPosition();
        String expectedPosition = "0,1,N";

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCommandIsFAndFacingS_RoverMovesForwardOneSpot() {
        List<List<String>> map = new ArrayList<>();
        List<String> row1 = Arrays.asList(" ", " ", " ");
        List<String> row2 = Arrays.asList(" ", " ", " ");
        List<String> row3 = Arrays.asList(" ", " ", " ");
        map.add(row1);
        map.add(row2);
        map.add(row3);

        List<String> commands = Arrays.asList("F");

        rover.landRover(map, 1, 1, 'S');
        rover.moveRover(commands);
        String actualPosition = rover.getPosition();
        String expectedPosition = "2,1,S";

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCommandIsBAndFacingE_RoverMovesForwardOneSpot() {
        List<List<String>> map = new ArrayList<>();
        List<String> row1 = Arrays.asList(" ", " ", " ");
        List<String> row2 = Arrays.asList(" ", " ", " ");
        List<String> row3 = Arrays.asList(" ", " ", " ");
        map.add(row1);
        map.add(row2);
        map.add(row3);

        List<String> commands = Arrays.asList("F");

        rover.landRover(map, 1, 1, 'E');
        rover.moveRover(commands);
        String actualPosition = rover.getPosition();
        String expectedPosition = "1,2,E";

        Assert.assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void whenCommandIsBAndFacingW_RoverMovesForwardOneSpot() {
        List<List<String>> map = new ArrayList<>();
        List<String> row1 = Arrays.asList(" ", " ", " ");
        List<String> row2 = Arrays.asList(" ", " ", " ");
        map.add(row1);
        map.add(row2);

        List<String> commands = Arrays.asList("F");

        rover.landRover(map, 0, 1, 'W');
        rover.moveRover(commands);
        String actualPosition = rover.getPosition();
        String expectedPosition = "0,0,W";

        Assert.assertEquals(expectedPosition, actualPosition);
    }

}