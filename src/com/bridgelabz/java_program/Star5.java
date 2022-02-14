package com.bridgelabz.java_program;

public class Star5 {
	public static void main(String args[]) {
		double a = Math.random();
		double b = Math.random();
		double c = Math.random();
		double d = Math.random();
		double e = Math.random();
		double result;
		double result1;
		System.out.println("Five values are = " + a + " " + b + " " + c + " " + d + " " + e);
		double avg = (a + b + c + d + e) / 2;
		System.out.println("Averge of above randoms numbers are = " + avg);

		result = maximum(a, b, c, d, e);
		System.out.println("Maximum value of the above random numbers are: " + result);
		result1 = minimum(a, b, c, d, e);
		System.out.println("Minimum value of the above random numbers are: " + result1);
	}

	public static double maximum(double a, double b, double c, double d, double e) {

		double maximumValue = a;
		if (b > maximumValue)
			maximumValue = b;
		if (c > maximumValue)
			maximumValue = c;
		if (d > maximumValue)
			maximumValue = d;
		if (e > maximumValue)
			maximumValue = e;
		return maximumValue;

	}

	public static double minimum(double a, double b, double c, double d, double e) {

		double minimumValue = a;
		if (b < minimumValue)
			minimumValue = b;
		if (c < minimumValue)
			minimumValue = c;
		if (d < minimumValue)
			minimumValue = d;
		if (e < minimumValue)
			minimumValue = e;
		return minimumValue;

	}
}
