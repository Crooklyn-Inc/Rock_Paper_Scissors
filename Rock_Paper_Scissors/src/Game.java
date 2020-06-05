import java.util.Random;
import java.util.Scanner;


public class Game {
	public int userChoise;
	public int compChoise;
	public int compScore, userScore;
	public int howMany;
	public int playAgain;

	Random rnd = new Random();
	Scanner input = new Scanner(System.in);

	public Game() {

	}

	public void howMany() {
		System.out.println();
		System.out.println(""
				+ "How many times do you wanna play?\n"
				+ "\n"
				+ "(--3--5--7--)");
		howMany = input.nextInt();
		getUserInput();
		finalResult();
		anotherOne();
		
	}
	
	public void anotherOne() {
		compScore = 0;
		userScore = 0;
		System.out.println();
		System.out.println("Play Again ?\n"
				+ "1 if yes\n"
				+ "2 if no");
		playAgain = input.nextInt();
		if (playAgain == 1) {
			howMany();
		}else {
			System.out.println("Thank you for playing.\n"
					+ "See you later!!");
		}
	}

	public void getUserInput() {
		for(int i = 1; i <= howMany; i++) {
			System.out.println();
			System.out.println("What's your choise? \n"
					+ "Enter 1 to play ROCK\n"
					+ "Enter 2 to play PAPER\n"
					+ "Enter 3 to play SCISSORS\n"
					+ "Enter 4 to play LIZARD\n"
					+ "Enter 5 to play SPOCK");

			userChoise = input.nextInt();
			while(userChoise < 1 || userChoise > 6) {
				System.out.println("Enter a number between 1 and 5:");
				userChoise = input.nextInt();
			}
			getCompChoise();
			gameResult();

		}
	}

	public void getCompChoise() {
		int maxNum = 5;
		int minNum = 1;
		compChoise = rnd.nextInt(maxNum - minNum + 1) + minNum;
	}

	public void gameResult() {
		if(userChoise == 1) {
			if(compChoise == 1) {
				System.out.println("Computer played ROCK\n");
				userScore ++;
				compScore ++;
			}else if(compChoise == 2) {
				System.out.println("Computer played PAPER\n"
						+ "PAPER covers ROCK\n");
				compScore ++;
			}else if(compChoise == 3){
				System.out.println("Computer played SCISSORS\n"
						+ "ROCK crushes SCISSORS\n");
				userScore ++;
			}else if(compChoise == 4) {
				System.out.println("Computer played LIZARD\n"
						+ "ROCK crushes LIZARD\n");
				userScore ++;
			}else if(compChoise == 5) {
				System.out.println("Computer played SPOCK\n"
						+ "LIZARD vaporizes ROCK\n");
				compScore ++;
			}

		}else if(userChoise == 2) {
			if(compChoise == 1) {
				System.out.println("Computer played ROCK\n"
						+ "PAPER covers ROCK\n");
				userScore ++;
			}else if(compChoise == 2) {
				System.out.println("Computer played PAPER\n");
				compScore ++;
				userScore ++;
			}else if(compChoise == 3){
				System.out.println("Computer played SCISSORS\n"
						+ "SCISSORS cuts PAPER\n");
				compScore ++;
			}else if(compChoise == 4) {
				System.out.println("Computer played LIZARD\n"
						+ "LIZARD eats PAPER\n");
				compScore ++;
			}else if(compChoise == 5) {
				System.out.println("Computer played SPOCK\n"
						+ "PAPER disproves SPOCK\n");
				userScore ++;
			}
		}else if(userChoise == 3){
			if(compChoise == 1) {
				System.out.println("Computer played ROCK\n"
						+ "ROCK crushes SCISSORS\n");
				compScore ++;
			}else if(compChoise == 2) {
				System.out.println("Computer played PAPER\n"
						+ "SCISSORS cut PAPER\n");
				userScore ++;
			}else if(compChoise == 3){
				System.out.println("Computer played SCISSORS\n");
				compScore ++;
				userScore ++;
			}else if(compChoise == 4) {
				System.out.println("Computer played LIZARD\n"
						+ "SCISSORS decapitates LIZARD\n");
				userScore ++;
			}else if(compChoise == 5) {
				System.out.println("Computer played SPOCK\n"
						+ "SPOCK smashes SCISSORS\n");
				compScore ++;
			}
			
		}else if(userChoise == 4) {
			if(compChoise == 1) {
				System.out.println("Computer played ROCK\n"
						+ "ROCK crushes LIZARD\n");
				compScore ++;
			}else if(compChoise == 2) {
				System.out.println("Computer played PAPER\n"
						+ "LIZARD eats PAPER\n");
				userScore ++;
			}else if(compChoise == 3){
				System.out.println("Computer played SCISSORS\n"
						+ "SCISSORS decapitates LIZARD\n");
				compScore ++;
			}else if(compChoise == 4) {
				System.out.println("Computer played LIZARD");
				userScore ++;
				compScore ++;
			}else if(compChoise == 5) {
				System.out.println("Computer played SPOCK\n"
						+ "LIZARD poisons SPOCK\n");
				userScore ++;
			}
		}else if(userChoise == 5) {
			if(compChoise == 1) {
				System.out.println("Computer played ROCK\n"
						+ "SPOCK vaporizes ROCK\n");
				userScore ++;
			}else if(compChoise == 2) {
				System.out.println("Computer played PAPER\n"
						+ "PAPER disproves SPOCK\n");
				compScore ++;
			}else if(compChoise == 3){
				System.out.println("Computer played SCISSORS\n"
						+ "SPOCK smashes SCISSORS\n");
				userScore ++;
			}else if(compChoise == 4) {
				System.out.println("Computer played LIZARD\n"
						+ "LIZARD poisons SPOCK");
				compScore ++;
			}else if(compChoise == 5) {
				System.out.println("Computer played SPOCK");
				userScore ++;
				compScore ++;
			}
		}
		System.out.printf("YOU %2d\t COMPUTER %2d ",userScore,compScore);
		System.out.println();
	}

	public void playGame() {
		howMany();
	}
	
	public void finalResult() {
		if (compScore > userScore) {
			System.out.println(""
					+ " ____________\n"
					+ "|            |\n"
					+ "|  YOU LOSE  |\n"
					+ "|____________|");
		}else if(userScore > compScore){
			System.out.println(""
					+ " ___________\n"
					+ "|           |\n"
					+ "|  YOU WIN  |\n"
					+ "|___________|");
		}else {
			System.out.println(""
					+ " ___________\n"
					+ "|           |\n"
					+ "|   DRAWN   |\n"
					+ "|___________|");
		}
	}

}
