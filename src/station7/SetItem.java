import java.util.ArrayList;
import java.util.stream.Collectors;

public class SetItem implements Item {
    public String name = null;
    ArrayList<SingleItem> items = new ArrayList<>();

    @Override
    public String getName() {
        String itemsName = items.stream().map(item -> item.name).collect(Collectors.joining(","));

        return this.name + "(" + itemsName + ")";
    }
}
