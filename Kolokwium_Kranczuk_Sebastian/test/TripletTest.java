/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sebastian
 */
public class TripletTest {
    
    public TripletTest() {
    }
    
    @Test
    public void maxValueTestMethod() {
        Triplet triplet = new Triplet();
        assertTrue(triplet.maxValue() == 60);
        System.out.println("Max: " + triplet.maxValue());
    }
    
}
