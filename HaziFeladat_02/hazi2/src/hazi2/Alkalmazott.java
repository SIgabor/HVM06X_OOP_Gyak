package hazi2;

public class Alkalmazott {
	private String nev;
	private int fizetes;
	
	
	public void fizetesNovel(int ertek) {
		this.fizetes += ertek;
	}
	
	public String getAdatok() {
		return "Nev: " + this.nev + " Fizetes: " +this.fizetes + " Ft";
	}
	
	public void setNev(String nev) {
		this.nev = nev;
	}
	public void setFizetes(int fizetes) {
		this.fizetes = fizetes;
	}
	public String getNev() {
		return this.nev;
	}
	public int getFizetes() {
		return this.fizetes;
	}

	public Alkalmazott(String nev, int fizetes) {
		this.nev = nev;
		this.fizetes = fizetes;
	}

	public Alkalmazott(String nev) {
		this.nev = nev;
		this.fizetes = 250000;
		
	}
	
	
	

}
