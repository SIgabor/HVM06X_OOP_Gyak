package hazi2_2;

public class Konyv {
	private String cim;
	private String szerzo;
	private double ar;
	private int ev;
	java.time.LocalDate currentDate = java.time.LocalDate.now(); // mai dátum
	int year = currentDate.getYear(); // mai dátumból az év

	public Konyv(String cim, String szerzo, double ar, int ev) {
		this.cim = cim;
		this.szerzo = szerzo;
		this.ar = ar;
		this.ev = ev;
	}

	public Konyv(String cim, String szerzo) {
		this.cim = cim;
		this.szerzo = szerzo;
		this.ar = 2500;
		this.ev = year;
	}

	public void setArNovel(int szazalek) {
		this.ar = this.ar + (ar * (szazalek / 100));
	}

	public String toString() {
		return "Konyv [cim=" + cim + ", szerzo=" + szerzo + ", ar=" + ar + "Ft , ev=" + ev + "]";
	}

	public String getCim() {
		return cim;
	}

	public void setCim(String cim) {
		this.cim = cim;
	}

	public String getSzerzo() {
		return szerzo;
	}

	public void setSzerzo(String szerzo) {
		this.szerzo = szerzo;
	}

	public double getAr() {
		return ar;
	}

	public void setAr(double ar) {
		this.ar = ar;
	}

	public int getEv() {
		return ev;
	}

	public void setEv(int ev) {
		this.ev = ev;
	}

}
