import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Commands {


    Scanner getInput = new Scanner(System.in);
    String commandInputString;

    public void gainUserCommandAsString() {
        System.out.println("Using capital letters, please enter your commands " +
                "for example FBLR");
        commandInputString = getInput.nextLine();
    }

    public List<Character> arrayOfCommands() {
        List<Character> arrOfcommands = new ArrayList<>();

        for (int i = 0; i < commandInputString.length(); i++) {
            arrOfcommands.add(commandInputString.charAt(i));
        }
        return arrOfcommands;
    }
}

//        for (char command : userCommands){
//            return command;
