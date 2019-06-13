public class Location {

    private Location Location;
    private int startPositionX;
    private int startPositionY;
    private char facingNorth;
    private char facingSouth = 'S';
    private char facingEast = 'E';
    private char facingWest = 'W';


    public Location(){
        this.startPositionX = 0;
        this.startPositionY = 0;
        this.facingNorth = 'N';
    }

    public Location getLocation(){
        return Location;
    }
}
