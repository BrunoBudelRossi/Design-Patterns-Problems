public class Main {
    public static void showCoffeeInfo(Coffee c) {
        System.out.println("Price: " + c.showPrice() + ", Ingredient: " + c.showIngredients());
    }

    public static void main(String[] args) {
        Coffee c = new SimpleCoffee();
        showCoffeeInfo(c);

        c = new CoffeeWithMilk(c);
        showCoffeeInfo(c);

        c = new SimpleCoffee();
        c = new CoffeeWithIceCream(c);
        showCoffeeInfo(c);
    }

}

