/**
 * @author Fathi Jemli
 */
class PriceUnit {
    private String prefix;
    private double price;

    public PriceUnit() {
    }

    public PriceUnit(String prefix, double price) {
        this.prefix = prefix;
        this.price = price;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
