public class RoverPosition {

    private int positionX;
    private int positionY;
    private Direction facingDirection;

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public Direction getFacingDirection() {
        return facingDirection;
    }



    public RoverPosition(int positionX, int positionY, Direction facingDirection){
        this.positionX = positionX;
        this.positionY = positionY;
        this.facingDirection = facingDirection;
    }
}
