//import org.junit.Test;
//
//import java.util.List;
//
//public class CommandProcessorTest {
//
//    CommandProcessor commandProcessor = new CommandProcessor();
//
//
////    @Test
////    public void whenGivenFLBR_ItShouldReturnTrue() {
////        String testCommands = "FLBR";
////
////        Assert.assertTrue(commandProcessor.processInput(testCommands));
////    }
////
////    @Test
////    public void itShouldReturnFalse_WhenInputHasInvalidCharacters() {
////        String testCommands = "BXB";
////
////        Boolean expected = false;
////        Boolean actual = commandProcessor.processInput(testCommands);
////
////        Assert.assertEquals(expected, actual);
////    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void itShouldReturnError_WhenInputHasInvalidCharacters() {
//        String testCommands = "BXB";
//
//        List<Command> actual = commandProcessor.processInput(testCommands);
//
////        Assert.assertEquals(expected, actual);
//    }
//
//}