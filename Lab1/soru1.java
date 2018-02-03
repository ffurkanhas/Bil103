import java.util.Scanner;

class soru1{
	public static void main(String args[]){
		Scanner kyb = new Scanner(System.in);
		System.out.println("Bir sayi giriniz: ");
		double kilometer = kyb.nextDouble();
		System.out.println("km to mile: " + kilometer*0.621371192);
	}
}
