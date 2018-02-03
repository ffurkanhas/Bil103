import java.util.Scanner;
class Soru3{
	public static void main(String args[]){
		Scanner kyb = new Scanner(System.in);
		while(1==1){
			System.out.print("x sayisini giriniz: ");
			int x = kyb.nextInt();
			if(x == -1){
				System.out.println("BITTI!");
				System.exit(0);
			}
			System.out.print("n sayisini giriniz: ");
			int n = kyb.nextInt();
			double sonuc = 0;
			for(int i=1;i<=n;i++){
				sonuc += ((double) x / (double) (x+i));
			}
			System.out.println("f(x) = " + sonuc);
		}
	}
}