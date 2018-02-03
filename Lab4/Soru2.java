import java.util.Scanner;
class Soru2{
	public static void main(String args[]){
		Scanner kyb = new Scanner(System.in);
		while(1==1){
			System.out.println("Bir sayi giriniz: ");
			int sayi = kyb.nextInt();
			if(sayi<0)
				System.exit(0);
			for(int i=1;i<=sayi;i++){
				if(i%3 == 0 || i%5 == 0)
					System.out.println("BIL113");
				else
					System.out.println(i);
			}
		}
	}
}
