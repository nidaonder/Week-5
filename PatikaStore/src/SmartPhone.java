import java.util.ArrayList;
import java.util.List;

public class SmartPhone extends Product {
    private int memory;
    private int batteryPower;
    private String color;

    public SmartPhone(int idNo, double price, double rateOfDiscount, int amountOfStock, String productName,
                      String brand, double screenSize, int ram, int memory, int batteryPower, String color) {
        super(idNo, price, rateOfDiscount, amountOfStock, productName, brand, screenSize, ram);
        this.memory = memory;
        this.batteryPower = batteryPower;
        this.color = color;
    }

    public int getMemory(){
        return memory;
    }
    public void setMemory(int memory){
        this.memory = memory;
    }
    public int getBatteryPower(){
        return batteryPower;
    }
    public void setBatteryPower(int batteryPower){
        this.batteryPower = batteryPower;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

}
