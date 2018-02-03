import java.util.Scanner;

class soru2{
	public static void main(String args[]){
		Scanner kyb = new Scanner(System.in);
		System.out.print("Birinci sayiyi giriniz: ");
		int sayi1 = kyb.nextInt();
		System.out.print("Ikinci sayiyi giriniz: ");
		int sayi2 = kyb.nextInt();
		System.out.println("Toplama: " + (sayi1+sayi2) + "\n" +
				   "Cikarma: " + (sayi1-sayi2) + "\n" +
				   "Carpma : " + (sayi1*sayi2) + "\n" +
				   "Bolme  : " + ((double) sayi1 / (double) sayi2) + "\n" +
				   "Mod    : " + (sayi1%sayi2) + "\n" );
	}
}
