package lezione2Adecco;
/*
 * /*
	 * creare un programma che prenda in input 2 stringhe utilizzando la tastiera 
	 * nota : esiste un metodo che si chiama nextline()/classe Scanner
	 * stampare a video la lungh delle 2 stringhe 
	 * stampare a video il primo carattere delle 2 str
	 * stampare a video  tutte le stringhe in MAIUSCOLO 
	 */

import java.util.Scanner;

public class Esercizio1 {

	public static void main(String[] args) {
	
		
	String first ; 
	String second ;
	
	Scanner keyboard = new Scanner(System.in); 
	
	
	System.out.println("Inserisci 2 parole");
	first = keyboard.nextLine();
	second = keyboard.nextLine();
	keyboard.close();
				
	System.out.println("CARATTERI: " + first + " sono " + first.length());
	System.out.println("CARATTERI: " + second + " sono " + second.length());
	
	System.out.println(first .charAt(0));
	System.out.println(second .charAt(0));
	
	System.out.println(first.toUpperCase());
	System.out.println(second.toUpperCase());
	
	
	
	
	}

}
