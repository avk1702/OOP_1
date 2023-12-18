package Java.OOP_1;

public class Main {
    public static void main(String[] args) {
        HotDrinkTemp hotDrink1 = new HotDrinkTemp("Espresso", 50, 80);
        HotDrinkTemp hotdrink2 = new HotDrinkTemp("Americano", 150, 75);
        HotDrinkTemp hotdrink3 = new HotDrinkTemp("Cappuccino", 200, 70);

        HotDrinkMachine hotDrinkMachine = new HotDrinkMachine();

        HotDrinkTemp product1 = hotDrinkMachine.getProduct("Espresso", 50, 80);
        HotDrinkTemp product2 = hotDrinkMachine.getProduct("Americano", 150, 75);
        HotDrinkTemp product3 = hotDrinkMachine.getProduct("Cappuccino", 200, 70);
        
        
  }

}
    

