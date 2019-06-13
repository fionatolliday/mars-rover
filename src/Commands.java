import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Commands {


    Scanner getInput = new Scanner(System.in);  // Create a Scanner object
    public void gainUserCommandAsString(){
        System.out.println("Using capital letters and seperated by a comma, enter your commands " +
                "for example F,B,L,R" );
        String commandInputString = getInput.nextLine();  // Read user input
        System.out.println(commandInputString);
    }

    public char singleCommand() {
        List<Character> commands = new ArrayList<>();
        commands.add('F');
        commands.add('B');

        char command = 'N';
        for (int i = 0; i < commands.size(); i++){
            command = commands.get(i);
            return command;
        }
       return command;
    }
}
