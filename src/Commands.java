import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Commands {


    Scanner getInput;

    public Commands() {
        this.getInput = new Scanner(System.in);
    }

    public String gainUserCommandAsString(Scanner getInput) {
        String commandInputString = "";

        do {
            System.out.println("Rover can turn left (L) and right(R) as well as move forward (F), " +
                    "backwards (B).  \n Please enter your commands.  " +
                    "\n" +
                    "As " +
                    "an example, it should look something like this: FFLBLRBF");

            commandInputString = getInput.nextLine().toUpperCase();
        }
        while(validateCommands(splitUserInputString(commandInputString)));

        return commandInputString;
    }


    public List<Character> splitUserInputString(String userInput) {
        List<Character> arrOfCommands = new ArrayList<>();

        char[] userInputChars = userInput.toCharArray();
        for (int i = 0; i < userInput.length(); i++) {
            char current = userInputChars[i];
            arrOfCommands.add(current);
        }
        return arrOfCommands;
    }


    public boolean validateCommands(List<Character> commands) {
        for (int i = 0; i < commands.size(); i++) {
            char characterCommand = commands.get(i);
            char characterCommandUpperCase = Character.toUpperCase(characterCommand);
            if (characterCommandUpperCase != 'F' && characterCommandUpperCase != 'B' && characterCommandUpperCase != 'L' && characterCommandUpperCase != 'R') {
        return true;
            }
        } return false;
    }

}
