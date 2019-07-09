# Mars Rover
The Mars Rover kata problem can be viewed [here](https://github
.com/fionatolliday/mars-rover/blob/master/TheProblem.md)

# Run project

### Running the code
Needs: `Java` installed

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
4. Create jar file by following steps at: (https://stackoverflow
.com/questions/1082580/how-to-build-jars-from-intellij-properly)
5. In terminal, navigate to local folder where jar file was saved
6. Run command `java -jar MarsRover.jar`
7. Play game


## About the code

### Interacting with Rover
The four commands that Rover requires to move are L (left), R (right), F (forward), B (backward).
If the list of commands includes even one invalid command, the system will loop and ask the user to
input their commands.
Commands can be inputted in lowercase or uppercase.
Once the list of commands have been implemented by the program, the program will automatically print
the rover journey before exiting.

### Run Rover
The `RunRover` class was created as a start point to run this project.
Within this class is a `main` function that reads from the command line.

It is in the `main` method where Rover has been hardcoded to land at coordinates 1,1,N on planet Mars.


The `main` function accesses the `Rover` Class and the `runRover` function in order to send rover on his
journey.  When the journey concludes, his journey will be printed to the
command line, including whether or not he hit an obstacle before terminating.

### Mars
Mars has been created on a 3x3 grid.
The X-axis represents the horizontal axis, whilst the Y-axis represents the vertical axis.
The areaMap includes two obstacles at position 0,2 and position 2,1.

`Mars` implements from the `Planet` interface.  The interface has been created as part of a factory
pattern.  Rover is dependent on an areaMap.  Therefore planetFactory has been created to allow
additional planets be added for Rover to roam.

### Rover
Rover has a position.  The position includes an x-coordinate, a y-coordinate and a facing direction.
The facing direction can be north (N), south (S), east (E) or west (W).
With an L or R command, Rover can change facing direction by turning left (L) or turning right (R).

Rover can move one spot at a time; either one step forward or one step backward.
Rover does not move diagonally and cannot move into a position on the grid that has an obstacle.
When checking for his next move Rover checks the highest and lowest boundary to ensure he continues
his journey **around** the world.

