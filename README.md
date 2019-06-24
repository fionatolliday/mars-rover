# mars-rover
## About me
Please enjoy my Mars Rover kata written in Java.
My coding journey began 10 months ago after switching careers.
I went through a 6 month intensive bootcamp before joining the FMA at MYOB in February.
I have been learning Java code since February, so a total of four months.  This is my first code
presentation.

## About the code
In construction of this code, i took a test first approach.
After mapping out the problem on paper, i first put a set of tests in place.  This provided me
with clarity and a simple structure that would then assist me in building clean methods with a
single purpose.

This was the first time i have ever refactored my code to reduce/attempt to eliminate as much
duplication as possible. This in turn helped me to remove any expired code that was no longer
required for the end game.

## The Mars Rover problem
Develop an api that moves a rover around on a grid.

You are given the initial starting point (x,y) of a rover and the direction (N,S,E,W) it is facing. The rover receives a character array of commands.

Implement commands that move the rover forward/backward (f,b).
Implement commands that turn the rover left/right (l,r).
Implement wrapping from one edge of the grid to another. (planets are spheres after all)
Implement obstacle detection before each move to a new square. If a given sequence of commands encounters an obstacle, the rover moves up to the last possible point and reports the obstacle.