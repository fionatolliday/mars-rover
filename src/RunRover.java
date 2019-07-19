import java.util.List;
import java.util.Scanner;

public class RunRover {


    public static void main(String[] args) {

        Rover rover = new Rover(new RoverEngine());
        CommandProcessor commandProcessor = new CommandProcessor();
        PlanetFactory planetFactory = new PlanetFactory();
        Planet mars = planetFactory.getAreaMap("mars");

        rover.landRover(mars.getAreaMap(), 1, 1, Direction.NORTH);

        boolean validInput = true;
        List<Command> userCommands;

        do{
            String userInputString = getUserInput();
            userCommands = commandProcessor.processInput(userInputString);
            if(!userCommands.isEmpty()){
                validInput = false;
            }

        } while(validInput);

        rover.moveRover(userCommands);
//        System.out.println(getPosition());

        // accept user commands
        // List<Enum> commands = processInput(userInput)
        // rover = new Rover(new RoverEngine())
        // rover.landRover(map, 1, 1, 'N')
        // rover.runRover(commands)

    }

    private static String getUserInput() {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Rover can turn left (L) and right(R) as well as move forward (F), " +
                "backwards (B).  \n Please enter your commands.  " +
                "\n" +
                "As " +
                "an example, it should look something like this: FFLBLRBF");

        return inputScanner.nextLine();
    }

}
