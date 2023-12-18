package Java.OOP_1;

public class HotDrinkMachine implements VendingMachine {
    @Override

    public void getProduct() {

    }

    public HotDrinkTemp getProduct(String name, int volume, int temp) {
        return new HotDrinkTemp(name, volume, temp);
    }
    
}
