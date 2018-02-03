import java.util.Scanner;

class Oyun{

	public static int satir, sutun;
	public static char[][] tahta;
	public static char kullanici1, kullanici2;
	public static boolean dolduMu = true;

	public static void main(String args[]){
		
		Scanner kyb = new Scanner(System.in);
		System.out.println("Tahta boyutunu giriniz: ");
		satir = kyb.nextInt();
		sutun = kyb.nextInt();

		System.out.println("1. oyuncu karakterini belirleyiniz: ");
		kullanici1 = kyb.next().charAt(0);
		System.out.println("2. oyuncu karakterini belirleyiniz: ");
		kullanici2 = kyb.next().charAt(0);

		tahtaOlustur();
		int secimSatir, secimSutun;
		while(kazananKim() == -1 && !dolduMu){
			tahtaGoster();

			System.out.println("1. oyuncu hamlesi:");
			secimSatir = kyb.nextInt();
			secimSutun = kyb.nextInt();
			while(!oynat(secimSatir,secimSutun,kullanici1)){
				System.out.println("1. oyuncu hamlesi:");
				secimSatir = kyb.nextInt();
				secimSutun = kyb.nextInt();
			}
			tahtaGoster();
			if(kazananKim() == -1){
				System.out.println("2. oyuncu hamlesi:");
				secimSatir = kyb.nextInt();
				secimSutun = kyb.nextInt();
				while(!oynat(secimSatir,secimSutun,kullanici2)){
					System.out.println("2. oyuncu hamlesi:");
					secimSatir = kyb.nextInt();
					secimSutun = kyb.nextInt();
				}
			}
				
		}
		System.out.println("Kazanan oyuncu: " + kazananKim());
	}

	public static void tahtaOlustur(){

		tahta = new char[satir][sutun];

		for(int i=0;i<satir;i++){
			for(int j=0;j<sutun;j++){
				tahta[i][j] = '-';
			}
		}
	}

	public static void tahtaGoster(){

		for(int i=0;i<satir;i++){
			for(int j=0;j<sutun;j++){
				System.out.print(tahta[i][j]);
			}
			System.out.println();
		}

	}

	public static int kazananKim(){

		for(int i=0;i<satir;i++){
			for(int j=0;j<sutun;j++){
				if(tahta[i][j] == kullanici1 && tahta[i][j+1] == kullanici1 && tahta[i][j+2] == kullanici1)
					return 1;
				if(tahta[i][j] == kullanici2 && tahta[i][j+1] == kullanici2 && tahta[i][j+2] == kullanici2)
					return 2;
				if(tahta[i][j] == '-')
					dolduMu = false;
			}	
		}

		return -1;

	}

	public static boolean oynat(int satir,int sutun,char sembol){

		if(tahta[satir-1][sutun-1] == '-'){
			tahta[satir-1][sutun-1] = sembol;
			return true;
		}
		else
			return false;

	}

}