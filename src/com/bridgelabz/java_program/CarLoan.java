package com.bridgelabz.java_program;

import java.text.NumberFormat;
import java.util.Scanner;

public class CarLoan {
	public static double calculateMonthlyPayment(
            int loanAmount, int termInYears, double interestRate) {
        interestRate /= 100.0;
        double monthlyRate = interestRate / 12.0;
        int termInMonths = termInYears * 12;
        double monthlyPayment =
                (loanAmount*monthlyRate) /
                        (1-Math.pow(1+monthlyRate, -termInMonths));
        return monthlyPayment;
    }
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Car loan amount: ");
        int loanAmount = sc.nextInt();
        System.out.print("Enter loan term (in years): ");
        int termInYears = sc.nextInt();

        System.out.print("Enter interest rate: ");
        double interestRate = sc.nextDouble();


        double monthlyPayment = calculateMonthlyPayment(loanAmount, termInYears, interestRate);

        NumberFormat currencyFormat =
                NumberFormat.getCurrencyInstance();
        NumberFormat interestFormat =
                NumberFormat.getPercentInstance();

        System.out.println("Loan Amount: "+
                currencyFormat.format(loanAmount));
        System.out.println("Loan Term: "+
                termInYears+" years");
        System.out.println("Interest Rate: "+
                interestFormat.format(interestRate));
        System.out.println("Monthly Payment: "+
                currencyFormat.format(monthlyPayment));
    }
}
