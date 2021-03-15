package hazi2_2;

import java.util.Scanner;

public class KonyvProba {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Kerem adja meg a konyv cimet: ");
		String cim = sc.nextLine();
		System.out.println("Kerem adja meg a konyv szerzojet: ");
		String szerzo = sc.nextLine();
		System.out.println("Kerem adj meg akonyv arat: ");
		double ar = sc.nextDouble();
		System.out.println("Kerem adja meg a konyv megjelenesenek evet: ");
		int ev = sc.nextInt();

		Konyv k1 = new Konyv(cim, szerzo, ar, ev);
		Konyv k2 = new Konyv(cim, szerzo);

		System.out.println(k1.toString());
		System.out.println(k2.toString());
		sc.close();

	}

}
