import java.util.*;

class Soru4{
	public static void main(String args[]){
		Scanner kyb = new Scanner(System.in);
		System.out.print("Bir sayi giriniz ([0,10] araliginda): ");
		int sayi = kyb.nextInt();
		if( sayi < 0 || sayi > 10 ){
			System.out.println("Yanlis sayi girildi.");
			System.exit(0);
		}
		int sonuc = ( (int) (Math.pow(sayi,2)) ) / 2 + (sayi * 5);
		String word = (sonuc < 20 ) ? ("Hi, your result is " + sonuc) : ((sonuc >= 20 && sonuc < 40) ? ("Hallo, dein Ergebnis ist " + sonuc) : ((sonuc >= 40 && sonuc < 60) ? ("Hola, tu resultado es " + sonuc) : ((sonuc >= 60 && sonuc < 80) ? ("Bonjour, votre résultat est " + sonuc) : ((sonuc > 80 ) ? ("Merhaba, sonucunuz " + sonuc) : "")))) ;
		System.out.println(word);

	}
}
