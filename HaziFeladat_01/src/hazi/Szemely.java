package hazi;

public class Szemely {
	private String nev;
	private int suly;
	private double magassag;

	public void setNev(String nev) {
		this.nev = nev;
	}

	public void setSuly(int suly) {
		this.suly = suly;
	}

	public void setMagassag(double magassag) {
		this.magassag = magassag;
	}

	public double testtomegindex(int suly, double magassag) {
		return suly / (magassag * magassag);
	}

	public String ttiSzoveges() {
		double tti = testtomegindex(suly, magassag);
		if (tti < 18.5) {
			return "sov�ny";

		} else if (tti > 25) {
			return "k�v�r";

		} else {
			return "norm�lis";

		}
	}

	public String osszefuzve() {
		double tti = testtomegindex(suly, magassag);
		return nev + ", " + suly + " kg, " + magassag + " m, " + tti + ":" + ttiSzoveges();
	}

}
