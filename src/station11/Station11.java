import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Station11 {

    public static void q1(Path inputFile, Path outputFile) {
        String inputText = "";
        try {
            inputText = Files.readString(inputFile);
        } catch (IOException e) {
            System.out.println("inputFileの読み込みに失敗しました");
            return;
        }

        int outputValue = Integer.parseInt(inputText) * 2;

        try {
            Files.writeString(outputFile, Integer.toString(outputValue));
        } catch (IOException e) {
            System.out.println("outputFileの書き込みに失敗しました");
        }
    }
}
