package lezione1Adecco;

import java.util.Scanner;

//creare un applicativo che prenda tre valori double  e li moltiplichi 

public class Esercizio3 {

	public static void main(String[] args) {
		
	Scanner keyboard = new Scanner(System.in);
	System.out.println("inserisci 3 numeri");
	
	double numero1 = keyboard.nextDouble();
	double numero2 = keyboard.nextDouble();
	double numero3 = keyboard.nextDouble();
	
	double ris = numero1*numero2+numero3;
	
	keyboard.close();
	
	System.out.println(("Prodotto " + ris));
	
			
	
	
	}

}
