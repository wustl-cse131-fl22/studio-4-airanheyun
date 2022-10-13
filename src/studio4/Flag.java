package studio4;

import java.awt.Color;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//double x=in.nextDouble();
		//double y=in.nextDouble();
		//double halfLength=in.nextDouble();
	//StdDraw.filledSquare(1,1,1);
	StdDraw.setPenColor(3, 2, 7);
	StdDraw.filledCircle(1,1,1);
	StdDraw.setPenColor(25, 87, 78);
	StdDraw.filledCircle(1,1,0.5);
	StdDraw.setPenColor(87, 25, 78);
	StdDraw.filledCircle(0,0,0.4145);
	}
}