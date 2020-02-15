package com.vinay;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase{
	
	
	public AppTest(String testName)
	{
		super(testName);
	}
	
	public static Test suite()
	{
		return new TestSuite(AppTest.class);
	}
	
	public void testApp()
    {
        CalculateCost calculatecost = new CalculateCost();
        assertEquals(9600,calculatecost.getCost("standard", 8 , false),0.0);
        assertEquals(6000,calculatecost.getCost("aboveStandard", 4 , false),0.0);
        assertEquals(25000,calculatecost.getCost("highStandard", 10 , false),0.0);
        assertEquals(22500,calculatecost.getCost("highStandard", 12.5 , true),0.0);
    }

}
