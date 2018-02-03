import java.util.Scanner;
class BasketbolGame{
	public String firstTeam;
	public String secondTeam;
	public int scoreOfFirstTeam;
	public int scoreOfSecondTeam;
	String status;
	Scanner kyb;
	public BasketbolGame(){
		kyb = new Scanner(System.in);
		System.out.println("Ilk takimin adini giriniz: ");
		firstTeam = kyb.nextLine();
		System.out.println("Ikinci takimin adini giriniz: ");
		secondTeam = kyb.nextLine();
		scoreOfFirstTeam = scoreOfSecondTeam = 0;
	}
	public void birPuan(char team){
		if(team == 'a'){
			scoreOfFirstTeam++;
		}
		else if(team == 'b'){
			scoreOfSecondTeam++;
		}
	}
	public void ikiPuan(char team){
		if(team == 'a'){
			scoreOfFirstTeam+=2;
		}
		else if(team == 'b'){
			scoreOfSecondTeam+=2;
		}
	}
	public void ucPuan(char team){
		if(team == 'a'){
			scoreOfFirstTeam+=3;
		}
		else if(team == 'b'){
			scoreOfSecondTeam+=3;
		}
	}
	public void degistir(String durum){
		status = durum;
	}
	public String kazanan(){
		if(scoreOfFirstTeam > scoreOfSecondTeam){
			return "Winning team " + firstTeam;
		}
		else if(scoreOfSecondTeam > scoreOfFirstTeam){
			return "Winning team " + secondTeam;
		}
		return "draw";
	}
	public String skor(){
		return firstTeam + ": " + scoreOfFirstTeam + " - " + secondTeam + ": " + scoreOfSecondTeam;
	}

}