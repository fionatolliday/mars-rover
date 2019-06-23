import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommandsTest {
    private Commands commands;

    @Before
    public void setUp() throws Exception {
        commands = new Commands();
    }

    @Test
    public void takesUserInputAndPutsIntoArrayOfCharacters() {
        List<Character> expectedArrayOfCommands = Arrays.asList('F', 'B', 'L', 'R');
        List<Character> actual = commands.splitUserInputString("FBLR");

        Assert.assertEquals(expectedArrayOfCommands, actual);
    }


    @Test
    public void commandsAreValid() {
        List<Character> testCommands = new ArrayList<>();
        testCommands.add('L');
        testCommands.add('F');
        testCommands.add('b');

        Assert.assertFalse(commands.validateCommands(testCommands));
    }

    @Test
    public void itShouldReturnFalse_WhenInputHasInvalidCharacters() {
        List<Character> testCommands = new ArrayList<>();
        testCommands.add('L');
        testCommands.add('F');
        testCommands.add('x');

        Assert.assertTrue(commands.validateCommands(testCommands));
    }


}