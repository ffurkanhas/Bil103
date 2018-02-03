import java.util.Scanner;
class Soru2{
	public static void main(String args[]){
		Scanner kyb = new Scanner(System.in);
		System.out.println("K sayisini giriniz:");
		int kSayisi = kyb.nextInt();
		System.out.println("L sayisini giriniz:");
		int lSayisi = kyb.nextInt();
		int ikiKati = 0;
		int ucKati = 0;
		int dortKati = 0;
		int besKati = 0;
		int altiKati = 0;
		for(int i=kSayisi;i<=lSayisi;i++){
			ikiKati = i * 2;
			ucKati = i * 3;
			dortKati = i * 4;
			besKati = i * 5;
			altiKati = i * 6;
			if(kontrol(i,ikiKati) && kontrol(i,ucKati) && kontrol(i,dortKati) && kontrol(i,besKati) && kontrol(i,altiKati))
				System.out.println(i);
		}
	}

	public static int basamakSayisi(int sayi){
		int basamakSayisi = 0;
		while(sayi>0){
			basamakSayisi++;
			sayi = sayi / 10;
		}
		return basamakSayisi;
	}

	public static char intToChar(int sayi,int basamakNumarasi){
		int basamak = 0;
		int sayi2 = sayi;
		for(int i=0;i<=basamakSayisi(sayi) - basamakNumarasi;i++){
			basamak = sayi2 % 10;
			sayi2 = sayi2 / 10;
		}
		if(basamak == 0)
			return '0';
		else if(basamak == 1)
			return '1';
		else if(basamak == 2)
			return '2';
		else if(basamak == 3)
			return '3';
		else if(basamak == 4)
			return '4';
		else if(basamak == 5)
			return '5';
		else if(basamak == 6)
			return '6';
		else if(basamak == 7)
			return '7';
		else if(basamak == 8)
			return '8';
		else if(basamak == 9)
			return '9';
		else
			return '0';
	}

	public static boolean kontrol(int sayi1,int sayi2){
		String birinciSayi = "";
		String ikinciSayi = "";
		for(int i=1;i<=basamakSayisi(sayi1);i++){
			birinciSayi += intToChar(sayi1,i);
		}
		for(int i=1;i<=basamakSayisi(sayi2);i++){
			ikinciSayi += intToChar(sayi2,i);
		}
		String char2 = "";
		for(int i=0;i<ikinciSayi.length();i++){
			char2 += ikinciSayi.charAt(i);
			if(!birinciSayi.contains(char2))
				return false;
			char2 = "";
		}
		return true;
	}
}