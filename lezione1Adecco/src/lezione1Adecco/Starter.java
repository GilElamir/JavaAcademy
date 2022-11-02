package lezione1Adecco;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ciao a tutti JAVA");
		System.out.println("Welcome to JAVA course");
		System.out.println("Have a nice day");
		System.out.println("Buona giornata a tutti !");	
		System.out.println("Hello"+"to"+"everyone");
		//questo è un commento
		/*questo è un commento multilinea
		 * 
		 */
		int myVar;
		//TIPIZZATO: devo definire il tipo di variabile
		myVar = 10;
				
		System.out.println(myVar);
		
		//come si possono scrivere i numeri interi ?
		/* Rappresentare gli interi nei segg. modi:
		 * -127<byte <127 - short: fino a - int - long -... big decimal
		 */
		byte myVariable = 100; 
		long myVariab = 2121284567;
		System.out.println(myVariab);
		//come si rappresentano i numeri in virgola mobile ?
		/* 
		 * float: rappresentare un numero con la virgola
		 * double: rappresentare un numero con piu decimail di float  
		 */
		float restoMacchina = 0.10f;
		double myVariableInDouble = 99.99999999999;
		System.out.println(myVariableInDouble);		
		
		//tipo di dato : BOLEANO - BOOLEAN
		/* 
		 * boolean 
		 */
		boolean isRainingToday = true; //false
		boolean result = 10>2;
		System.out.println("il risultato vale" + result);
		
		/*
		 * char myVarChar = 'd' rappresenta UN SOLO carattere 
		 */
		
				
		
	}

}
