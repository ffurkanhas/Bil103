import java.util.Scanner;
class Soru1{
	public static void main(String args[]){
		Scanner kyb = new Scanner(System.in);
		System.out.println("Ilk cumleyi giriniz: ");
		String firstWord = kyb.nextLine();
		System.out.println("Ikinci cumleyi giriniz: ");
		String secondWord = kyb.nextLine();
		int count = 0;
		for(int i=0;i<=firstWord.length()-secondWord.length();i++){
			for(int j=0;j<secondWord.length();j++){
				if(firstWord.charAt(j+i) == secondWord.charAt(j))
					count++;
			}
		}
		System.out.println("Toplam MES: " + count);
	}
}
