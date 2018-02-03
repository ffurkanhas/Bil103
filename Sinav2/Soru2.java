class Soru2{

	public static void main(String args[]){
		int x = parseInt("9");
		int x1 = parseInt("115");
		int x2 = parseInt("512",10);
		int x3 = parseInt("100",2);

		System.out.println(x2 + " " + x3);
	}

	public static int parseInt(String sayi){
		return ConvertStringToInt(sayi);
	}
	public static int parseInt(String sayi, int taban){
		int temp = 0;
		int ussu = 0;
		if(taban > 10 || taban < 2){
				System.out.println("Taban 2 ile 10 arasında olmalıdır");
        		System.exit(0);
		}
		for(int i=sayi.length()-1;i>=0;i--){
			if( ConvertCharToInt(sayi.charAt(i)) >= taban){
				System.out.println("Tabandan buyuk rakam olamaz");
        		System.exit(0);
			}
			temp += ConvertCharToInt(sayi.charAt(i)) * (int)Math.pow(taban,ussu) ;
			ussu++;
		}

		return temp;
	}

	public static int ConvertStringToInt(String s){
        int num = 0;
        for(int i = 0;i<s.length();i++){
            if(((int)s.charAt(i) >= 48) && ((int)s.charAt(i) <= 57)){
                num = num * 10 + ((int)s.charAt(i) - 48);
            }
            else{
            	System.out.println("Hatali girdi");
        		System.exit(0);
            }
        }
        return num; 
    }

    public static int ConvertCharToInt(char c){
    	if( !(c >= 48 && c <= 57) ){
    		System.out.println("Hatali girdi");
        	System.exit(0);
    	}
    	return (int) c - 48;
    }
}