This console app built using the Java language first asks the user for the area of a square. The app then uses the square root of that entered value as its radius to create a circle. The app then prints out the ratio of the area of the circle to the area of the square.
Next the app asks a number in order to repeat the following operation that will approximate the value of PI. The larger the number the more accurate the approximation.

The idea is that the area of the square is multiplied by a random number between 0 and 1 and then the resulting number is repeatedly checked if it is smaller than the area if the circle, and if it is, then a ratio counter is increased while at the end of every iteration another ratio counter is also increased that acts as the devisor to the first one.
With enough iterations this ratio should approach the value of PI.
