import java.util.Scanner;
class Soru3{
	public static void main(String args[]){
		Scanner kyb = new Scanner(System.in);
		System.out.print("Bir cumle giriniz: ");
		String word = kyb.nextLine();
		System.out.print("Bir harf giriniz: ");
		String character = kyb.nextLine();
        int count = word.toLowerCase().length() - word.toLowerCase().replaceAll(character,"").length() ;
		System.out.println("Count: " + count);
	}
}
