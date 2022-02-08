package ultil;

public class CurrencyConverter {
	public static double comprarDolar(double preco, double quantos){
		double total = preco * quantos;
		return total + total * 6 / 100;
	}
}
