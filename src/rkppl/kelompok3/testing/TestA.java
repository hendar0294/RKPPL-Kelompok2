package rkppl.kelompok3.testing;

import rkppl.kelompok3.tubes.A;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestA {

    private A a;
    
    @Before
    public void startTest() {
        a = new A();
        System.out.println("Mengawali Testing Untuk Kelas A");
    }
    
    @Test
    public void testCase1() {
        int jum = a.add(8, 1);
        assertTrue("Seharusnya benar", jum == 9 );
    }    
    
    @Test
    public void testCase2() {
        int min = a.sub(5, 2);
        assertTrue("Seharusnya benar", min == 3);
    }
    
    @Test
    public void testCase3() {
        assertEquals("Seharusnya bernilai sama", a.add(3, 7), a.add(7, 3));
    }
    
    @Test
    public void testCase4() {
        assertNotEquals("Seharusnya tidak sama", a.sub(3, 4), a.sub(4, 3));
    }

    @After
    public void endTest() {
        System.out.println("Mengakhiri Testing Untuk Kelas A ");
    }
    
}
