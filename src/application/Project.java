package application;

import java.util.Locale;
import java.util.Scanner;

import ultil.CurrencyConverter;

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar priece? ");
		double valorDolar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double quantDolar = sc.nextDouble();
		
		double valorTotal = CurrencyConverter.comprarDolar(valorDolar, quantDolar);
		System.out.println("Amount to be paid in reais = " + String.format("%.2f", valorTotal));	
		
		sc.close();
	}

}
