/**
 * 
 */
package com.vinay;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @author Vinay Kumar
 *
 */
public class AppTest extends TestCase {

	/**
	 * @param name
	 */
	public AppTest(String name) {
		super(name);
	}
	public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigorous Test :-)
     */
    
    public static void testSimpleInterest() {
		CalculateInterest c = new CalculateInterest();
		assertEquals(600.0,c.calculateSimpleInterest(10000, 3, 2),0.0);
		assertEquals(562.5,c.calculateSimpleInterest(15000, 1.5, 2.5),0.0);
		assertEquals(1875.0,c.calculateSimpleInterest(100000, 1.5, 1.25),0.0);
	}
    
    public static void testCompoundInterest() {
    	CalculateInterest c = new CalculateInterest();
		assertEquals(10707.588720000002,c.calculateCompoundInterest(10090, 3, 2),0.0);
		assertEquals(56033.176389969034,c.calculateCompoundInterest(55000, 1.25, 1.5),0.0);
		assertEquals(101880.84722483417,c.calculateCompoundInterest(100000, 1.5, 1.25),0.0);
	}
    public void testApp()
    {
        testSimpleInterest();
        testCompoundInterest();
    }

}
