class OyunDemo{
	public static int tahtaBoyut = 5;
	public static char oyuncu1Karakter = 'X';
	public static char oyuncu2Karakter = 'O';
	
	public static void main(String args[]){
		
		Oyun game = new Oyun();
		game.satir = tahtaBoyut;
		game.sutun = tahtaBoyut;

		game.kullanici1 = oyuncu1Karakter;
		game.kullanici2 = oyuncu2Karakter;

		game.tahtaOlustur();
		while(!game.dolduMu()){
			game.tahtaGoster();
			System.out.println("--------");
			while(!game.oynat(game.kullanici1)){

			}
			game.tahtaGoster();
			while(!game.dolduMu() && !game.oynat(game.kullanici2)){

			}
			System.out.println("--------");	
		}
		game.kazananKim();
		System.out.println("Kazanan oyuncu: " + ((game.oyuncu1Count > game.oyuncu2Count) ? "1":"2"));
	}

}