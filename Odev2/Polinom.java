import java.util.Scanner;
class Polinom{
	Scanner kyb = new Scanner(System.in);
	int x4Katsayisi, x3Katsayisi, x2Katsayisi, xKatsayisi,sabit,turevNoktasi;
	String operationString;
	// -4*x^3   +     4*x     +   9*x    +    x^4    +    2*x^2    +    20    +    17*x^4    +    x   - 6*x
	public void girdiOku(){
		ParseInt parser = new ParseInt();
		System.out.println("Polinomu giriniz:");
		operationString = kyb.nextLine();
		operationString = operationString.replaceAll(" ","");
		System.out.println("Islem: " + operationString);
		int sayac = 0;
		String temp = "";
		while(operationString.length() > 0){
			if(operationString.charAt(sayac) == '-' || operationString.charAt(sayac) == '+'){
				if(operationString.charAt(0) == '-'){
					int toplamIndex = operationString.substring(1).indexOf("+");
					int eksiIndex = operationString.substring(1).indexOf("-");
					if(toplamIndex == -1 && eksiIndex == -1)
						break;
					if(toplamIndex == -1){
						toplamIndex = Integer.MAX_VALUE;
					}
					if(eksiIndex == -1){
						eksiIndex = Integer.MAX_VALUE;
					}
					temp = operationString.substring(1,((toplamIndex > eksiIndex) ? eksiIndex : toplamIndex)+1);
					operationString = operationString.substring(((toplamIndex > eksiIndex) ? eksiIndex : toplamIndex)+1);
					sayac = 0;
					if(!temp.contains("x")){
							sabit += parser.ConvertStringToInt(temp);
						}
						else{
							if(!temp.contains("^")){
								if(!temp.contains("*")){
									xKatsayisi--;
								}
								else{
									int carpiIndex = temp.indexOf("*");
									xKatsayisi -= parser.ConvertStringToInt(temp.substring(0,carpiIndex));
								}
							}
							else{
								int ussuIndex = temp.indexOf("^");
								if(temp.length() <= 4){
									if(temp.charAt(ussuIndex+1) == '1'){
										xKatsayisi--;
									}
									else if(temp.charAt(ussuIndex+1) == '2'){
										x2Katsayisi--;
									}
									else if(temp.charAt(ussuIndex+1) == '3'){
										x3Katsayisi--;
									}
									else if(temp.charAt(ussuIndex+1) == '4'){
										x4Katsayisi--;
									}
								}
								else{
									int carpiIndex = temp.indexOf("*");
									if(temp.charAt(ussuIndex+1) == '1'){
										xKatsayisi -= parser.ConvertStringToInt(temp.substring(0,carpiIndex));
									}
									else if(temp.charAt(ussuIndex+1) == '2'){
										x2Katsayisi -= parser.ConvertStringToInt(temp.substring(0,carpiIndex));									}
									else if(temp.charAt(ussuIndex+1) == '3'){
										x3Katsayisi -= parser.ConvertStringToInt(temp.substring(0,carpiIndex));
									}
									else if(temp.charAt(ussuIndex+1) == '4'){
										x4Katsayisi -= parser.ConvertStringToInt(temp.substring(0,carpiIndex));
									}
								}
							}
						}

				}
				else if(operationString.charAt(0) != '-'){
					int toplamIndex = operationString.substring(1).indexOf("+");
					int eksiIndex = operationString.substring(1).indexOf("-");
					if(toplamIndex == -1 && eksiIndex == -1)
						break;
					if(toplamIndex == -1){
						toplamIndex = Integer.MAX_VALUE;
					}
					if(eksiIndex == -1){
						eksiIndex = Integer.MAX_VALUE;
					}
					temp = operationString.substring(0,((toplamIndex > eksiIndex) ? eksiIndex : toplamIndex)+1);
					operationString = operationString.substring(((toplamIndex > eksiIndex) ? eksiIndex : toplamIndex)+1);
					sayac = 0;
					if(!temp.contains("x")){
							sabit += parser.ConvertStringToInt(temp);
					}
					else{
						if(!temp.contains("^")){
							if(!temp.contains("*")){
								xKatsayisi++;
							}
							else{
								int carpiIndex = temp.indexOf("*");
								xKatsayisi += parser.ConvertStringToInt(temp.substring(0,carpiIndex));
							}
						}
						else{
							int ussuIndex = temp.indexOf("^");
							if(temp.length() <= 4){
								if(temp.charAt(ussuIndex+1) == '1'){
									xKatsayisi++;
								}
								else if(temp.charAt(ussuIndex+1) == '2'){
									x2Katsayisi++;
								}
								else if(temp.charAt(ussuIndex+1) == '3'){
									x3Katsayisi++;
								}
								else if(temp.charAt(ussuIndex+1) == '4'){
									x4Katsayisi++;	
								}
							}
							else{
								int carpiIndex = temp.indexOf("*");
								if(temp.charAt(ussuIndex+1) == '1'){
									xKatsayisi += parser.ConvertStringToInt(temp.substring(0,carpiIndex));
								}
								else if(temp.charAt(ussuIndex+1) == '2'){
									x2Katsayisi += parser.ConvertStringToInt(temp.substring(0,carpiIndex));
								}
								else if(temp.charAt(ussuIndex+1) == '3'){
									x3Katsayisi += parser.ConvertStringToInt(temp.substring(0,carpiIndex));
								}
								else if(temp.charAt(ussuIndex+1) == '4'){
									x4Katsayisi += parser.ConvertStringToInt(temp.substring(0,carpiIndex));
								}
							}
						}
					}
				}
			}
			else if(!operationString.contains("+") && !operationString.contains("-")){
				temp = operationString;
				operationString = "";
			}
			else{
				sayac++;
			}
		}
		temp = operationString;
		if(temp.charAt(0) != '-'){
			if(!temp.contains("x")){
							sabit += parser.ConvertStringToInt(temp);
						}
			else{
				if(!temp.contains("^")){
					if(!temp.contains("*")){
						xKatsayisi++;
					}
					else{
						int carpiIndex = temp.indexOf("*");
						xKatsayisi += parser.ConvertStringToInt(temp.substring(0,carpiIndex));
					}
				}
				else{
					int ussuIndex = temp.indexOf("^");
					if(temp.length() <= 4){
						if(temp.charAt(ussuIndex+1) == '1'){
							xKatsayisi++;
						}
						else if(temp.charAt(ussuIndex+1) == '2'){
							x2Katsayisi++;
						}
						else if(temp.charAt(ussuIndex+1) == '3'){
							x3Katsayisi++;
						}
						else if(temp.charAt(ussuIndex+1) == '4'){
							x4Katsayisi++;	
						}
					}
					else{
						int carpiIndex = temp.indexOf("*");
						if(temp.charAt(ussuIndex+1) == '1'){
							xKatsayisi += parser.ConvertStringToInt(temp.substring(0,carpiIndex));
						}
						else if(temp.charAt(ussuIndex+1) == '2'){
							x2Katsayisi += parser.ConvertStringToInt(temp.substring(0,carpiIndex));
						}
						else if(temp.charAt(ussuIndex+1) == '3'){
							x3Katsayisi += parser.ConvertStringToInt(temp.substring(0,carpiIndex));
						}
						else if(temp.charAt(ussuIndex+1) == '4'){
							x4Katsayisi += parser.ConvertStringToInt(temp.substring(0,carpiIndex));
						}
					}
				}
			}
		}
		else{
			if(!temp.contains("x")){
							sabit -= parser.ConvertStringToInt(temp);
						}
			else{
				if(!temp.contains("^")){
					if(!temp.contains("*")){
						xKatsayisi--;
					}
					else{
						int carpiIndex = temp.indexOf("*");
						xKatsayisi -= parser.ConvertStringToInt(temp.substring(0,carpiIndex));
					}
				}
				else{
					int ussuIndex = temp.indexOf("^");
					if(temp.length() <= 4){
						if(temp.charAt(ussuIndex+1) == '1'){
							xKatsayisi--;
						}
						else if(temp.charAt(ussuIndex+1) == '2'){
							x2Katsayisi--;
						}
						else if(temp.charAt(ussuIndex+1) == '3'){
							x3Katsayisi--;
						}
						else if(temp.charAt(ussuIndex+1) == '4'){
							x4Katsayisi--;	
						}
					}
					else{
						int carpiIndex = temp.indexOf("*");
						if(temp.charAt(ussuIndex+1) == '1'){
							xKatsayisi -= parser.ConvertStringToInt(temp.substring(0,carpiIndex));
						}
						else if(temp.charAt(ussuIndex+1) == '2'){
							x2Katsayisi -= parser.ConvertStringToInt(temp.substring(0,carpiIndex));
						}
						else if(temp.charAt(ussuIndex+1) == '3'){
							x3Katsayisi -= parser.ConvertStringToInt(temp.substring(0,carpiIndex));
						}
						else if(temp.charAt(ussuIndex+1) == '4'){
							x4Katsayisi -= parser.ConvertStringToInt(temp.substring(0,carpiIndex));
						}
					}
				}
			}
		}
		System.out.println("\nx4Katsayisi: " + x4Katsayisi);
		System.out.println("x3Katsayisi: " + x3Katsayisi);
		System.out.println("x2Katsayisi: " + x2Katsayisi);
		System.out.println("xKatsayisi: " + xKatsayisi);
		System.out.println("sabit: " + sabit); 
	}

	public void turevNoktasiAl(){
		System.out.println("Turev noktasini giriniz: ");
		turevNoktasi = kyb.nextInt();
	}

	public int turevHesapla(){
		int sonuc = ( x4Katsayisi * 4 * usAl(turevNoktasi,3) ) + (x3Katsayisi * 3 * usAl(turevNoktasi,2)) + (x2Katsayisi * 2 * turevNoktasi) + (xKatsayisi);
		return sonuc;
	}

	public int usAl(int sayi,int us){
		int sonuc = 1;
		for(int i=0;i<us;i++)
			sonuc *= sayi;
		return sonuc;
	}
}