import java.util.ArrayList;
import java.util.stream.Collectors;

public class SetItem extends Item {
    ArrayList<Item> items = new ArrayList<Item>();

    public String getName() {
        String itemNames = this.items.stream()
                .map(item -> item.name)
                .collect(Collectors.joining(","));

        return this.name + "(" + itemNames + ")";
    }
}
