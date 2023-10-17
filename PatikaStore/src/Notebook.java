public class Notebook extends Product{
    private int storage;

    public Notebook(int idNo, double price, double rateOfDiscount, int amountOfStock, String productName,
                    String brand, double screenSize, int ram, int storage) {
        super(idNo, price, rateOfDiscount, amountOfStock, productName, brand, screenSize, ram);
        this.storage = storage;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}
