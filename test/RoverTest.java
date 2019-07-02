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




//    @Test
//    public void moveRoverForward() {
//        String expectedForwardPosition = "0,1";
//        Assert.assertEquals(expectedForwardPosition, rover.moveRoverForward('F'));
//    }
//
//    @Test
//    public void moveRoverBackward() {
//        String expectedBackPositionFromNorth11 = "2,1";
//        Assert.assertEquals(expectedBackPositionFromNorth11, rover.moveRoverBackward('B'));

//    }

//    @Test
//    public void roverCanTurnLeftAndChangeFacingDirection() {
//        char expectedWest = 'W';
//        Assert.assertEquals(expectedWest, rover.changeFacingDirectionOfRover('L'));
//
//        char expectedSouth = 'S';
//        Assert.assertEquals(expectedSouth, rover.changeFacingDirectionOfRover('L'));
//
//        char expectedEast = 'E';
//        Assert.assertEquals(expectedEast, rover.changeFacingDirectionOfRover('L'));
//
//        char expectedNorth = 'N';
//        Assert.assertEquals(expectedNorth, rover.changeFacingDirectionOfRover('L'));
//    }


//    @Test
//    public void roverCanTurnRight() {
//        char expectedEast = 'E';
//        Assert.assertEquals(expectedEast, rover.changeFacingDirectionOfRover('R'));
//
//        char expectedSouth = 'S';
//        Assert.assertEquals(expectedSouth, rover.changeFacingDirectionOfRover('R'));
//
//        char expectedWest = 'W';
//        Assert.assertEquals(expectedWest, rover.changeFacingDirectionOfRover('R'));
//
//        char expectedNorth = 'N';
//        Assert.assertEquals(expectedNorth, rover.changeFacingDirectionOfRover('R'));
//
//    }

//    @Test
//    public void marsGridWrapsAtEdge() {
//        int expectedPosition = 2;
//        int actual = rover.checkForEdge(-1);
//
//        Assert.assertEquals(expectedPosition, actual);
//    }

    @Test
    public void commandsMoveRover() {
        ArrayList<Character> userCommands = new ArrayList<>();
        userCommands.add('F');
        userCommands.add('F');
        userCommands.add('L');
        userCommands.add('B');
        //rover.moveRover(userCommands);
    }


}