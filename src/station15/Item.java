public class Item {
    private int id;
    private String name;
    private int stock;

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getStock() {
        return this.stock;
    }

    public void updateStock(int newStock) {
        this.stock = newStock;
    }
}
