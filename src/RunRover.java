import java.util.List;
import java.util.Scanner;

public class RunRover {


    public static void main(String[] args) {

        Rover rover = new Rover();
        CommandProcessor commandProcessor = new CommandProcessor();
        PlanetFactory planetFactory = new PlanetFactory();
        Scanner getInput = new Scanner(System.in);

        Planet mars = planetFactory.getAreaMap("mars");

        List<List<String>> map = mars.getAreaMap();

        rover.landRover(map, 1, 1, 'N');

        System.out.println("Rover has landed on Mars at position " + rover.getPosition() +
                ". \n");

        String userInputString;
        do {
            System.out.println("Rover can turn left (L) and right(R) as well as move forward (F), " +
                    "backwards (B).  \n Please enter your commands.  " +
                    "\n" +
                    "As " +
                    "an example, it should look something like this: FFLBLRBF");

            userInputString = getInput.nextLine();
        }
        while (!commandProcessor.processCommands(userInputString));

        rover.moveRover(commandProcessor.splitUserInputString(userInputString));



        // accept user commands
        // List<Enum> commands = processCommands(userInput)
        // rover = new Rover(new RoverEngine())
        // rover.landRover(map, 1, 1, 'N')
        // rover.runRover(commands)
    }

}
