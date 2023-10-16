public class Notebook extends Product{
    private int storage;

    public Notebook(int idNo, double price, double rateOfDiscount, int amountOfStock, String productName, Brand brand, int screenSize, int ram, int storage) {
        super(idNo, price, rateOfDiscount, amountOfStock, productName, brand, screenSize, ram);
        this.storage = storage;
    }
}
