package tests;

import java.util.ArrayList;
import java.util.Arrays;

import dotComs.DotCom;

public class DotComTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DotCom theDotCom = new DotCom();
		String[] a = {"3", "5", "7"};
		ArrayList<String> l = new ArrayList(Arrays.asList(a));
		theDotCom.setLocationCells(l);
		theDotCom.setName("test.com");
		
		for(int i=0; i<9; i++){
			System.out.println(theDotCom.checkYourself(Integer.toString(i)));
		}
						
	}

}
