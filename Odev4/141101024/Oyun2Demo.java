import java.util.Scanner;

class Oyun2Demo{
	public static int tahtaBoyut = 5;
	public static char oyuncu1Karakter = 'X';
	public static char oyuncu2Karakter = 'O';

	public static void main(String args[]){
		Scanner kyb = new Scanner(System.in);
		Oyun2 game = new Oyun2();
		game.satir = tahtaBoyut;
		game.sutun = tahtaBoyut;

		game.kullanici1 = oyuncu1Karakter;
		game.kullanici2 = oyuncu2Karakter;

		game.tahtaOlustur();
		String hamle;
		String[] temp;
		int x,y;
		System.out.println("Oyun basladi tahtanin su anki durumu:");
		while(!game.dolduMu()){
			x = 0; y=0;
			game.tahtaGoster();
			System.out.println("--------");
			while(!game.oynat(x,y,game.kullanici1)){
				System.out.print("A'nin hamlesi: ");
				hamle = kyb.nextLine();
				temp = game.girdiAyir(hamle);
				x = game.ConvertStringToInt(temp[0]);
				y = game.ConvertStringToInt(temp[1]);
			}
			game.tahtaGoster();
			while(!game.dolduMu() && !game.oynat(x,y,game.kullanici2)){
				System.out.print("B'nin hamlesi: ");
				hamle = kyb.nextLine();
				temp = game.girdiAyir(hamle);
				x = game.ConvertStringToInt(temp[0]);
				y = game.ConvertStringToInt(temp[1]);
			}
			System.out.println("--------");	
		}
		game.kazananKim();
		System.out.println("Kazanan oyuncu: " + ((game.oyuncu1Count > game.oyuncu2Count) ? "1":"2"));
	}

}