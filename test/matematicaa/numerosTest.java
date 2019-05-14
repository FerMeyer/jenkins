/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicaa;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ferme
 */
public class numerosTest {
    
     private numeros n;
    
    public numerosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         n = new numeros();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testNumeroPar() {
        assertTrue(n.numeroPar(22));
    }
    
    @Test
    public void testAreaQuadrada() {
        
        assertEquals(100, n.areaQuadrado(10));
    }
    @Test
    public void testDivisivel() {
        
        assertTrue(n.numeroDivisivel(6, 2));
    
    }
    
}
