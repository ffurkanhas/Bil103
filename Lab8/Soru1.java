import java.util.Scanner;
import java.util.Random;

class Soru1{
	public static int[] dizi;
	public static int size;
	public static Random rnd = new Random();
	public static void main(String args[]){
		Scanner kyb = new Scanner(System.in);
		System.out.println("Dizi boyutunu giriniz");
		size = kyb.nextInt();
		dizi = new int[size];
		int secim;
		while(1==1){
			System.out.println("1-Diziyi rastgele doldur");
			System.out.println("2-Diziyi ekrana yazdir");
			System.out.println("3-Diziyi tersten ekrana yazdir");
			System.out.println("4-Dizinin bir kismini ekrana yazdir");
			System.out.println("5-Dizinin bir elamaninin yerini degistir");
			System.out.println("6-Dizinin iki elemaninin yerini degistir");
			System.out.println("7-Cikis");
			System.out.println("Bir islem seciniz");
			secim = kyb.nextInt();
			if(secim == 7){
				System.out.println("Sonlandirildi");
				System.exit(0);
			}
			else if(secim == 1){
				int altSinir, ustSinir;
				System.out.println("Alt sinir giriniz");
				altSinir = kyb.nextInt();
				System.out.println("Ust sinir giriniz");
				ustSinir = kyb.nextInt();
				diziDoldur(altSinir, ustSinir);
			}
			else if(secim == 2){
				diziYazdir();
			}
			else if(secim == 3){
				diziTerstenYazdir();
			}
			else if(secim == 4){
				int altSinir, ustSinir;
				System.out.println("Alt sinir giriniz");
				altSinir = kyb.nextInt();
				System.out.println("Ust sinir giriniz");
				ustSinir = kyb.nextInt();
				dizininBirKismi(altSinir, ustSinir);
			}
			else if(secim == 5){
				int hangiEleman, yeniDeger;
				System.out.println("Degistirilecek elemanin indexini giriniz");
				hangiEleman = kyb.nextInt();
				System.out.println("Yeni degeri giriniz");
				yeniDeger = kyb.nextInt();
				elemanDegistir(hangiEleman, yeniDeger);
			}
			else if(secim == 6){
				int birinciEleman, ikinciEleman;
				System.out.println("Degistirilecek ilk elemanin indexini giriniz");
				birinciEleman = kyb.nextInt();
				System.out.println("Degistirilecek ikinci elemanin indexini giriniz");
				ikinciEleman = kyb.nextInt();
				elemanlariDegistir(birinciEleman, ikinciEleman);
			}
			else{
				System.out.println("Yanlis islem secildi...");
			}
		}
	}

	public static void diziDoldur(int altSinir, int ustSinir){
		for(int i=0;i<size;i++){
			dizi[i] = rnd.nextInt(ustSinir - altSinir) + altSinir;
		}
	}

	public static void diziYazdir(){
		for(int i=0;i<size;i++){
			System.out.println(dizi[i]);
		}
	}

	public static void diziTerstenYazdir(){
		for(int i=size-1;i>=0;i--){
			System.out.println(dizi[i]);
		}
	}

	public static void dizininBirKismi(int altSinir, int ustSinir){
		for(int i=altSinir-1;i<ustSinir;i++){
			System.out.println(dizi[i]);
		}
	}

	public static void elemanDegistir(int index, int yeniDeger){
		dizi[index] = yeniDeger;
	}

	public static void elemanlariDegistir(int birinciEleman, int ikinciEleman){
		int temp = dizi[birinciEleman];
		dizi[birinciEleman] = dizi[ikinciEleman];
		dizi[ikinciEleman] = temp;
	}

}