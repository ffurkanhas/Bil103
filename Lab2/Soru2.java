import java.util.Scanner;
class Soru2{
	public static void main(String args[]){
		Scanner kyb = new Scanner(System.in);
		System.out.print("Dogum tarihinizi giriniz: ");
		String birthDate = kyb.nextLine();
		String birthYear = birthDate.substring(birthDate.lastIndexOf("/")+1);
		int birlerBasamagi = (int) birthYear.charAt(3) - 48;
		int onlarBasamagi = (int) birthYear.charAt(2) - 48;
		int yuzlerBasamagi = (int) birthYear.charAt(1) - 48;
		int binlerBasamagi = (int) birthYear.charAt(0) - 48;
		System.out.println("Yasiniz: " + ( 2017 - ( (1000*binlerBasamagi) + (100*yuzlerBasamagi) + (10*onlarBasamagi) + birlerBasamagi ) ) );
	}
}
