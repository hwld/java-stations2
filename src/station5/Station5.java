public class Station5 {
    public static void main(String[] args) {
        try {
            process();
        } catch (Exception e) {
            System.out.println("エラーが発生しました");
        }
        System.out.println("処理が完了しました");
    }

    public static void process() {
        throw new RuntimeException();
    }
}
