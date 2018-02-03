class Zar{
	private int deger;
	public static int yuz;

	public int getDeger(){
		return deger;
	}

	public void zarAt(){
		deger = (int) (Math.random() * yuz) + 1;
	}

	public void zarTut(int tutulanDeger){
		deger = (int) (Math.random() * yuz) + 1;
		
	}
}