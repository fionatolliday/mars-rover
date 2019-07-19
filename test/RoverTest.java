import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RoverTest {

    List<List<String>> map;
    RoverEngine roverEngine;

    @Before
    public void setUp() throws Exception {
        map = new ArrayList<>();

        List<String> row1 = Arrays.asList(" ", " ", "X");
        List<String> row2 = Arrays.asList(" ", " ", " ");
        List<String> row3 = Arrays.asList(" ", "X", " ");

        map.add(row1);
        map.add(row2);
        map.add(row3);
    }

    @Test
    public void whenRoverIsLanded_ItShouldGetCorrectPosition() {

        Rover rover = new Rover(roverEngine);

        int expectedPositionX = 1;
        int expectedPositionY = 2;
        Direction expectedFacing = Direction.NORTH;
        String expectedPosition = "1,2,NORTH";

        rover.landRover(map, expectedPositionX, expectedPositionY, expectedFacing);

        String actualPosition = rover.getPosition();

        Assert.assertEquals(expectedPosition, actualPosition);
    }


    @Test(expected = IllegalArgumentException.class)
    public void whenRoverIsLandedOutOfBounds_ItShouldThrowAnIllegalArgumentException() {

        Rover rover = new Rover(roverEngine);

        int positionX = 1;
        int positionY = 4;
        Direction facing = Direction.NORTH;
        rover.landRover(map, positionX, positionY, facing);
    }

//    @Test(expected = IllegalArgumentException.class)
//    public void whenRoverIsLandedWithInvalidFacingDirection_ItShouldThrowAnIllegalArgumentException() {

//    Rover rover = new Rover(roverEngine);

//        int positionX = 0;
//        int positionY = 0;
//        Direction facing = ;
//
//        rover.landRover(map, positionX, positionY, facing);
//    }

    @Test(expected = IllegalArgumentException.class)
    public void whenRoverIsLandedOnAnObstacle_ItShouldThrowAnIllegalArgumentException() {

        Rover rover = new Rover(roverEngine);

        int positionX = 2;
        int positionY = 1;
        Direction facing = Direction.NORTH;

        rover.landRover(map, positionX, positionY, facing);
    }

//    @Test
//    public void whenCommandIsLAndFacingNorth_RoverTurnsLeftChangingFacingDirectionToWest() {
//        List<List<String>> map = new ArrayList<>();
//        List<String> row1 = Arrays.asList(" ", " ", " ");
//        map.add(row1);
//
//        List<String> commands = Arrays.asList("L");
//
//        rover.landRover(map, 0, 1, 'N');
//        rover.moveRover(commands);
//        String actualPosition = rover.getPosition();
//        String expectedPosition = "0,1,W";
//
//        Assert.assertEquals(expectedPosition, actualPosition);
//    }
//
//    @Test
//    public void whenCommandIsLAndFacingWest_RoverTurnsLeftChangingFacingDirectionToSouth() {
//        List<List<String>> map = new ArrayList<>();
//        List<String> row1 = Arrays.asList(" ", " ", " ");
//        map.add(row1);
//
//        List<String> commands = Arrays.asList("L");
//
//        rover.landRover(map, 0, 1, 'W');
//        rover.moveRover(commands);
//        String actualPosition = rover.getPosition();
//        String expectedPosition = "0,1,S";
//
//        Assert.assertEquals(expectedPosition, actualPosition);
//    }
//
//    @Test
//    public void whenCommandIsLAndFacingSouth_RoverTurnsLeftChangingFacingDirectionToEast() {
//        List<List<String>> map = new ArrayList<>();
//        List<String> row1 = Arrays.asList(" ", " ", " ");
//        map.add(row1);
//
//        List<String> commands = Arrays.asList("L");
//
//        rover.landRover(map, 0, 1, 'S');
//        rover.moveRover(commands);
//        String actualPosition = rover.getPosition();
//        String expectedPosition = "0,1,E";
//
//        Assert.assertEquals(expectedPosition, actualPosition);
//    }
//
//    @Test
//    public void whenCommandIsLAndFacingEast_RoverTurnsLeftChangingFacingDirectionToNorth() {
//        List<List<String>> map = new ArrayList<>();
//        List<String> row1 = Arrays.asList(" ", " ", " ");
//        map.add(row1);
//
//        List<String> commands = Arrays.asList("L");
//
//        rover.landRover(map, 0, 1, 'E');
//        rover.moveRover(commands);
//        String actualPosition = rover.getPosition();
//        String expectedPosition = "0,1,N";
//
//        Assert.assertEquals(expectedPosition, actualPosition);
//    }
//
//
//    @Test
//    public void whenCommandIsRAndFacingNorth_RoverTurnsRightChangingFacingDirectionToEast() {
//        List<List<String>> map = new ArrayList<>();
//        List<String> row1 = Arrays.asList(" ", " ", " ");
//        map.add(row1);
//
//        List<String> commands = Arrays.asList("R");
//
//        rover.landRover(map, 0, 0, 'N');
//        rover.moveRover(commands);
//        String actualPosition = rover.getPosition();
//        String expectedPosition = "0,0,E";
//
//        Assert.assertEquals(expectedPosition, actualPosition);
//    }
//
//    @Test
//    public void whenCommandIsRAndFacingEast_RoverTurnsRightChangingFacingDirectionToSouth() {
//        List<List<String>> map = new ArrayList<>();
//        List<String> row1 = Arrays.asList(" ", " ", " ");
//        map.add(row1);
//
//        List<String> commands = Arrays.asList("R");
//
//        rover.landRover(map, 0, 0, 'E');
//        rover.moveRover(commands);
//        String actualPosition = rover.getPosition();
//        String expectedPosition = "0,0,S";
//
//        Assert.assertEquals(expectedPosition, actualPosition);
//    }
//
//    @Test
//    public void whenCommandIsRAndFacingSouth_RoverTurnsRightChangingFacingDirectionToWest() {
//        List<List<String>> map = new ArrayList<>();
//        List<String> row1 = Arrays.asList(" ", " ", " ");
//        map.add(row1);
//
//        List<String> commands = Arrays.asList("R");
//
//        rover.landRover(map, 0, 0, 'S');
//        rover.moveRover(commands);
//        String actualPosition = rover.getPosition();
//        String expectedPosition = "0,0,W";
//
//        Assert.assertEquals(expectedPosition, actualPosition);
//    }
//
//    @Test
//    public void whenCommandIsRAndFacingWest_RoverTurnsRightChangingFacingDirectionToNorth() {
//        List<List<String>> map = new ArrayList<>();
//        List<String> row1 = Arrays.asList(" ", " ", " ");
//        map.add(row1);
//
//        List<String> commands = Arrays.asList("R");
//
//        rover.landRover(map, 0, 0, 'W');
//        rover.moveRover(commands);
//        String actualPosition = rover.getPosition();
//        String expectedPosition = "0,0,N";
//
//        Assert.assertEquals(expectedPosition, actualPosition);
//    }
//
//
//    @Test
//    public void whenCommandIsBAndFacingNorth_RoverMovesBackwardOneSpot() {
//        List<List<String>> map = new ArrayList<>();
//        List<String> row1 = Arrays.asList(" ", " ", " ");
//        List<String> row2 = Arrays.asList(" ", " ", " ");
//        List<String> row3 = Arrays.asList(" ", " ", " ");
//        map.add(row1);
//        map.add(row2);
//        map.add(row3);
//
//        List<String> commands = Arrays.asList("B");
//
//        rover.landRover(map, 2, 1, 'N');
//        rover.moveRover(commands);
//        String actualPosition = rover.getPosition();
//        String expectedPosition = "0,1,N";
//
//        Assert.assertEquals(expectedPosition, actualPosition);
//    }
//
//    @Test
//    public void whenCommandIsBAndFacingSouth_RoverMovesBackwardOneSpot() {
//        List<List<String>> map = new ArrayList<>();
//        List<String> row1 = Arrays.asList(" ", " ", " ");
//        List<String> row2 = Arrays.asList(" ", " ", " ");
//        List<String> row3 = Arrays.asList(" ", " ", " ");
//        map.add(row1);
//        map.add(row2);
//        map.add(row3);
//
//        List<String> commands = Arrays.asList("B");
//
//        rover.landRover(map, 0, 1, 'S');
//        rover.moveRover(commands);
//        String actualPosition = rover.getPosition();
//        String expectedPosition = "2,1,S";
//
//        Assert.assertEquals(expectedPosition, actualPosition);
//    }
//
//    @Test
//    public void whenCommandIsBAndFacingEast_RoverMovesBackwardOneSpot() {
//        List<List<String>> map = new ArrayList<>();
//        List<String> row1 = Arrays.asList(" ", " ", " ");
//        List<String> row2 = Arrays.asList(" ", " ", " ");
//        List<String> row3 = Arrays.asList(" ", " ", " ");
//        map.add(row1);
//        map.add(row2);
//        map.add(row3);
//
//        List<String> commands = Arrays.asList("B");
//
//        rover.landRover(map, 1, 1, 'E');
//        rover.moveRover(commands);
//        String actualPosition = rover.getPosition();
//        String expectedPosition = "1,0,E";
//
//        Assert.assertEquals(expectedPosition, actualPosition);
//    }
//
//    @Test
//    public void whenCommandIsBAndFacingWest_RoverMovesBackwardOneSpot() {
//        List<List<String>> map = new ArrayList<>();
//        List<String> row1 = Arrays.asList(" ", " ", " ");
//        List<String> row2 = Arrays.asList(" ", " ", " ");
//        List<String> row3 = Arrays.asList(" ", " ", " ");
//        map.add(row1);
//        map.add(row2);
//        map.add(row3);
//
//        List<String> commands = Arrays.asList("B");
//
//        rover.landRover(map, 0, 1, 'W');
//        rover.moveRover(commands);
//        String actualPosition = rover.getPosition();
//        String expectedPosition = "0,2,W";
//
//        Assert.assertEquals(expectedPosition, actualPosition);
//    }
//
//    @Test
//    public void whenCommandIsFAndFacingNorth_RoverMovesForwardOneSpot() {
//        List<List<String>> map = new ArrayList<>();
//        List<String> row1 = Arrays.asList(" ", " ", " ");
//        List<String> row2 = Arrays.asList(" ", " ", " ");
//        map.add(row1);
//        map.add(row2);
//
//        List<String> commands = Arrays.asList("F");
//
//        rover.landRover(map, 0, 1, 'N');
//        rover.moveRover(commands);
//        String actualPosition = rover.getPosition();
//        String expectedPosition = "1,1,N";
//
//        Assert.assertEquals(expectedPosition, actualPosition);
//    }
//
//    @Test
//    public void whenCommandIsFAndFacingSouth_RoverMovesForwardOneSpot() {
//        List<List<String>> map = new ArrayList<>();
//        List<String> row1 = Arrays.asList(" ", " ", " ");
//        List<String> row2 = Arrays.asList(" ", " ", " ");
//        List<String> row3 = Arrays.asList(" ", " ", " ");
//        map.add(row1);
//        map.add(row2);
//        map.add(row3);
//
//        List<String> commands = Arrays.asList("F");
//
//        rover.landRover(map, 1, 1, 'S');
//        rover.moveRover(commands);
//        String actualPosition = rover.getPosition();
//        String expectedPosition = "2,1,S";
//
//        Assert.assertEquals(expectedPosition, actualPosition);
//    }
//
//    @Test
//    public void whenCommandIsBAndFacingEast_RoverMovesForwardOneSpot() {
//        List<List<String>> map = new ArrayList<>();
//        List<String> row1 = Arrays.asList(" ", " ", " ");
//        List<String> row2 = Arrays.asList(" ", " ", " ");
//        List<String> row3 = Arrays.asList(" ", " ", " ");
//        map.add(row1);
//        map.add(row2);
//        map.add(row3);
//
//        List<String> commands = Arrays.asList("F");
//
//        rover.landRover(map, 1, 1, 'E');
//        rover.moveRover(commands);
//        String actualPosition = rover.getPosition();
//        String expectedPosition = "1,2,E";
//
//        Assert.assertEquals(expectedPosition, actualPosition);
//    }
//
//    @Test
//    public void whenCommandIsBAndFacingWest_RoverMovesForwardOneSpot() {
//        List<List<String>> map = new ArrayList<>();
//        List<String> row1 = Arrays.asList(" ", " ", " ");
//        List<String> row2 = Arrays.asList(" ", " ", " ");
//        map.add(row1);
//        map.add(row2);
//
//        List<String> commands = Arrays.asList("F");
//
//        rover.landRover(map, 0, 1, 'W');
//        rover.moveRover(commands);
//        String actualPosition = rover.getPosition();
//        String expectedPosition = "0,0,W";
//
//        Assert.assertEquals(expectedPosition, actualPosition);
//    }

}