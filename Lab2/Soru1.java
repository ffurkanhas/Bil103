import java.util.Scanner;
class Soru1{
	public static void main(String args[]){
		Scanner kyb = new Scanner(System.in);
		System.out.print("Bir cumle giriniz: ");
		String word = kyb.nextLine();
		int wordLenght = word.length();
		System.out.println("Girilen cumlenin uzunlugu: " + wordLenght );
		System.out.println("Girilen cumlede \"Ankara\" kelimesinin konumu: " + word.indexOf("Ankara") );
		System.out.println("Girilen cumlenin son 3 harfi: " + word.substring(wordLenght-3) );
		String firstWord = word.substring(0,word.indexOf(" "));
		String wordReplaceFirst = word.substring(word.indexOf(" ")+1);
		System.out.println("Girilen cumlede ilk kelime sona konuldu: " + wordReplaceFirst + " " + firstWord);
		String lastWord = word.substring(word.lastIndexOf(" ")+1,word.length() );
		lastWord = lastWord.substring(0,1).toUpperCase() + lastWord.substring(1);
		String wordUpperCase = word.substring(0,1).toUpperCase() + word.substring(1,word.lastIndexOf(" ")) + " " + lastWord;
		System.out.println("Girilen cumlede ilk ve son harf buyuk yapildi: " + wordUpperCase);
		System.out.println("Girilen cumlede bosluklar kaldirildi: " + word.replaceAll(" ",""));
	}
}
