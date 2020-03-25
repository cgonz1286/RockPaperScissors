package dmacc.beans;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Game {
	
	private String player1;
	private String computerPlayer;
	private String winner;
	
	public Game(String player1) {
		super();
		this.player1 = player1;
		this.setComputerPlayerToRandom();
		this.determineWinner();
	}

	private void determineWinner() {
		// Default winner is player1
		winner = player1; 
		
		// Switch winner to computerPlayer if applicable
		switch (computerPlayer)
		{
			case "rock": 
				if (player1.equals("scissors") || player1.equals("lizard"))
				{
					winner = computerPlayer;
				}
				break;
			case "paper": 
				if (player1.equals("rock") || player1.equals("spock"))
				{
					winner = computerPlayer; 
				}
				break;
			case "scissors":
				if (player1.equals("paper") || player1.equals("lizard"))
				{
					winner = computerPlayer; 
				}
				break;
			case "lizard":
				if (player1.equals("paper") || player1.equals("spock"))
				{
					winner = computerPlayer; 
				}
				break;
			case "spock":
				if (computerPlayer.equals("scissors") || computerPlayer.equals("rock"))
				{
					winner = computerPlayer; 
				}
				break;
		}
	}

	private void setComputerPlayerToRandom() {
		int randomNumber = (int)(Math.random() * 5) + 1;
				
		switch (randomNumber)
		{
			case 1: computerPlayer = "rock"; break;
			case 2: computerPlayer = "paper"; break;
			case 3: computerPlayer = "scissors"; break;
			case 4: computerPlayer = "lizard"; break;
			case 5: computerPlayer = "spock"; break;
		}
	}
	
}
