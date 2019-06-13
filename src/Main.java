import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Mars mars = new Mars();
        Rover rover = new Rover();
        Commands commands = new Commands();


        System.out.println("Rover has landed on Mars at position " + rover.roversStartingPosition() + ". \n");
        commands.gainUserCommandAsString();


//        char[] userCommands = commandInputString. toCharArray();
//
//        for (char command : userCommands){
//            return command;
    }


}
