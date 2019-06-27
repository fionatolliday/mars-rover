import java.util.List;


public class RunRover {


    public static void main(String[] args) {

        Rover rover = new Rover();
        Commands commands = new Commands();


        System.out.println("Rover has landed on Mars at position " + rover.roversStartingPosition() + ". \n");

        String userInput = commands.gainUserCommandAsString(commands.getInput);
        List<Character> arrOfCommands = commands.splitUserInputString(userInput);

        rover.userCommandsToMoveRover(arrOfCommands);
    }

}
