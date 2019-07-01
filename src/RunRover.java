import java.util.List;


public class RunRover {


    public static void main(String[] args) {

        Rover rover = new Rover();
        Commands commands = new Commands();
        PlanetFactory planetFactory = new PlanetFactory();


        Planet mars = planetFactory.getAreaMap("mars");
        List<List<String>>  map = mars.getAreaMap();
        int positionX = 5;
        int positionY = 4;
        char facingDirection = 'N';
        rover.landRover(map, positionX, positionY, facingDirection);
        System.out.println("Rover has landed on Mars at getPosition " + rover.getPosition() +
                ". \n");

        List<Character> arrayOfCommands = commands.getArrOfCommands();
        rover.moveRover(arrayOfCommands);
    }

}
