import java.util.Scanner;
class Soru1{
	public static void main(String args[]){
		Scanner kyb = new Scanner(System.in);
		while(1==1){
			System.out.println("Bir cumle giriniz: ");
			String cumle = kyb.nextLine();
			if(cumle.equals("son"))
				System.exit(0);
			System.out.println("Bir harf giriniz: ");
			String harf = kyb.nextLine();
			int count = 0;
			for(int i=0;i<cumle.length();i++){
				if(cumle.charAt(i) == harf.charAt(0))
					count++;
			}
			System.out.println("Toplam " + count + " tane " + harf.charAt(0) + " harfi bulunmaktadir");
		}
	}
}
