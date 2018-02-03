class Zar{
	private int deger;

	public void zarAt(){
		deger = (int) (Math.random() * 6) + 1;
	}

	public void zarTut(int tutulanDeger){
		int gelenSayi = (int) (Math.random() * 11) + 1;
		if(gelenSayi == 7 ||gelenSayi == 8 || gelenSayi == 9 || gelenSayi == 10 || gelenSayi == 11)
			gelenSayi = tutulanDeger;
		else{
			while(gelenSayi == tutulanDeger){
				gelenSayi = (int) (Math.random() * 6) + 1;
			}
		}
		deger = gelenSayi;
	}

	public int getDeger(){
		return deger;
	}
}