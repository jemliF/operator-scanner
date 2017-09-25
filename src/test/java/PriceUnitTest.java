import com.jemli.PriceUnit;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * @author Fathi Jemli
 */
public class PriceUnitTest {
    @Test
    public void testGetPrefix() throws Exception {
        PriceUnit priceUnit = new PriceUnit();
        priceUnit.setPrefix("prefix");
        String prefix = priceUnit.getPrefix();
        assert (prefix.equals("prefix"));
    }

    public void testSetPrefix() throws Exception {
        PriceUnit priceUnit = new PriceUnit();
        priceUnit.setPrefix("prefix");
        String prefix = priceUnit.getPrefix();
        assert (prefix.equals("prefix"));
    }

    public void testGetPrice() throws Exception {
        PriceUnit priceUnit = new PriceUnit();
        priceUnit.setPrice(1.0);
        double price = priceUnit.getPrice();
        assertEquals(price, 1.0);
    }

    public void testSetPrice() throws Exception {
        PriceUnit priceUnit = new PriceUnit();
        priceUnit.setPrice(1.0);
        double price = priceUnit.getPrice();
        assertEquals(price, 1.0);
    }

}