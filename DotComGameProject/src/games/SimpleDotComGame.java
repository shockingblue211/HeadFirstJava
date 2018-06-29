package games;

import dotComs.SimpleDotCom;
import helpers.SimpleGameHelper;

public class SimpleDotComGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfGuesses = 0;
		
		SimpleGameHelper helper = new SimpleGameHelper();
		
		SimpleDotCom theDotCom = new SimpleDotCom();
		int randonNum = (int) (Math.random() * 5);
		
		int[] locations = {randonNum, randonNum+1, randonNum+2};
		theDotCom.setLocationCells(locations);
		boolean isAlive = true;
		
		while(isAlive){
			String guess = helper.getUserInput("Enter a Number:");
			String result = theDotCom.checkYourself(guess);		
			numOfGuesses++;
			if(result.equals("kill"))
				isAlive = false;
		}
		System.out.println("You took " + numOfGuesses + " guesses");
	}

}
