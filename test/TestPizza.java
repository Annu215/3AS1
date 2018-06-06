/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class TestPizza {
    pizza p;
    
    public TestPizza() {
    }
    
    @BeforeClass
    public static void setUpClass() {
       
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         p=new pizza();
    }
    
    @After
    public void tearDown() {
    }
    
   @Test
    public void testdeliverycharge()
    {
      assertEquals(110,p.deliverycharge(2));
    }
    
         @Test
    public void testpizzadetails()
    {
      assertEquals(150,p.pizzadetails(10));

    }

     
}
