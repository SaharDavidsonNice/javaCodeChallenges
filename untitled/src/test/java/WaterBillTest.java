import org.junit.Test;
import static junit.framework.TestCase.assertEquals;


public class WaterBillTest {

    @Test
    public void calculateWaterBill(){
        assertEquals(18.84 , WaterBill.calculateWaterBill(2));
        assertEquals(18.84 , WaterBill.calculateWaterBill(1.2));
        assertEquals(18.84 , WaterBill.calculateWaterBill(-1));
        assertEquals(33.492000000000004, WaterBill.calculateWaterBill(3.1));
    }
}