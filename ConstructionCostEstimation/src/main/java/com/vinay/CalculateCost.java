package com.vinay;

public class CalculateCost {
	public double getCost( String materialStandard, double areaOfHouse , boolean automated ) {
		
		double cost = 0.0;
		
		if(materialStandard.equals("standard"))
			cost= 1200*areaOfHouse; 
		
		else if(materialStandard.equals("aboveStandard"))
			cost = 1500*areaOfHouse;
		
		else if(materialStandard.equals("highStandard") && automated == true)
			cost = 1800*areaOfHouse;
		
		else 
			cost = 2500*areaOfHouse;
		
		return cost;
	}

}
