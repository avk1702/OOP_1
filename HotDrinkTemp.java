package Java.OOP_1;

public class HotDrinkTemp extends HotDrink {
    private int temp;

    public HotDrinkTemp(String name, int volume, int temp) {
        super(name, volume);
        this.temp = temp;
    }

    public int getTemp(){
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
    
}
