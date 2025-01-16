import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Station8 {

    public static void main(String[] args) {
        // 自分で動作確認をするコードを書く場合はここに書きましょう

    }

    public static HashSet<String> aggregateUserId(ArrayList<Order> orders) {
        HashSet<String> userIdSet = new HashSet<>();

        for (Order order : orders) {
            userIdSet.add(order.userId);
        }

        return userIdSet;
    }

    public static HashMap<String, Integer> aggregateUserAndTotalPrice(ArrayList<Order> orders) {
        HashMap<String, Integer> userAndTotalPrices = new HashMap<>();

        for (Order order : orders) {
            Integer subtotalPrice = userAndTotalPrices.get(order.userId);

            if (subtotalPrice == null) {
                userAndTotalPrices.put(order.userId, order.totalPrice);
            } else {
                userAndTotalPrices.put(order.userId, subtotalPrice + order.totalPrice);
            }
        }

        return userAndTotalPrices;
    }
}
