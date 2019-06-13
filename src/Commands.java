import java.util.ArrayList;
import java.util.List;

public class Commands {



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
