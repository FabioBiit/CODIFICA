package new_prova2;

import java.util.Scanner;

public class prova1 {

	public static void main(String[] arg) throws InterruptedException {			
		
		int valore1 = 0;
		
		System.out.println("--Inserisci-- \n"
						 + "1 per codificare una frase o parola : \n"
						 + "2 per decodificare una frase o parola :  \n"
						 + "0 Per uscire : \n");
		
		try (Scanner scanner1 = new Scanner(System.in)) {
			try {
			    valore1 = scanner1.nextInt();
			     }
			     catch (Exception e) {
			    	 System.out.print("Inserisci solo i valori sopra riportati per iniziare, riprova! \nExit..");
			     	}
		
			while(valore1 != 0) {
				
				switch(valore1) {
				
				case 1:	
				prova2 p1 = new prova2();	
				break;
				
				case 2:
				prova4 p2 = new prova4();	
				break;
				
				case 0:
				//prova6 p3 = new prova6();
				break;

				}
	
				try {
				    valore1 = scanner1.nextInt();
				     }
				     catch (Exception e) {
				    	 System.out.print("Inserisci solo i valori sopra riportati per iniziare! \nExit..");
				    	 break;
				     	}
			
			}
		}	
	}	
}