package moduleZodiac;

import java.util.Scanner;

public class Deviner {

	public static void main(String[] args) {

		System.out.println(" Donnez mois l'année ");
		Scanner input = new Scanner(System.in);
		
		int annee = input.nextInt();

		int x = annee%12;
		//System.out.println(x);

		switch (x) {
			case 0:
				System.out.println("monkey");
				break;
			case 1:
				System.out.println("Dog");
				break;
			case 2:
				System.out.println("cat");
				break;
			case 3:
				System.out.println("bird");
				break;
			case 4:
				System.out.println("rabit");
				break;
			
			default:
				System.out.println(" l'année est introuvable ");

		}

	}

}
