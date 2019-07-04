import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommandProcessorTest {

    CommandProcessor commandProcessor = new CommandProcessor();


//    @Test
//    public void whenGivenAStringOfCommands_itReturnsAnArrayOfStringCommands() {
//        String commandString = "FLBR";
//
//        List<String> commandsExpected = Arrays.asList("F", "L", "B", "R");
//
//        List<String> commandsActual = commandProcessor.getArrOfCommands(commandString);
//
//        Assert.assertEquals(commandsExpected, commandsActual);
//    }


    @Test
    public void whenGivenFLBR_ItShouldReturnTrue() {
        String testCommands = "FLBR";

        Assert.assertTrue(commandProcessor.processCommands(testCommands));
    }


    @Test
    public void itShouldReturnFalse_WhenInputHasInvalidCharacters() {
        String testCommands = "BXB";

        Boolean expected = false;
        Boolean actual = commandProcessor.processCommands(testCommands);

        Assert.assertEquals(expected, actual);
    }


}