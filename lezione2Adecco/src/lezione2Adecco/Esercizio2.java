package lezione2Adecco;

import java.util.Scanner;

/*
 * craere un programma che prenda a tastiera ("inserisci") una stringa 
 * stampa a video la stringa ed il range di valori compresi nella stringa ( gli index possibili)
 * poi prende (inserisci)un nr. int  
 * stampa a video il carattere alla posizione di quel numero
 * 
 *  Es "ciao"
 *    
 *     
 */
public class Esercizio2 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String word;
		int userNumber;

		
		System.out.println("Inserisci una parola ");
		word = keyboard.nextLine();

		System.out.println(word.length() - 1);

		System.out.println("Inserisci un numero intero");
		userNumber = keyboard.nextInt();

		
		System.out.println(word.charAt(userNumber));

		keyboard.close();

	}

}
