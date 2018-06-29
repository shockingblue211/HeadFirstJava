package games;

import java.util.ArrayList;


import dotComs.SimpleDotComVer2;
import helpers.SimpleGameHelper;

public class SimpleDotComGameVer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfGuesses = 0;
		
		SimpleGameHelper helper = new SimpleGameHelper();
		
		SimpleDotComVer2 theDotCom = new SimpleDotComVer2();
		int randonNum = (int) (Math.random() * 5);
		

		ArrayList<Integer> locations = new ArrayList<>();
		for(int i=0; i<3; i++)
			locations.add(randonNum + i);
		
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
