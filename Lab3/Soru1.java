import java.util.Scanner;

class Soru1{
	public static void main(String args[]){
		Scanner kyb = new Scanner(System.in);
		System.out.print("Email adresinizi giriniz: ");
		String email = kyb.nextLine();
		if( !( (email.charAt(0) >= 'A' && email.charAt(0) <= 'Z') || (email.charAt(0) >= 'a' && email.charAt(0) <= 'z')) ) {
			System.out.println("Uygun bir email adresi girmediniz.");
			System.exit(0);
		}
		else if( !email.contains("@") ) {
			System.out.println("Uygun bir email adresi girmediniz.");
			System.exit(0);
		}
		else if( email.substring(0,email.indexOf("@")+1).contains(".") ){
			System.out.println("Uygun bir email adresi girmediniz.");
			System.exit(0);
		}
		System.out.println("Girdiginiz mail adresine ait;");
		System.out.println("Kullanıcı adı: " + email.substring(0,email.indexOf("@")));
		System.out.println("Sunucu adı: " + email.substring(email.indexOf("@")+1,email.indexOf(".")));
	}
}
