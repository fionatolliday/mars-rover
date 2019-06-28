import java.util.List;


public class RunRover {


    public static void main(String[] args) {

        Rover rover = new Rover();
        Commands commands = new Commands();
        Mars mars = new Mars();

        System.out.println("Rover has landed on Mars at getPosition " + rover.getPosition() + ". \n");

        rover.landRover(mars.getAreaMap());
        List<Character> arrayOfCommands = commands.getArrOfCommands();
        rover.userCommandsToMoveRover(arrayOfCommands);
    }

}
