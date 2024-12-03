package new_prova2;

import java.util.Scanner;

public class prova4 {

	private String parola1;
	
	public prova4() {
			
			prova5 chiavi = new prova5();
			
			System.out.println("\nInserisci parola da decifrare: \n");
			
			Scanner scanner = new Scanner(System.in);
				try {
				    parola1 = scanner.nextLine();
				     }
				     catch (Exception e) {}
			
			//System.out.print("Frase da decifrare: " + parola1 + "\n");
			
			String parola2 = parola1.replace("101$£1'00", chiavi.getNumeroa());
			String parola3 = parola2.replace("!1010%ì//", chiavi.getNumerob());
			String parola4 = parola3.replace("!1.10%ì//", chiavi.getNumeroc());
			String parola5 = parola4.replace("?ì^10110£", chiavi.getNumerod());
			String parola6 = parola5.replace("$$10010/£", chiavi.getNumeroe());
			String parola7 = parola6.replace("111$£1'11", chiavi.getNumerof());
			String parola8 = parola7.replace("!1110%ì'^", chiavi.getNumerog());
			String parola9 = parola8.replace("!101)%ì//", chiavi.getNumeroh());
			String parola10 = parola9.replace("?ì^1%112£", chiavi.getNumeroi());
			String parola11 = parola10.replace("$$1'010/£", chiavi.getNumerol());
			String parola12 = parola11.replace("101$£1'10", chiavi.getNumerom());
			String parola13 = parola12.replace("!1?10%/^ì", chiavi.getNumeron());
			String parola14= parola13.replace("!10)(%ì//", chiavi.getNumeroo());
			String parola15 = parola14.replace("?ì^1£111£", chiavi.getNumerop());
			String parola16 = parola15.replace("$$1011ì/£", chiavi.getNumeroq());
			String parola17 = parola16.replace("1/1$£1''/", chiavi.getNumeror());
			String parola18 = parola17.replace("!1^11/%^?", chiavi.getNumeros());
			String parola19 = parola18.replace("!1?$(%ì//", chiavi.getNumerot());
			String parola20 = parola19.replace("?ì^1111!£", chiavi.getNumerou());
			String parola21 = parola20.replace("$?1!01$/£", chiavi.getNumerov());
			String parola22 = parola21.replace("1ì1$£1'??", chiavi.getNumeroz());
			String parola23 = parola22.replace("!1!10%!?^", chiavi.getNumerox());
			String parola24 = parola23.replace("!1(1£%ì1/", chiavi.getNumeroy());
			String parola25 = parola24.replace("?ì^1!!11£", chiavi.getNumeroj());
			String parola26= parola25.replace("$11?010/£", chiavi.getNumerok());
			String parola27= parola26.replace("$ì10011/£", chiavi.getNumerow());
			String parola28= parola27.replace("^ì10101^$/", chiavi.getSpazio());
			
			System.out.print("\nFrase decodificata: " + parola28 + "\n");
			
			System.out.println("--Inserisci-- \n"
							 + "1 per codificare una frase o parola : \n"
							 + "2 per decodificare una frase o parola :  \n"
							 + "0 Per uscire : \n");
		
	}

}