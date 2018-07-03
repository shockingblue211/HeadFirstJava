package games;

import java.util.ArrayList;

import dotComs.DotCom;
import helpers.GameHelper;

public class DotComBust {
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<>();
	private int numOfGuesses = 0;
	
	private void setUpGame(){
		DotCom one = new DotCom();
		one.setName("Pet.com");
		DotCom two = new DotCom();
		two.setName("eToys.com");
		DotCom three = new DotCom();
		three.setName("Go2.com");
		dotComsList.add(one);
		dotComsList.add(two);
		dotComsList.add(three);
		
//		System.out.println("Created dotcoms");
		for(DotCom d : dotComsList){
			ArrayList<String> l = helper.placeDotCom(3);
			d.setLocationCells(l);
		}
		
		
		System.out.println("Your goal is to sink three dot coms.");
		System.out.println("Pets.com, eToys.com, Go2.com");
		System.out.println("Try to sink them all in the fewest number of guesses");
	}
	
	private void startPlaying(){
		while(!dotComsList.isEmpty()){
			String userGusess = helper.getUserInput("Enter a guess: ");
			checkUserGuess(userGusess);
		}
		finishGame();
	}
	
	private void checkUserGuess(String userGuess){
		numOfGuesses++;
		String result = "miss";
		for(DotCom d : dotComsList){
			result = d.checkYourself(userGuess);
			if(result.equals("hit"))
				break;
			if(result.equals("kill")){
				dotComsList.remove(d);
				break;
			}
		}
		System.out.println(result);
	}
	
	private void finishGame(){
		System.out.println("All dot coms are dead! Your stock is now worthless.");
		if(numOfGuesses <= 18){
			System.out.println("It only took you " + numOfGuesses + " guesses.");
			System.out.println("Great job!");
		}
		else {
			System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
			System.out.println("DMV goes faster than you do!");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}

}
