import java.util.*;

class AdamAsmaca{
	private String[] kelimeler;

	public AdamAsmaca(){
		kelimeler = new String[]{"bilgi","abrakadabra","acemi","duygu","kesin","slogan","java","ders","simge","vize","final","okul","hayat","zorluk","zengin","fakir","yelpaze","bere","klavye","fare"};
	}

	public String getKelime(){
		int randomIndex = (int) (Math.random() * 10) + 0;
		return kelimeler[randomIndex];
	}

	private static String kelime;
	
	public static void main(String args[]){
		Character[] pattern;
		ArrayList<Character> olmayanlar = new ArrayList<Character>();
		Scanner kyb = new Scanner(System.in);
		AdamAsmaca oyun = new AdamAsmaca();
		kelime = oyun.getKelime();
		pattern = new Character[kelime.length()];
		for(int i=0;i<pattern.length;i++)
			pattern[i] = '_';
		int tahminHakki = 0;
		boolean bittiMi = false;
		while(tahminHakki < 7 && !bittiMi){
			bittiMi = true;
			System.out.print("Kelime:     ");
			for(int i=0;i<pattern.length;i++)
				System.out.print(pattern[i] + " ");
			System.out.print("\nOlmayanlar: ");
			for(int i=0;i<olmayanlar.size();i++)
				System.out.print(olmayanlar.get(i) + " ");
			System.out.print("\nTahmin:");
			char tahmin = kyb.nextLine().charAt(0);
			if( kelime.indexOf(tahmin) < 0)
					olmayanlar.add(tahmin);
			else{
				for(int i=0;i<kelime.length();i++){
					if(kelime.charAt(i) == tahmin){
						pattern[i] = tahmin;
					}
				}
			}
			for(int i=0;i<pattern.length;i++){
				if(pattern[i] == '_')
					bittiMi = false;
			}
			System.out.println("------------------------------");
			tahminHakki++;
			if(bittiMi){
				System.out.print("Kelime:     ");
				for(int i=0;i<pattern.length;i++)
					System.out.print(pattern[i] + " ");
				System.out.print("\nOlmayanlar: ");
				for(int i=0;i<olmayanlar.size();i++)
					System.out.print(olmayanlar.get(i) + " ");
				System.out.println("\nKAZANDIN!");
				System.out.println("tekrar veya son?");
				String islem = kyb.nextLine();
				if(islem.equals("tekrar")){
					kelime = oyun.getKelime();
					pattern = new Character[kelime.length()];
					for(int i=0;i<pattern.length;i++)
						pattern[i] = '_';
					tahminHakki = 0;
					olmayanlar = new ArrayList<Character>();
					bittiMi = false;
				}
				else if(islem.equals("son")){
					System.out.println("Sonlandirildi...");
					System.exit(0);
				}
			}
		}
	}
}