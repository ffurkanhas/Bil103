import java.util.Scanner;
class ZarDemo{
	public static void main(String args[]){
		Zar zar = new Zar();
		int count = 0,toplam = 0,secim,gelenSayi;
		int bir = 0,iki = 0,uc = 0,dort = 0,bes = 0,alti = 0;
		Scanner kyb = new Scanner(System.in);
		while(1==1){
			System.out.println("***Hosgeldiniz***");
			System.out.println("Islemi seciniz:\n1-Zar At\n2-Hileli Zar At\n" +
				"3-Su ana kadar atilan zarlarin ortalamasini goster\n4-Su ana kadar hangi deger kac kere atilmis goster\n5-Cikis");
			System.out.print("Seciminiz: ");
			secim = kyb.nextInt();
			if(secim == 5){
				System.out.println("Sonlandirildi...");
				System.exit(0);
			}
			else if(secim == 1){
				gelenSayi = zar.zarAt();
				System.out.println("Gelen sayi: " + gelenSayi) ;
				count++;
				toplam += gelenSayi;
				if(gelenSayi == 1)
					bir++;
				if(gelenSayi == 2)
					iki++;
				if(gelenSayi == 3)
					uc++;
				if(gelenSayi == 4)
					dort++;
				if(gelenSayi == 5)
					bes++;
				if(gelenSayi == 6)
					alti++;
			}
			else if(secim == 2){
				System.out.println("Tutulan sayiyi giriniz:");
				int tutulanSayi = kyb.nextInt();
				gelenSayi = zar.zarTut(tutulanSayi);
				System.out.println("Gelen sayi: " + gelenSayi) ;
				count++;
				toplam += gelenSayi;
				if(gelenSayi == 1)
					bir++;
				if(gelenSayi == 2)
					iki++;
				if(gelenSayi == 3)
					uc++;
				if(gelenSayi == 4)
					dort++;
				if(gelenSayi == 5)
					bes++;
				if(gelenSayi == 6)
					alti++;
			}
			else if(secim == 3){
				System.out.println("Su ana kadar atilan zarlarin ortalamasi: " + ((double)toplam/(double)count));
			}
			else if(secim == 4){
				System.out.print("1: ");
				for(int i=0;i<bir;i++)
					System.out.print("*");
				System.out.println();
				System.out.print("2: ");
				for(int i=0;i<iki;i++)
					System.out.print("*");
				System.out.println();
				System.out.print("3: ");
				for(int i=0;i<uc;i++)
					System.out.print("*");
				System.out.println();
				System.out.print("4: ");
				for(int i=0;i<dort;i++)
					System.out.print("*");
				System.out.println();
				System.out.print("5: ");
				for(int i=0;i<bes;i++)
					System.out.print("*");
				System.out.println();
				System.out.print("6: ");
				for(int i=0;i<alti;i++)
					System.out.print("*");
				System.out.println();
			}
		}
	}
}