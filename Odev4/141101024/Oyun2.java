import java.util.Scanner;

class Oyun2{

	public int satir, sutun;
	public char[][] tahta;
	public char kullanici1, kullanici2;
	public boolean dolduMu = true;
	public int oyuncu1Count, oyuncu2Count;

	public void tahtaOlustur(){
		tahta = new char[satir+1][sutun+3];
		for(int i=1;i<=satir;i++){
			for(int j=2;j<=sutun+1;j++){
				tahta[i][j] = '#';
			}
		}
	}

	public void tahtaGoster(){
		for(int i=1;i<=satir;i++){
			for(int j=2;j<=sutun+1;j++){
				System.out.print(tahta[i][j]);
			}
			System.out.println();
		}
	}

	public void kazananKim(){
		for(int i=1;i<satir;i++){
			for(int j=2;j<sutun;j++){
				if(tahta[i][j] == kullanici1 && tahta[i+1][j] == kullanici1 && tahta[i+1][j+2] == kullanici1){
					oyuncu1Count++;
				}
				if(tahta[i][j] == kullanici1 && tahta[i+1][j-2] == kullanici1 && tahta[i+1][j] == kullanici1){
					oyuncu1Count++;
				}
				if(tahta[i][j] == kullanici2 && tahta[i+1][j] == kullanici2 && tahta[i+1][j+2] == kullanici2)
					oyuncu2Count++;
				if(tahta[i][j] == kullanici2 && tahta[i+1][j-2] == kullanici2 && tahta[i+1][j] == kullanici2){
					oyuncu2Count++;
				}	
			}	
		}
	}

	public boolean dolduMu(){
		for(int i=1;i<=satir;i++){
			for(int j=2;j<=sutun+1;j++){
				if(tahta[i][j] == '#')
					return false;
			}	
		}
		return true;
	}

	public boolean oynat(int satir, int sutun,char sembol){
		if(satir > this.satir || sutun > this.sutun || satir < 1 || sutun < 1){
			return false;
		}
		else if(tahta[satir][sutun+1] == '#'){
			tahta[satir][sutun+1] = sembol;
			return true;
		}
		else{
			return false;
		}
	}

	public int ConvertStringToInt(String s){
        int num = 0;
        for(int i = 0;i<s.length();i++){
            if(((int)s.charAt(i) >= 48) && ((int)s.charAt(i) <= 57)){
                num = num * 10 + ((int)s.charAt(i) - 48);
            }
        }
        return num; 
    }

    public String boslukSil(String input){
    	return input.replaceAll(" ","");
    }

    public String[] girdiAyir(String input){
    	String temp = boslukSil(input);
    	String[] result = new String[2];
    	for(int i=0;i<temp.length();i++){
    		if(temp.charAt(i) == ','){
    			result[0] = temp.substring(0,i);
    			result[1] = temp.substring(i+1);
    		}
    	}
    	return result;
    }

}