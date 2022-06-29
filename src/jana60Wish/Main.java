package jana60Wish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String conferma;
		boolean continuo = false;

		// Creazione lista vuota di stringhe
		ArrayList<String> listaDiDesideri = new ArrayList<String>(5);

		do {
			System.out.println("Aggiungi un desiderio");
			listaDiDesideri.add(scan.nextLine());
			System.out.println("La tua lista dei desideri è  : " + listaDiDesideri);
			if (listaDiDesideri.size() == 3)
				continuo = false;
			else {
				do {
					System.out.println("Vuoi continuare? ");
					conferma = scan.nextLine();
					if (!conferma.equalsIgnoreCase("si") && !conferma.equalsIgnoreCase("no"))

						System.out.println("Inserisci si o no ");
				} while (!conferma.equalsIgnoreCase("si") && !conferma.equalsIgnoreCase("no"));
				if (conferma.equalsIgnoreCase("no"))
					continuo = true;
			}
		} while (!continuo);

		Collections.sort(listaDiDesideri);
		System.out.println("La tua lista ordinata  è : " + listaDiDesideri);

	}
}
