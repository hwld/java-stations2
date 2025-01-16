import java.util.ArrayList;

public class Station1 {

    public static void main(String[] args) {
        // 自分で動作確認をするコードを書く場合はここに書きましょう

    }

    public static ArrayList<String> q1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Tech");
        list.add("Train");
        return list;
    }

    public static int q2(ArrayList<String> list, ArrayList<String> searchWords) {
        return (int) searchWords.stream().filter(list::contains).count();
    }
}
