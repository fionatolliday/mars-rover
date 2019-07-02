import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Commands {

    private Scanner getInput() {
        return new Scanner(System.in);
    }

    public String gainUserCommandAsString() {
        String userInputString;

        do {
            System.out.println("Rover can turn left (L) and right(R) as well as move forward (F), " +
                    "backwards (B).  \n Please enter your commands.  " +
                    "\n" +
                    "As " +
                    "an example, it should look something like this: FFLBLRBF");

            userInputString = getInput().nextLine();
        }
        while (validateCommands(splitUserInputString(userInputString)));

        return userInputString;
    }

    private List<String> splitUserInputString(String userInput) {
        List<String> arrOfCommands = new ArrayList<>();

        String[] userInputCommands = userInput.split("");
        for (int i = 0; i < userInput.length(); i++) {
            String current = userInputCommands[i].toUpperCase();
            arrOfCommands.add(current);
        }
        return arrOfCommands;
    }

    public List<String> getArrOfCommands() {
        return splitUserInputString(gainUserCommandAsString());
    }


    private boolean validateCommands(List<String> commands) {
        for (String characterCommand : commands) {
            if (characterCommand.equals('F') || characterCommand.equals('B') || characterCommand.equals('L') || characterCommand.equals('R')) {
                return true;
            }
        }
        return false;
    }

}
