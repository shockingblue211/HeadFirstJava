package dotComs;

import java.util.ArrayList;

public class SimpleDotComVer2 {
	private ArrayList<Integer> locationCells;
	
	public void setLocationCells(ArrayList<Integer> loc){
		locationCells = loc;
	}
	
	public String checkYourself(String userInput){
		String result = "miss";
		int index = locationCells.indexOf(Integer.parseInt(userInput));
		if(index >= 0){
			locationCells.remove(index);
			
			if(locationCells.isEmpty()){
				result = "kill";
			}
			else 
				result = "hit";
		}
		return result;
	}
}
