public class CoffeeWithMilk extends CoffeeDecorator {

    public CoffeeWithMilk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double showPrice() {
        return super.showPrice() + 0.5;
    }

    @Override
    public String showIngredients() {
        return super.showIngredients() + ", milk";
    }
}
