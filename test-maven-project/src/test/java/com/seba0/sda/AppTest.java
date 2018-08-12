package com.seba0.sda;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void wyswietlTekst() {
        App.wyswietlTekst("Test");
    }

    @Test
    public void testSumowanieTablicy345() {
        //given
        int[] tablica = {3, 4, 5};
        System.out.println("Sumowanie tablicy: " + Arrays.toString(tablica));
        int suma = App.sumowanieTablicy(tablica);
        System.out.println("Suma: " + suma);
        assertEquals(suma, 3 + 4 + 5);
    }

    @Test
    public void testSumowanieTablicyNull() {
        //given
        int[] tablica = null;
        System.out.println("Sumowanie tablicy: " + Arrays.toString(tablica));
        //when
        int suma = App.sumowanieTablicy(tablica);
        System.out.println("Suma: " + suma);
        //then
        assertEquals(suma, 0);
    }
}
