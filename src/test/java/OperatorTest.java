import com.jemli.Operator;
import com.jemli.PriceUnit;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * @author Fathi Jemli
 */
public class OperatorTest {
    @Test
    public void testBestPriceUnitFromOperator() throws Exception {
        Operator operator1 = new Operator("A");
        operator1.addPriceUnit(new PriceUnit("1", 0.9));
        operator1.addPriceUnit(new PriceUnit("268", 5.1));
        operator1.addPriceUnit(new PriceUnit("46", 0.17));
        operator1.addPriceUnit(new PriceUnit("4620", 0.0));
        operator1.addPriceUnit(new PriceUnit("468", 0.15));
        operator1.addPriceUnit(new PriceUnit("4631", 0.15));
        operator1.addPriceUnit(new PriceUnit("4673", 0.9));
        operator1.addPriceUnit(new PriceUnit("46732", 1.1));

        PriceUnit priceUnit = operator1.bestPriceUnitFromOperator("+46-73-212345");
        assert (priceUnit.getPrefix().equals("46732"));
        assertEquals(priceUnit.getPrice(), 1.1);
    }

    public void testBestPriceFromListOperators() throws Exception {
        Operator operator1 = new Operator("A");
        operator1.addPriceUnit(new PriceUnit("1", 0.9));
        operator1.addPriceUnit(new PriceUnit("268", 5.1));
        operator1.addPriceUnit(new PriceUnit("46", 0.17));
        operator1.addPriceUnit(new PriceUnit("4620", 0.0));
        operator1.addPriceUnit(new PriceUnit("468", 0.15));
        operator1.addPriceUnit(new PriceUnit("4631", 0.15));
        operator1.addPriceUnit(new PriceUnit("4673", 0.9));
        operator1.addPriceUnit(new PriceUnit("46732", 1.1));

        Operator operator2 = new Operator("B");
        operator2.addPriceUnit(new PriceUnit("1", 0.92));
        operator2.addPriceUnit(new PriceUnit("44", 0.5));
        operator2.addPriceUnit(new PriceUnit("46", 0.2));
        operator2.addPriceUnit(new PriceUnit("467", 1.0));
        operator2.addPriceUnit(new PriceUnit("48", 1.2));
        operator2.addPriceUnit(new PriceUnit("48", 1.2));

        List<Operator> operators = new ArrayList<Operator>();
        operators.add(operator1);
        operators.add(operator2);

        assert (Operator.bestPriceFromListOperators(operators, "+46-73-212345")
                .equals("The best operator for number: +46-73-212345 is operator N°: 2 (price: 1.0)"));
    }

    public void testGetName() throws Exception {
        Operator operator = new Operator();
        operator.setName("operatorA");
        String prefix = operator.getName();
        assert (prefix.equals("operatorA"));
    }

    public void testSetName() throws Exception {
        Operator operator = new Operator();
        operator.setName("operatorA");
        String prefix = operator.getName();
        assert (prefix.equals("operatorA"));
    }

    public void testGetPricing() throws Exception {
        Operator operator = new Operator();
        List<PriceUnit> pricing = new ArrayList<PriceUnit>();
        pricing.add(new PriceUnit("prefix", 1.0));
        operator.setPricing(pricing);
        assertEquals(operator.getPricing(), pricing);
    }

    public void testSetPricing() throws Exception {
        Operator operator = new Operator();
        List<PriceUnit> pricing = new ArrayList<PriceUnit>();
        pricing.add(new PriceUnit("prefix", 1.0));
        operator.setPricing(pricing);
        assertEquals(operator.getPricing(), pricing);
    }

    public void testAddPriceUnit() throws Exception {
        Operator operator = new Operator();
        List<PriceUnit> pricing = new ArrayList<PriceUnit>();
        pricing.add(new PriceUnit("prefix", 1.0));
        operator.setPricing(pricing);
        operator.addPriceUnit(new PriceUnit("prefix001", 2.0));
        assertEquals(operator.getPricing().get(operator.getPricing().size() - 1).getPrice(), 2.0);
        assert (operator.getPricing().get(operator.getPricing().size() - 1).getPrefix().equals("prefix001"));
    }

}