import com.jemli.Utils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Fathi Jemli
 */
public class UtilsTest {
    @Test
    public void testStringSimilarityCoefficient() throws Exception {
        assertEquals(Utils.stringSimilarityCoefficient("abcdefgh", "abcde"), 5);
        assertEquals(Utils.stringSimilarityCoefficient("12345678", ""), 0);
        assertEquals(Utils.stringSimilarityCoefficient("12345678", "98765"), 0);
    }

    public void testCleanNumber() throws Exception {
        assert (Utils.cleanNumber("+46-73-212345").equals("4673212345"));
    }

}