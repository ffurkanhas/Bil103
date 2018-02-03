import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner kyb = new Scanner(System.in);
		BasketbolGame game = new BasketbolGame();
		while(1==1){
			System.out.print("Enter Team and score, for first team 'a', for second 'b': ");
			String score = kyb.nextLine();
			if(score.equals("q")){
				System.exit(0);
			}
			if(score.charAt(2) == '1'){
				game.birPuan(score.charAt(0));
			}
			else if(score.charAt(2) == '2'){
				game.ikiPuan(score.charAt(0));
			}
			else if(score.charAt(2) == '3'){
				game.ucPuan(score.charAt(0));
			}
			System.out.println(game.skor() + " " + game.kazanan());
		}
	}
}