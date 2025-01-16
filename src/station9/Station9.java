import java.util.ArrayList;
import java.util.Random;

public class Station9 {

    public static String printOrder(ArrayList<Item> itemList, Random random) {
        StringBuilder stringBuilder = new StringBuilder();

        int total = 0;
        for (Item item : itemList) {
            stringBuilder.append(item.name).append(" ").append(item.price).append("円\n");

            total += item.price;
        }
        stringBuilder.append("合計").append(" ").append(total).append("円\n");

        int randomValue = random.nextInt(100);
        if (randomValue % 50 == 0) {
            stringBuilder.append("1等: 全額キャッシュバック");
        } else if (randomValue % 10 == 0) {
            stringBuilder.append("2等: 10%キャッシュバック");
        }

        return stringBuilder.toString();
    }
}
