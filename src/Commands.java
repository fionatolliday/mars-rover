import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Commands {


    Scanner getInput = new Scanner(System.in);
    String commandInputString;

    public void gainUserCommandAsString() {
        System.out.println("Rover can turn left (L) and right(R) as well as move forward (F), " +
                "backwards (B).  \n Using capital letters, please enter your commands.  " +
                "\n" +
                "As " +
                "an example, It should look something like this: FFLBLRBF");
        commandInputString = getInput.nextLine();
    }


    List<Character> arrOfcommands = new ArrayList<>();

    public List<Character> arrayOfCommands(String commandInputString) {

        for (int i = 0; i < commandInputString.length(); i++) {
            arrOfcommands.add(commandInputString.charAt(i));
        }
        return arrOfcommands;
    }

}

