package new_prova2;

import java.util.Scanner;

public class prova2 {

	private String parola1;
	
	public prova2() {
			
			prova3 chiavi = new prova3();
			
			System.out.println("\nInserisci parola da cifrare: \n");
			
			Scanner scanner = new Scanner(System.in);
				try {
				    parola1 = scanner.nextLine();
				     }
				     catch (Exception e) {}
			
			//System.out.print("Frase da codificare: " + parola1 + "\n");
			
			String parola2 = parola1.replace("a", chiavi.getNumeroa());
			String parola3 = parola2.replace("b", chiavi.getNumerob());
			String parola4 = parola3.replace("c", chiavi.getNumeroc());
			String parola5 = parola4.replace("d", chiavi.getNumerod());
			String parola6 = parola5.replace("e", chiavi.getNumeroe());
			String parola7 = parola6.replace("f", chiavi.getNumerof());
			String parola8 = parola7.replace("g", chiavi.getNumerog());
			String parola9 = parola8.replace("h", chiavi.getNumeroh());
			String parola10 = parola9.replace("i", chiavi.getNumeroi());
			String parola11 = parola10.replace("l", chiavi.getNumerol());
			String parola12 = parola11.replace("m", chiavi.getNumerom());
			String parola13 = parola12.replace("n", chiavi.getNumeron());
			String parola14 = parola13.replace("o", chiavi.getNumeroo());
			String parola15 = parola14.replace("p", chiavi.getNumerop());
			String parola16 = parola15.replace("q", chiavi.getNumeroq());
			String parola17 = parola16.replace("r", chiavi.getNumeror());
			String parola18 = parola17.replace("s", chiavi.getNumeros());
			String parola19 = parola18.replace("t", chiavi.getNumerot());
			String parola20 = parola19.replace("u", chiavi.getNumerou());
			String parola21 = parola20.replace("v", chiavi.getNumerov());
			String parola22 = parola21.replace("z", chiavi.getNumeroz());
			String parola23 = parola22.replace("x", chiavi.getNumerox());
			String parola24 = parola23.replace("y", chiavi.getNumeroy());
			String parola25 = parola24.replace("j", chiavi.getNumeroj());
			String parola26 = parola25.replace("k", chiavi.getNumerok());
			String parola27 = parola26.replace("w", chiavi.getNumerow());
			String parola28 = parola27.replace(" ", chiavi.getSpazio());
			
			System.out.print("\nFrase codificata: " + parola28 + "\n");
			
			System.out.println("--Inserisci-- \n"
							 + "1 per codificare una frase o parola : \n"
							 + "2 per decodificare una frase o parola :  \n"
							 + "0 Per uscire : \n");
		
	}

}