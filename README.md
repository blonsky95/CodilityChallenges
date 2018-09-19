# CodilityChallenges
In this repository there is a sample of solutions to challenges from the codility platform. The challenges and questions
are Codility's posession and so they wont be disclosed. Instead a detailed explanation of what the program does and what
kind of problem it solves is given. No references to the actual challenges are given.

ProblemSolving1
The program returns the number of possibilities in which a "kingdom" of size N*M can be divided with a horizontal or vertical
line, while maintaining the same number of "gold mines" (X.length/2) at each side of the divided kingdom.
The parameters are 
N - horizontal magnitude of kingdom
M - vertical magnitude of kingdom
X[] - X coordinate of gold mines
Y[] - Y coordinate of gold mines

E.g. given (5,5,{0,4,2,0},{0,0,1,4}) the return value will be 3 as there is 3 straight lines that can divide the kingdom
in such way that there is 2 gold mines in each side.


ProblemSolving2
This program returns the maximum number of different integers that can be selected from two arrays(X,Y) of length L when
you can only select L/2 integers of each array.
The parameters are
X [] - integers in array X
Y []- integers in array Y

E.g. if X= {3,3,3,1,5,6} and Y= {3,7,4,3,3,3}, selecting 1,5 and 6 from X, and 3,7,4 from Y would provide the maximum 
number of different integers, 6 (As opposed to 3,3 and 3 from array X and 3,7 and 4 from array Y which would add up
to 3 different integers).

ProblemSolving3
This program is set on a dominoes scenario. It returns the maximum number of dominoes that can be played ingame given
two arrays X and Y of length L which represent L number of dominoes and X[i] and Y[i] are the 2 numbers displayed
in the dominoe

E.g. given  X= {3,3,1,5,6}  Y= {3,4,3,2,6}, the program would return 4, as the number 3 can be played a maximum of 4
times (considering the double number dominoe as 2 times so dominoe 3-3, dominoe 3-4 and dominoe 3-1 for a total of 4).

ProblemSolving4
This program follows a set of commands given by a string which modify the contents of a Stack. It returns the number 
at the top of the stack after all the instructions. The possible intructions are:
Integer --> Add integer to top of stack e.g. 3, 11, 0...
+ --> Substitute the integer at the top of the stack by the sum of the first and second topmost integers of the stack.
- --> Substitute the integer at the top of the stack by the topmost integer minus the second topmost integer.
DUP --> Duplicates the integer at the top of the stack by placing that same integer to the top again.
POP --> Deletes the topmost integer from the stack.

The only parameter is a string which contains all the instructions, for example "5 4 + POP 11 DUP +"
E.g. "5 4 + POP 11 DUP +" would follow this stack sequence:
[5]
[5,4]
[5,9]
[5]
[5 11]
[5 11 11]
[5 11 22]
value to be returned: 22

problemSolving5
This problem is more mathematical and graphical. It returns the coordinates of the first point
a line meets after turning 90 degrees clockwise, after going from point A (AX,AY) to point B (BX,BY). 
E.g. if A is (0,0) and B is (2,6), the program will return 5,5 as shown below:
![alt text](https://imgur.com/a/WcukkMT)

problemSolving6
This problem breaks down a string composed of the 3 types of brackets "()","[]" and "{}" and returns a value to
check if the string is valid (1) or not (0). For example "([])" is valid, but "([)]" or "{[())}" are not.
The parameter is a string such as "[{}(([]){})]"
E.g. such a string would return the value 1, as its syntax is correct.


