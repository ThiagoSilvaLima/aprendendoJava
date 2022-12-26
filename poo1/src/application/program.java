package application;

import entities.triangle;

public class program {

	public static void main(String[] args) {
		triangle Y, X;
		Y = new triangle();
		X = new triangle();

		X.a = 3;
		X.b = 4;
		X.c = 5;

		Y.a = 7.5;
		Y.b = 4.5;
		Y.c = 4.02;

		X.calcArea();
		Y.calcArea();

		System.out.printf("Area do Y=%.04f\nArea do X=%.04f", X.area, Y.area);

	}

}
