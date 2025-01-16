import java.util.ArrayList;
import java.util.List;

public class Station10 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(123, 456, 89012, 345678, 9012345, 67));
        Station10.q1(list);
    }

    public static void q1(ArrayList<Integer> list) {
        int maxDigit = 0;
        for (Integer i : list) {
            int digit = String.format("%,d", i).length();
            if (digit > maxDigit) {
                maxDigit = digit;
            }
        }

        for (Integer i : list) {
            System.out.println(String.format("%," + maxDigit + "d", i));
        }
    }
}
