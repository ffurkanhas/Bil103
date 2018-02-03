import java.util.*;
class ZarDemo{
	public static void main(String args[]){
		Zar zar = new Zar();
		int toplam = 0,secim,zarSayisi = 0,hileliSayi;
		int[] arr;
		ArrayList<Zar> zarList = new ArrayList<Zar>();
		Scanner kyb = new Scanner(System.in);
		System.out.println("Bir zarin kac yuzu olabilir:");
		zar.yuz = kyb.nextInt();
		arr = new int[zar.yuz];
		while(1==1){
			System.out.println("***Hosgeldiniz***");
			System.out.println("Islemi seciniz:\n1-Zar At\n2-Hileli Zar At\n" +
				"3-Su ana kadar atilan zarlarin ortalamasini goster\n4-Su ana kadar hangi deger kac kere atilmis goster\n5-Cikis");
			System.out.print("Seciminiz: ");
			secim = kyb.nextInt();
			if(secim == 5){
				System.out.println("Sonlandirildi...");
				System.exit(0);
			}
			else if(secim == 1){
				System.out.println("Kac tane zar atilacak:");
				zarSayisi = kyb.nextInt();
				for(int i=0;i<zarSayisi;i++){
					zarList.add(new Zar());
					zarList.get(i).zarAt();
					arr[zarList.get(i).getDeger()-1]++;
				}
			}
			else if(secim == 2){
				System.out.println("Kac tane zar atilacak: ");
				zarSayisi = kyb.nextInt();
				System.out.println("Tutulan sayi: ");
				hileliSayi = kyb.nextInt();
				for(int i=0;i<zarSayisi;i++){
					zarList.add(new Zar());
					zarList.get(i).zarTut(hileliSayi);
					arr[zarList.get(i).getDeger()-1]++;
				}
			}
			else if(secim == 3){
				for(int i=0;i<zarSayisi;i++){
					toplam += zarList.get(i).getDeger();
				}
				System.out.println("Atilan zarlarin ortalamasi: " + (double)(toplam/zarSayisi));
			}
			else if(secim == 4){
				for(int i=0;i<zar.yuz;i++){
					System.out.print((i+1) + ":");
					for(int j=0;j<arr[i];j++){
						System.out.print("*");
					}
					System.out.println();
				}
			}
		}
	}
}