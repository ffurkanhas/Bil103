class Saat{

	private int saniye,dakika,saat;

	public Saat(int saniye,int dakika,int saat){
		this.saniye = saniye;
		this.dakika = dakika;
		this.saat = saat;
	}

	public Saat(Saat saat){
		this.saniye = saat.getSaniye();
		this.dakika = saat.getDakika();
		this.saat = saat.getSaat();
	}

	public void setSaat(int saniye,int dakika,int saat){
		this.saniye = saniye;
		this.dakika = dakika;
		this.saat = saat;
	}

	public void saatArttir(int k){
		if (saat + k < 24)
			saat += k;
		else{
			saat = 0;
		}
	}

	public void dakikaArttir(int k){
		if(dakika + k < 60)
			dakika += k;
		else{
			saatArttir(1);
			dakika = 0;
		}
	}

	public void dakikaArttir(){
		dakikaArttir(1);
	}

	public void saatArttir(){
		saatArttir(1);
	}

	public void arttir(int k){
		if(saniye + k < 60)
			saniye += k;
		else{
			dakikaArttir(1);
			saniye = 0;
		}
		
	}

	public void arttir(){
		arttir(1);
	}

	public int getSaniye(){
		return saniye;
	}

	public void setSaniye(int saniye){
		this.saniye = saniye;
	}

	public int getSaat(){
		return saat;
	}

	public void setSaat(int saat){
		this.saat = saat;
	}

	public int getDakika(){
		return dakika;
	}

	public void setDakika(int dakika){
		this.dakika = dakika;
	}

	public String toString(){
		return "saat = " + saat + " dakika = " + dakika + " saniye = " + saniye;
	}
}