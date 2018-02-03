import java.util.Scanner;
class Soru1{
	public static void main(String args[]){
		Scanner kyb = new Scanner(System.in);
		System.out.println("Yasinizi giriniz: ");
		int age = kyb.nextInt();
		kyb.nextLine();
		System.out.println("Dizgiyi giriniz:");
		String dizgi = kyb.nextLine();
		int sifir = 0;
		int bir = 0;
		int iki = 0;
		int uc = 0;
		int dort = 0;
		int bes = 0;
		int alti = 0;
		int yedi = 0;
		int sekiz = 0;
		int dokuz = 0;
		for(int i=0;i<dizgi.length();i++){
			if(dizgi.charAt(i)=='0'){
				sifir++;
			}
			else if(dizgi.charAt(i)=='1')
				bir++;
			else if(dizgi.charAt(i)=='2')
				iki++;
			else if(dizgi.charAt(i)=='3')
				uc++;
			else if(dizgi.charAt(i)=='4')
				dort++;
			else if(dizgi.charAt(i)=='5')
				bes++;
			else if(dizgi.charAt(i)=='6')
				alti++;
			else if(dizgi.charAt(i)=='7')
				yedi++;
			else if(dizgi.charAt(i)=='8')
				sekiz++;
			else if(dizgi.charAt(i)=='9')
				dokuz++;
		}
		System.out.print("0:");
		for(int i=0;i<sifir;i++){
			System.out.print("*");
		}
		System.out.print("\n1:");
		for(int i=0;i<bir;i++){
			System.out.print("*");
		}
		System.out.print("\n2:");
		for(int i=0;i<iki;i++){
			System.out.print("*");
		}
		System.out.print("\n3:");
		for(int i=0;i<uc;i++){
			System.out.print("*");
		}
		System.out.print("\n4:");
		for(int i=0;i<dort;i++){
			System.out.print("*");
		}
		System.out.print("\n5:");
		for(int i=0;i<bes;i++){
			System.out.print("*");
		}
		System.out.print("\n6:");
		for(int i=0;i<alti;i++){
			System.out.print("*");
		}
		System.out.print("\n7:");
		for(int i=0;i<yedi;i++){
			System.out.print("*");
		}
		System.out.print("\n8:");
		for(int i=0;i<sekiz;i++){
			System.out.print("*");
		}
		System.out.print("\n9:");
		for(int i=0;i<dokuz;i++){
			System.out.print("*");
		}
		System.out.println();
	}
}