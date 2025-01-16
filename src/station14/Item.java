public class Item {
    final private int id;
    final private String name;
    final private int stock;

    public Item(final int id, final String name, final int stock) {
        this.id = id;
        this.name = name;
        this.stock = stock;
    }

    final String getDisplayText() {
        final String stockInfo = stock > 0 ? "In stock" : "Out of stock";
        return name + " (" + stockInfo + ")";
    }
}
