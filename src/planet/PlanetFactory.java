package planet;

import Interface.Planet;

public class PlanetFactory {

    public Planet getAreaMap (String planetName){
        if(planetName == null){
            return null;
        }
        if(planetName.equalsIgnoreCase("Mars")) {
            return new Mars();
        }
        return null;
    }
}
