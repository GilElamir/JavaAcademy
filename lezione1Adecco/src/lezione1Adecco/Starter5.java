package lezione1Adecco;
/*
 * creare una variabile in grado di rappresentare la temp. in gradi °C 
 * 
 * 19 gradi °C
 * tot. gradi kelvin (19+273,15)
 * tot. gradi Far  (19 °C × 9/5) + 32
 */
public class Starter5 {

	public static void main(String[] args) {
	
    double tempCelsius = 19; 
    double tempFar = (tempCelsius* 9/5) +32;
    System.out.println("FAR-->" + tempFar);
    
    System.out.println("KEL -->" + (tempCelsius+273.15));
    
	}

}
