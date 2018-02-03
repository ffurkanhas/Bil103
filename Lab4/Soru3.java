import java.util.Scanner;
class Soru3{
	public static void main(String args[]){
		Scanner kyb = new Scanner(System.in);
		while(1==1){
			System.out.println("Bir sayi giriniz: ");
			int sayi = kyb.nextInt();
			if(sayi<0)
				System.exit(0);		
			for(int i=0;i<sayi;i++){
				for(int j=sayi-i;j>1;j--)
					System.out.print(" ");
				for(int k=0;k<i;k++)
					System.out.print("*");
				System.out.print("\n");
			}
		}	
	}
}
