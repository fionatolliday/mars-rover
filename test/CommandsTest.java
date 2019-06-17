import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CommandsTest {
    Commands commands;

    @Before
    public void setUp() throws Exception {
        commands = new Commands();
    }


//    @Test
//    public void takesUserInputAndPutsIntoArrayOfCharacters() {
//        List<Character> expectedArrayOfCommands = Arrays.asList('F', 'B', 'L', 'R');
//        List<Character> actual = commands.arrayOfCommands("FBLR");
//
//        Assert.assertEquals(expectedArrayOfCommands, actual);
//    }

}