public abstract class CoffeeDecorator implements Coffee{
    private final Coffee coffeeDecorator;

    public CoffeeDecorator(Coffee coffee) {
        this.coffeeDecorator = coffee;
    }

    @Override
    public double showPrice() {
        return coffeeDecorator.showPrice();
    }

    @Override
    public String showIngredients() {
        return coffeeDecorator.showIngredients();
    }

    public Coffee getCoffee() {
        return coffeeDecorator;
    }
}
