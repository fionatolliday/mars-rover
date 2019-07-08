# mars-rover
## About me
Please enjoy my Mars Rover kata written in Java.
My coding journey began 10 months ago after switching careers.
I went through a 6 month intensive bootcamp before joining the FMA at MYOB in February.
I have been learning Java code since February, so a total of four months.  This is my first code
presentation.

## About the code

### JUnit Testing
In building Mars Rover, I used the JUnit library to run the unit tests.

### Run Rover
I created a RunRover class as a start point to run this project.
Within this class is a main function that reads from command line, and from the Rover Class it uses
the runRover function to send rover on his way before printing the rovers journey to the command
line, including whether or not he hit an obstacle before terminating.
.

The main method is where the user can select a planet to land rover before hardcoding the landing
coordinates of Rover on the selected planet.

When the play button is selected, the user can put in their commands to move the rover.
The four commands are L (left), R (right), F (forward), B (backward).
If the list of commands includes even one invalid command, the system will loop and ask the user to
input their commands.
Commands can be inputted in lowercase or uppercase.
Once the list of commands have been implemented by the program, the program will automatically print
 the rover journey before exiting.

### Mars
Mars has been created on a 3x3 grid.
The X-axis represents the horizontal axis, whilst the Y-axis represents the vertical axis.
The areaMap includes two obstacles at position 0,2 and position 2,1.

### Rover
Rover has a position.  The position includes an x-coordinate, a y-coordinate and a facing direction.
The facing direction can be north (N), south (S), east (E) or west (W).
With an L or R command, Rover can change facing direction by turning left (L) or turning right (R).
Rover can move one spot at a time; either one step forward or one step backward.
Rover does not move diagonally and cannot move into a position on the grid that has an obstacle.

## The Mars Rover problem
Develop an api that moves a rover around on a grid.

You are given the initial starting point (x,y) of a rover and the direction (N,S,E,W) it is facing. The rover receives a character array of commands.

Implement commands that move the rover forward/backward (f,b).
Implement commands that turn the rover left/right (l,r).
Implement wrapping from one edge of the grid to another. (planets are spheres after all)
Implement obstacle detection before each move to a new square. If a given sequence of commands encounters an obstacle, the rover moves up to the last possible point and reports the obstacle.

## Additional notes
I have created Mars on a 3x3 grid that wraps.
The code allows for lower case or upper case user input.
Input is checked for any invalid characters and will re-loop to the instructions if invalid
character commands are detected.
Once Rover has travelled successfully or unsuccessfully (due to obstacle) across Mars, an output of
his journey will be outputted to the screen.