package lezione2Adecco;

import java.util.Scanner;

/*
 * Creare un programma che prenda  da tastiera 2 stringhe
 * il programma stampa a video la stringa maggiore
 * 
 * Se le 2 stringhe hanno la stessa dimensione
 * stampa la prima inserita
 */
public class Esercizio3 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.println("inserisci 2 stringhe");
		
		String word1;
		String word2;
		
		word1 = key.nextLine();
		word2 = key.nextLine();
		
		if (word1.length()>=word2.length()) {
			System.out.println(word1);
		}
		else {
			System.out.println(word1);
		}
	
		
		key.close();
		

	}

}
