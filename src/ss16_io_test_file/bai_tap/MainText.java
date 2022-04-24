package ss16_io_test_file.bai_tap;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MainText {
    public static void main(String[] args) {
        CopyFileText copyFileText=new CopyFileText();
        List<CopyFileText>a=new CopyOnWriteArrayList<>();
        copyFileText.readFile(String.valueOf(a.add(copyFileText)));
    }
}
