import java.util.*;

class Soru3{
	public static void main(String args[]){
		Scanner kyb = new Scanner(System.in);
		System.out.print("Bir sayi giriniz ([0,10] araliginda): ");
		int sayi = kyb.nextInt();
		if( sayi < 0 || sayi > 10 ){
			System.out.println("Yanlis sayi girildi.");
			System.exit(0);
		}
		int sonuc = ( (int) (Math.pow(sayi,2)) ) / 2 + (sayi * 5);
		switch(sonuc/10){
		case 0: 
			System.out.println("Hi, your result is " + sonuc);
			break;
		case 1: 
			System.out.println("Hi, your result is " + sonuc);
			break;
		case 2:
			System.out.println("Hallo, dein Ergebnis ist " + sonuc);
			break;
		case 3:
			System.out.println("Hallo, dein Ergebnis ist " + sonuc);
			break;
		case 4:
			System.out.println("Hola, tu resultado es " + sonuc);
			break;
		case 5:
			System.out.println("Hola, tu resultado es " + sonuc);
			break;
		case 6:
			System.out.println("Bonjour, votre résultat est " + sonuc);
			break;
		case 7:
			System.out.println("Bonjour, votre résultat est " + sonuc);
			break;
		case 8:
			System.out.println("Merhaba, sonucunuz " + sonuc);
			break;
		case 9:
			System.out.println("Merhaba, sonucunuz " + sonuc);
			break;
		case 10:
			System.out.println("Merhaba, sonucunuz " + sonuc);
			break;
		}
	
	}
}
