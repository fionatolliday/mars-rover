import java.util.List;


public class RunRover {


    public static void main(String[] args) {

        Rover rover = new Rover();
        Commands commands = new Commands();


        System.out.println("Rover has landed on Mars at position " + rover.roversStartingPosition() + ". \n");

        List<Character> arrayOfCommands = commands.getArrOfCommands();
        rover.userCommandsToMoveRover(arrayOfCommands);
    }

}
