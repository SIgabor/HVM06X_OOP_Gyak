package hazi;

import java.util.Scanner;

public class Fut {

	public static void main(String[] args) {
		Szemely szemely = new Szemely();

		Scanner input = new Scanner(System.in);

		System.out.print("Adja meg a nev�t: ");
		szemely.setNev(input.nextLine());
		System.out.print("Adja meg a testt�meg�t(kg): ");
		szemely.setSuly(input.nextInt());
		System.out.print("Adja meg a magass�g�t(m): ");
		szemely.setMagassag(input.nextDouble());

		input.close();

		System.out.println(szemely.osszefuzve());

	}

}
