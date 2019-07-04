import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class CommandProcessor {


    public boolean processCommands(String userInput) {
        List<String> listOfCommands = splitUserInputString(userInput);

        return validateCommands(listOfCommands);
    }


    public List<String> splitUserInputString(String userInput) {

        String[] userInputCommands = userInput.split("");
        return Arrays.asList(userInputCommands);
    }

    private boolean validateCommands(List<String> commands) {

        for (String characterCommand : commands) {
            if (!isValid(characterCommand)) {
                return false;
            }
        }
        return true;
    }

    private boolean isValid(String command) {
        return command.equalsIgnoreCase("F") || command.equalsIgnoreCase("B") || command.equalsIgnoreCase("L") || command.equalsIgnoreCase("R");
    }

}
