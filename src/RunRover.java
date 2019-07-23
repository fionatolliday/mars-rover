import Interface.Planet;
import commands.CommandProcessor;
import enums.Command;
import enums.Direction;
import planet.PlanetFactory;
import rover.Rover;
import rover.RoverEngine;
import rover.RoverPosition;
import java.util.List;
import java.util.Scanner;

public class RunRover {

    public static void main(String[] args) {

        Rover rover = new Rover(new RoverEngine());
        CommandProcessor commandProcessor = new CommandProcessor();
        PlanetFactory planetFactory = new PlanetFactory();
        Planet mars = planetFactory.getAreaMap("mars");
        RoverPosition landingPosition = new RoverPosition(1,1, Direction.NORTH);

        rover.landRover(mars.getAreaMap(), landingPosition);

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
    }


    private static String getUserInput() {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("rover.Rover can turn left (L) and right(R) as well as move forward (F), " +
                "backwards (B).  \n Please enter your commands.  " +
                "\n" +
                "As " +
                "an example, it should look something like this: FFLBLRBF");

        return inputScanner.nextLine();
    }

}
