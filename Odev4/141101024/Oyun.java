import java.util.Scanner;

class Oyun{

	public int satir, sutun;
	public char[][] tahta;
	public char kullanici1, kullanici2;
	public boolean dolduMu = true;
	public int oyuncu1Count, oyuncu2Count;

	public void tahtaOlustur(){
		tahta = new char[satir+1][sutun+1];
		for(int i=1;i<=satir;i++){
			for(int j=1;j<=sutun;j++){
				tahta[i][j] = '#';
			}
		}
	}

	public void tahtaGoster(){
		for(int i=1;i<=satir;i++){
			for(int j=1;j<=sutun;j++){
				System.out.print(tahta[i][j]);
			}
			System.out.println();
		}
	}

	public void kazananKim(){
		for(int i=1;i<satir;i++){
			for(int j=1;j<sutun;j++){
				if(tahta[i][j] == kullanici1 && tahta[i+1][j-1] == kullanici1 && tahta[i+1][j] == kullanici1 && tahta[i+1][j+1] == kullanici1){
					oyuncu1Count++;
				}
				if(tahta[i+1][j+1] == kullanici1 && tahta[i][j-1] == kullanici1 && tahta[i][j] == kullanici1 && tahta[i][j+1] == kullanici1){
					oyuncu1Count++;
				}
				if(tahta[i][j] == kullanici2 && tahta[i+1][j-1] == kullanici2 && tahta[i+1][j] == kullanici2 && tahta[i+1][j+1] == kullanici2)
					oyuncu2Count++;
				if(tahta[i+1][j+1] == kullanici2 && tahta[i][j-1] == kullanici2 && tahta[i][j] == kullanici2 && tahta[i][j+1] == kullanici2){
					oyuncu2Count++;
				}	
			}	
		}
	}

	public boolean dolduMu(){
		for(int i=1;i<=satir;i++){
			for(int j=1;j<=sutun;j++){
				if(tahta[i][j] == '#')
					return false;
			}	
		}
		return true;
	}

	public boolean oynat(char sembol){
		int rndSatir,rndSutun;
		rndSatir = (int) (Math.random() * satir) + 1;
		rndSutun = (int) (Math.random() * sutun) + 1;
		if(tahta[rndSatir][rndSutun] == '#'){
			tahta[rndSatir][rndSutun] = sembol;
			return true;
		}
		else
			return false;
	}

}