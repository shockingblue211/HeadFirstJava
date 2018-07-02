package helpers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameHelper {
	private static final String alphabet = "abcdefg";
	private int gridLength = 7;
	private int gridSize = 49;
	private int[] grid = new int[gridSize];
	private int comCount = 0;
	
	public String getUserInput(String prompt){
		String inputLine = null;
		System.out.println(prompt + " ");
		try {
			BufferedReader is = new BufferedReader(
					new InputStreamReader(System.in)
					);
			inputLine = is.readLine();
			if (inputLine.length() == 0) {
				return null;
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("IOException: " + e);
		}
		return inputLine.toLowerCase();
	}
	
	public ArrayList<String> placeDotCom(int comSize){
		ArrayList<String> alphaCells = new ArrayList<String>();
		String[] alphacoords = new String[comSize];
		String temp = null;
		int[] coords = new int[comSize];
		int attemps = 0;
		boolean success = false;
		int location = 0;
		
		comCount++;
		int incr = 1;
		if((comCount % 2) == 1){
			incr = gridLength;
		}
	}
}
