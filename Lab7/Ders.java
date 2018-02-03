class Ders{
	private String dersKodu,dersIsmi;
	private int kredi;

	public Ders(){
		this.dersKodu = "";
		this.dersIsmi = "";
	}

	public Ders(String dersKodu, String dersIsmi, int kredi){
		this.dersKodu = dersKodu;
		this.dersIsmi = dersIsmi;
		this.kredi = kredi;
		System.out.println("Ders olusturuldu: " + dersKodu + " " + dersIsmi + " Kredisi: " + kredi);
	}

	public void setDersKodu(String dersKodu){
		this.dersKodu = dersKodu;
	}

	public String getDersKodu(){
		return dersKodu;
	}

	public void setDersIsmi(String dersIsmi){
		this.dersIsmi = dersIsmi;
	}

	public String getDersIsmi(){
		return dersIsmi;
	}

	public void setKredi(int kredi){
		this.kredi = kredi;
	}

	public int getKredi(){
		return kredi;
	}
}