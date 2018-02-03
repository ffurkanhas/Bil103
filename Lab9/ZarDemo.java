import java.util.Scanner;
class ZarDemo{
	public static Zar[] zarListesi;
	public static int hileliZarSayisi, tutulanSayi, ortalama;
	public static Scanner kyb;

	public static void main(String args[]){
		
		kyb = new Scanner(System.in);
		
		int islem;
		showStart();
		while(1==1){
			zarlariAt(tutulanSayi);
			System.out.println("Isleminizi seciniz:");
			System.out.println("1-Yeniden Basla");
			System.out.println("2-Atilan zarlarin ortalamasini goster");
			System.out.println("3-Hangi deger kac defa atilmis goster");
			System.out.println("4-Cikis");
			islem = kyb.nextInt();
			if( islem == 4){
				System.out.println("Sonlandirildi...");
				System.exit(0);
			}
			else if( islem == 1 ){
				showStart();
			}
			else if( islem == 2 ){
				zarOrtalamalari();
			}
			else if( islem == 3 ){
				degerGoster();
			}
		}
	}

	public static void showStart(){
		System.out.println("***Hosgeldiniz***");
		System.out.print("Kac tane zar atmak istersiniz: ");
		zarListesi = new Zar[kyb.nextInt()];
		System.out.print(zarListesi.length + " zarin kac tanesi hileli olsun istersiniz: ");
		hileliZarSayisi = kyb.nextInt();
		System.out.print("Hileli zarlarda hangi rakami tutmak istersiniz: ");
		tutulanSayi = kyb.nextInt();
	}

	public static void zarlariAt(int tutulanDeger){
		for(int i=0;i<zarListesi.length;i++){
			zarListesi[i] = new Zar();
		}

		for(int i=0;i<zarListesi.length-hileliZarSayisi;i++){
			zarListesi[i].zarAt();
		}
		for(int i=zarListesi.length-hileliZarSayisi;i<zarListesi.length;i++){
			zarListesi[i].zarTut(tutulanDeger);
		}

	}

	public static void zarOrtalamalari(){
		ortalama = 0;
		for(int i=0;i<zarListesi.length;i++){
			ortalama += zarListesi[i].getDeger();
		}
		System.out.println("Zarlarin ortalamasi: " + (double)ortalama / zarListesi.length);
	}

	public static void degerGoster(){
		int[] degerler = new int[7];
		for(int i=0;i<zarListesi.length;i++){
			degerler[zarListesi[i].getDeger()]++;
		}
		for(int i=1;i<degerler.length;i++){
			System.out.print(i + ": ");
			for(int j=0;j<degerler[i];j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}