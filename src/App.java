public class App {
    public static void main(String[] args) throws Exception {
        AverageCalculator average = new AverageCalculator();
        ProductCalculator products = new ProductCalculator();
        SquareAreaCalculator square = new SquareAreaCalculator();
        PriceCalculator price = new PriceCalculator();
        DiscountCalculator priceAndDiscount = new DiscountCalculator();
        InvertValues values = new InvertValues();
        SellsCalculator sells = new SellsCalculator();

        average.getGrades();
        average.calculate();

        products.getNumbers();
        products.calculate();

        square.getSquareSide();
        square.calculate();

        price.getPrice();
        price.calculate();

        priceAndDiscount.getPriceAndDiscount();
        priceAndDiscount.calculate();

        values.getValues();
        values.invert();

        sells.getAmounts();
        sells.calculate();
    }
}
