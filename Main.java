//Ricardo Terrazas
//CS 113-H01
//ID - 21817096
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double size;
		int times;
		System.out.println("Please enter the area for your square.");
		size = scan.nextDouble();
		Pi exp = new Pi(size);
		System.out.println("The ratio of the area of the circle to the square is " + exp.getAreaRatios());
		System.out.println("The probability that a point at random will be in the circle " + exp.probability());
		System.out.println("Now enter the number of times you wish to repeat the experiment");
		times = scan.nextInt();
		System.out.println("Loading...");
		System.out.println("The approximate value of pi is " + exp.getPi(times));
	}

}