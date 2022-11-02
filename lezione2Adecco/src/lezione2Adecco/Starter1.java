package lezione2Adecco;

public class Starter1 {

	public static void main(String[] args) {
	//String myName ; // null (non esiste ancora nulla)
	String name = "Barbara   ";
	String surname = "G";
	
	String myStringExample = "fgcrds341";
	// String è una variabile non primitiva alfanumerica
	
	System.out.println (name + " " + surname);
	
	//soggetto.nomeAzione
	//dot notation si utilizza x farmi dire il nr. dicaratteri di una stringa
	System.out.println(name.length());
	
	System.out.println(name.trim().length());
	//la funzione trim toglie i caratteri spazio alla lenght - solo se gli spazi sono dopo i caratteri 
	
	String myNameWithNoSpace = name.trim();
	
	// le posizioni partono da 0, le lunghezze iniziano quindi da -1 
	/*
	 * 0 1 2 3
	 * c i a o
	 */
	String myName = "Barbara";
	System.out.println(myName.charAt(0));
	System.out.print(myName.charAt(0) + myName.charAt(1) +myName.charAt(2));
	System.out.println(myName.charAt(0) + "" + myName.charAt(1) +myName.charAt(2));
	
	
	}

}
