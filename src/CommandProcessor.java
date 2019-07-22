import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CommandProcessor {


    public List<Command> processInput(String userInput) {

        List<String> listOfCommandStrings = splitUserInputString(userInput);

        List<Command> commands =  new ArrayList<>();

        for ( String commandString : listOfCommandStrings){
            try{
                Command command = convert(commandString);
                commands.add(command);
            } catch(IllegalArgumentException e){
                return new ArrayList<>();
            }

        }
        return commands;
    }


    private List<String> splitUserInputString(String userInput) {
        String[] userInputCommands = userInput.split("");
        return Arrays.asList(userInputCommands);
    }


    private Command convert(String commandString){
        if(commandString.equalsIgnoreCase("f")){
            return Command.FORWARDS;
        } else if (commandString.equalsIgnoreCase("b")){
            return Command.BACKWARDS;
        } else if (commandString.equalsIgnoreCase("l")){
            return Command.LEFT;
        } else if (commandString.equalsIgnoreCase("r")){
            return Command.RIGHT;
        } else throw new IllegalArgumentException("Invalid command. Try again");
    }

}
