import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Commands {


    Scanner getInput;
    String commandInputString;
    List<Character> arrOfCommands;

    public Commands() {
        this.getInput = new Scanner(System.in);
        this.arrOfCommands = new ArrayList<>();
    }

    public void gainUserCommandAsString() {
            System.out.println("Rover can turn left (L) and right(R) as well as move forward (F), " +
                    "backwards (B).  \n Please enter your commands.  " +
                    "\n" +
                    "As " +
                    "an example, it should look something like this: FFLBLRBF");

            commandInputString = getInput.nextLine().toUpperCase();
    }

    public List<Character> convertToArrayOfCommands(String commandInputString) {

        for (int i = 0; i < commandInputString.length(); i++) {
            arrOfCommands.add(commandInputString.charAt(i));
        }
        return arrOfCommands;
    }


}




