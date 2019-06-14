import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CommandsTest {

    @Test
    public void takesUserInputAndPutsIntoArrayOfCharacters() {
        Commands commands = new Commands();

        List<Character> expected = Arrays.asList('F', 'B', 'L', 'R');
        List<Character> actual = commands.arrayOfCommands("FBLR");

        Assert.assertEquals(expected, actual);
    }

}