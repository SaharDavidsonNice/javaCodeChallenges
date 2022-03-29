import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EvenOrOddTest {

    @Test
    public void isEven_true(){
        assertTrue(EvenOrOdd.isEven(0));
        assertTrue(EvenOrOdd.isEven(4));
        assertTrue(EvenOrOdd.isEven(6));
        assertTrue(EvenOrOdd.isEven(-20));
        assertTrue(EvenOrOdd.isEven(100));
    }
    @Test
    public void isEven_false(){
        assertFalse(EvenOrOdd.isEven(1));
        assertFalse(EvenOrOdd.isEven(-1));
        assertFalse(EvenOrOdd.isEven(5));
        assertFalse(EvenOrOdd.isEven(-99));
    }


}
