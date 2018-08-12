package javaszc4.git;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
    public void testSumowanieTablicy() {
        int[] tablica = {3, 4, 5};
        int suma = App.sumowanieTablicy(tablica);
        assertEquals(suma, 3 + 4 + 5);
    }
}
