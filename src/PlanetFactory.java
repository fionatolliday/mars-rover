public class PlanetFactory {

    public Planet getAreaMap (String planetName){
        if(planetName == null){
            return null;
        }
        if(planetName.equalsIgnoreCase("Mars")) {
            return new Mars();
        } else if(planetName.equalsIgnoreCase("Earth")){
            return new Earth();
        }
        return null;
    }
}
