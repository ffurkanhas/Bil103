import java.util.*;

class Soru2{
	public static void main(String args[]){
		Scanner kyb = new Scanner(System.in);
		System.out.print("Bir sayi giriniz ([0,10] araliginda): ");
		int sayi = kyb.nextInt();
		if( sayi < 0 || sayi > 10 ){
			System.out.println("Yanlis sayi girildi.");
			System.exit(0);
		}
		int sonuc = ( (int) (Math.pow(sayi,2)) ) / 2 + (sayi * 5);
		if(sonuc < 20){
			System.out.println("Hi, your result is " + sonuc);
		}
		else if(sonuc >= 20 && sonuc < 40){
			System.out.println("Hallo, dein Ergebnis ist " + sonuc);
		}
		else if(sonuc >= 40 && sonuc < 60){
			System.out.println("Hola, tu resultado es " + sonuc);
		}
		else if(sonuc >= 60 && sonuc < 80){
			System.out.println("Bonjour, votre résultat est " + sonuc);
		}
		else if(sonuc > 80 ){
			System.out.println("Merhaba, sonucunuz " + sonuc);
		}
	
	}
}
