package lezione2Adecco;

import java.util.Scanner;

/* crea una funzione che prende in carico un numero
 * se il numero <0 stampare errore
 * se num > convertilo da minuti in secondi
 */
public class Esercizio4 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.println("inserisci un numero");
		
		int myNum;
		
		myNum = key.nextInt();
		
		if (myNum > 0) {
			System.out.println(myNum*60);
		} 
		else {
			System.out.println("ERROR");
		}
		
		key.close();
		

	}

}
