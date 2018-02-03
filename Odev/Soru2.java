import java.util.Scanner;
class Soru2{
	public static void main(String args[]){
		Scanner kyb = new Scanner(System.in);
		System.out.println("Ilk cumleyi giriniz: ");
		String firstWord = kyb.nextLine();
		System.out.println("Ikinci cumleyi giriniz: ");
		String secondWord = kyb.nextLine();
		int count = 0;
		int max = 0;
		for(int i=0;i<=firstWord.length()-secondWord.length();i++){
			for(int j=0;j<secondWord.length();j++){
				if(firstWord.charAt(j+i) == secondWord.charAt(j))
					count++;
				else if(firstWord.charAt(j+i) != secondWord.charAt(j))
					count = 0;
				if(count > max)
					max = count;
			}
			System.out.println(i + " " + max);
			count = 0;
		}
		System.out.println(max);
	}
}
