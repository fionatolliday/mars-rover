import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class CommandProcessorTest {

    CommandProcessor commandProcessor = new CommandProcessor();


    @Test
    public void whenGivenInputAsString_ItShouldReturnSameInputInAnArrayList() {
        String testCommands = "FLBR";

        List<Command> arrayOfCommands = new ArrayList<>();
        arrayOfCommands.add(Command.FORWARDS);
        arrayOfCommands.add(Command.LEFT);
        arrayOfCommands.add(Command.BACKWARDS);
        arrayOfCommands.add(Command.RIGHT);

        List<Command> actualArrayOfCommands = commandProcessor.processInput(testCommands);

        Assert.assertEquals(arrayOfCommands, actualArrayOfCommands);
    }

}