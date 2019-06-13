public class Rover {

    private Rover rover;

    private int positionX;
    private int positionY;
    private char facingDirection;


    public Rover getRover() {
        return rover;
    }


    public String roversStartingPosition() {
        String startingPosition="";
        startingPosition += positionX + ",";
        startingPosition += positionY + ",";
        startingPosition += facingDirection;
        return startingPosition;
    }




//    public String changeFacingDirectionOfRover(){
//
//    }


    public Rover() {
        this.positionX = 0;
        this.positionY = 0;
        this.facingDirection = 'N';
    }
}
