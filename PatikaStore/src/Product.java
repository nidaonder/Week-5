public class Product {
    private int idNo;
    private double price;
    private double rateOfDiscount;
    private int amountOfStock;
    private String productName;
    private Brand brand;
    private int screenSize;
    private int ram;

    public Product (int idNo, double price, double rateOfDiscount, int amountOfStock, String productName, Brand brand, int screenSize, int ram){
        this.idNo = idNo;
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

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
