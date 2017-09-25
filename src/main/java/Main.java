import java.util.ArrayList;
import java.util.List;

/**
 * @author Fathi Jemli
 */
public class Main {

    public static void main(String[] args) {
        Operator operator1 = new Operator("A");
        operator1.addPriceUnit(new PriceUnit("1", 0.9));
        operator1.addPriceUnit(new PriceUnit("268", 5.1));
        operator1.addPriceUnit(new PriceUnit("46", 0.17));
        operator1.addPriceUnit(new PriceUnit("4620", 0.0));
        operator1.addPriceUnit(new PriceUnit("468", 0.15));
        operator1.addPriceUnit(new PriceUnit("4631", 0.15));
        operator1.addPriceUnit(new PriceUnit("4673", 0.9));

        Operator operator2 = new Operator("B");
        operator2.addPriceUnit(new PriceUnit("1", 0.92));
        operator2.addPriceUnit(new PriceUnit("44", 0.5));
        operator2.addPriceUnit(new PriceUnit("46", 0.2));
        operator2.addPriceUnit(new PriceUnit("467", 1.0));
        operator2.addPriceUnit(new PriceUnit("467", 1.0));
        //operator2.addPriceUnit(new PriceUnit("467321", 3.0));
        operator2.addPriceUnit(new PriceUnit("48", 1.2));

        List<Operator> operators = new ArrayList<Operator>();
        operators.add(operator1);
        operators.add(operator2);
        System.out.println(Operator.bestPriceFromListOperators(operators, "+46-73-212345"));
    }
}
