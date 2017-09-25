import java.util.ArrayList;
import java.util.List;

/**
 * @author Fathi Jemli
 */
class Operator {
    private String name;
    private List<PriceUnit> pricing = new ArrayList();

    /**
     * This method returns the best price unit provided by the current operator (pricing) for a specific number
     *
     * @param number
     * @return PriceUnit
     */
    public PriceUnit bestPriceUnitFromOperator(String number) {
        double price = Double.MAX_VALUE;
        int similarity = 0, sim = 0;
        PriceUnit bestPriceUnit = new PriceUnit();
        String cleanNumber = Utils.cleanNumber(number);
        for (PriceUnit priceUnit : this.getPricing()) {
            sim = Utils.stringSimilarityCoefficient(cleanNumber, priceUnit.getPrefix());
            price = priceUnit.getPrice();
            if (sim > similarity) {
                similarity = sim;
                bestPriceUnit = priceUnit;
            } else {
                if (sim == similarity && similarity > 0 && price < bestPriceUnit.getPrice()) {
                    bestPriceUnit = priceUnit;
                }
            }
        }
        return bestPriceUnit;
    }

    /**
     * This method indicates the best operator for a given phone number out of a list of operators
     *
     * @param operators
     * @param number
     * @return string
     */
    public static String bestPriceFromListOperators(List<Operator> operators, String number) {
        int similarity = 0, sim = 0, bestOperatorIndex = Integer.MAX_VALUE, i = 0;
        PriceUnit bestPriceUnit = new PriceUnit(), priceUnit = new PriceUnit();
        String cleanNumber = Utils.cleanNumber(number);
        for (Operator operator : operators) {
            i++;
            priceUnit = operator.bestPriceUnitFromOperator(number);
            sim = Utils.stringSimilarityCoefficient(cleanNumber, priceUnit.getPrefix());
            if (sim > similarity) {
                bestPriceUnit = priceUnit;
                bestOperatorIndex = i;
                similarity = sim;
            } else {
                if (sim == similarity && similarity > 0 && priceUnit.getPrice() < bestPriceUnit.getPrice()) {
                    bestPriceUnit = priceUnit;
                    bestOperatorIndex = i;
                }
            }
        }
        return "The best operator for number: " + number + " is operator N°: " + bestOperatorIndex;
    }

    public Operator() {
    }

    public Operator(String name) {
        this.name = name;
    }

    public Operator(String name, List<PriceUnit> pricing) {
        this.name = name;
        this.pricing = pricing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PriceUnit> getPricing() {
        return pricing;
    }

    public void setPricing(List<PriceUnit> pricing) {
        this.pricing = pricing;
    }

    public void addPriceUnit(PriceUnit priceUnit) {
        this.pricing.add(priceUnit);
    }
}
