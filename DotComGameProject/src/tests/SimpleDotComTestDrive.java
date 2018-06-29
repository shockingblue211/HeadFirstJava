package tests;

import dotComs.SimpleDotCom;

public class SimpleDotComTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDotCom dot = new SimpleDotCom();

		int[] locations = {3, 4, 5};
		dot.setLocationCells(locations);
		
		String userGuess = "3";
		String result = dot.checkYourself(userGuess);
		String testResult = "failed";
		if(result.equals("hit")){
			testResult = "Passed";
		}
		
		System.out.println(testResult);
	}

}
