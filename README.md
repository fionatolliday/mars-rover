# Rover
The Rover kata problem can be viewed [here](https://github.com/MYOB-Technology/General_Developer/blob/master/katas/kata-mars-rover/kata-mars-rover.md)

# Run project

### Prerequisite Section
Needs: `Java` installed

### Running the code
1. Go to git repository: [gitHub](https://github.com/fionatolliday/mars-rover)
2. Go to the `out` folder and download the `MarsRover.jar` file
3. In terminal, navigate to local folder where jar file was downloaded
4. Run command `java -jar MarsRover.jar`
5. Play game

### Setting up your dev environment
Needs: `Java` installed & `intelliJ` (SDK11)

1. Go to git repository: [gitHub](https://github.com/fionatolliday/mars-rover)
2. Clone repository
3. Open intelliJ and navigate to folder with repository. Open file.
4. Create JAR file:
    * In intelliJ go to File, Project Structure, Artifacts
    * Press the + sign to add Artifact
    * Select JAR, from modules with dependencies
    * Select the main class, hit OK and then hit OK again
5. Build JAR file:
    * In intelliJ go to Build menu, Build artifact, Click build
    * JAR folder will appear in the 'out' folder of the file
6. In terminal, navigate to local folder where jar file was saved
7. Run command `java -jar MarsRover.jar`
8. Input commands to move rover.Rover


## About the code

### Interacting with rover.Rover
The four commands that rover.Rover requires to move are L (left), R (right), F (forward), B (backward).
If the list of commands includes even one invalid command, the system will loop and ask the user to
input their commands.
enums.Command can be inputted in lowercase or uppercase.
Once the list of commands have been implemented by the program, the program will automatically print
the rover journey before exiting.

### Run rover.Rover
The `RunRover` class was created as a start point to run this project.
Within this class is a `main` function that reads from the command line.

It is in the `main` method where rover.Rover has been hardcoded to land at coordinates 1,1,N on planet planet.Mars.
If the landing coordinates are changed to land a) out of bounds of the map or b) where an obstacle
lies, an illegal argument will be thrown.


The `main` function accesses the `rover.Rover` Class and the `runRover` function in order to send rover on his
journey.  When the journey concludes, his journey will be printed to the
command line, including whether or not he hit an obstacle before terminating.

### planet.Mars
planet.Mars has been created on a 3x3 grid.
The X-axis represents the horizontal axis, whilst the Y-axis represents the vertical axis.
The areaMap includes two obstacles at position 0,2 and position 2,1.

`planet.Mars` implements from the `Interface.Planet` interface.  The interface has been created as part of a factory
pattern.  rover.Rover is dependent on an areaMap.  Therefore planetFactory has been created to allow
additional planets be added for rover.Rover to roam.

### rover.Rover
rover.Rover has a position.  The position includes an x-coordinate, a y-coordinate and a facing direction.
The facing direction can be north (N), south (S), east (E) or west (W).
With an L or R command, rover.Rover can change facing direction by turning left (L) or turning right (R).

rover.Rover can move one spot at a time; either one step forward or one step backward.
rover.Rover does not move diagonally and cannot move into a position on the grid that has an obstacle.
When checking for his next move rover.Rover checks the highest and lowest boundary to ensure he continues
his journey **around** the world.


### Assumptions made when building
* The code is built so that it takes an initial set of commands to move rover.  The program will
exit once these commands have been executed.
* For each command, rover.Rover will make one turn or move one position.
* rover.Rover can move forward or backward, not diagonal.
* rover.Rover is currently coded to land at position 1,1,N
* planet.Mars is a 3x3 grid. rover.Rover will check for boundaries on this grid as well as obstacles.


