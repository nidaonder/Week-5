public class Product {
    private int idNo;
    private double price;
    private double rateOfDiscount;
    private int amountOfStock;
    private String productName;
    private String brand;
    private double screenSize;
    private int ram;

    public Product (int idNo, double price, double rateOfDiscount, int amountOfStock, String productName, String brand, double screenSize, int ram){
        this.idNo = idNo;
        this.price = price;
        this.rateOfDiscount = rateOfDiscount;
        this.amountOfStock = amountOfStock;
        this.productName = productName;
        this.brand = brand;
        this.screenSize = screenSize;
        this.ram = ram;
    }


    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }

    public double getRateOfDiscount() {
        return rateOfDiscount;
    }

    public void setRateOfDiscount(double rateOfDiscount) {
        this.rateOfDiscount = rateOfDiscount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmountOfStock() {
        return amountOfStock;
    }

    public void setAmountOfStock(int amountOfStock) {
        this.amountOfStock = amountOfStock;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
