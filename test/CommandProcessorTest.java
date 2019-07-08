import org.junit.Assert;
import org.junit.Test;

public class CommandProcessorTest {

    CommandProcessor commandProcessor = new CommandProcessor();

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