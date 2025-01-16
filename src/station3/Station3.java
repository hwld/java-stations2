public class Station3 {

    public static void main(String[] args) {
        // 自分で動作確認をするコードを書く場合はここに書きましょう

    }

    public static boolean checkEmailAddress(String email) {
        return email != null && !email.isEmpty() && email.contains("@");
    }

    public static void q2(User user) {
        if (user.name == null) {
            user.name = "未設定";
        }
    }
}
