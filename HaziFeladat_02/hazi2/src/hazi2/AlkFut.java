package hazi2;

import java.util.Scanner;

public class AlkFut {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kerem adja meg az alkalmazott nevet: ");
		String nev = scanner.nextLine();
		System.out.println("Kerem adja meg az alkalmazott fizeteset: ");
		int fizetes = scanner.nextInt();

		Alkalmazott alk = new Alkalmazott(nev, fizetes);

		System.out.println(alk.getAdatok());

		Alkalmazott alkFix = new Alkalmazott(nev);

		System.out.println(alkFix.getAdatok());
		scanner.close();

	}

}
