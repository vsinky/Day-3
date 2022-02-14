package com.bridgelabz.java_program;

import java.util.Scanner;

public class WindChill {
 public static void main(String args[]) {
	 System.out.println("");
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter temperature in Fahrenheit: ");
	 double t = sc.nextDouble();
	 System.out.println("Enter a wind speed (in miles per hr): ");
	 double v = sc.nextDouble();
	 
	 double windChill = 35.74 + (0.6215 * t) + ((0.4275 * t -35.75));
	 
	 System.out.printf("Wind Chill is: %.2f", windChill);
 }
}
