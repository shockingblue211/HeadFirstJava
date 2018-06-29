package dotComs;

public class SimpleDotCom {
	private int[] location;
	private int numOfHits = 0;
	
	public void  setLocationCells(int[] locs){
		location = locs;
	}
	
	public String checkYourself(String stringGuess){
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		for(int cell : location){
			if(guess == cell){
				result = "hit";
				numOfHits++;
				break;
			}
		}
		
		if(numOfHits == location.length){
			result = "kill";
		}
		
		System.out.println(result);
		return result;
	}
}
