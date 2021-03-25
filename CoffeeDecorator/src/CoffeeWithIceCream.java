public class CoffeeWithIceCream extends CoffeeDecorator {
    public CoffeeWithIceCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double showPrice() {
        return super.showPrice() + 3.0;
    }

    @Override
    public String showIngredients() {
        return super.showIngredients() + ", ice cream";
    }
}

