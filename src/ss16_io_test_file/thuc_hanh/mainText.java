package ss16_io_test_file.thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class mainText {
    public void writeToFile(List<Sos> sA) {

        try {
            FileWriter fileWriter = new FileWriter("luanchodien.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Sos o : sA) {
                bufferedWriter.write(o.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
//        khởi tao txt
        Sos s = new Sos("laun chó điên", "phuog chó điên", "tài chó điên");
        Sos b = new Sos("laun chó", "phuog  điên", "tài chó ");
        Sos c = new Sos("laun ", "phuog chó điên", "tài  điên");
        Sos d = new Sos("laun  điên", " chó điên", " chó điên");
        List<Sos> sA = new ArrayList<>();
        sA.add(s);
        sA.add(b);
        sA.add(c);
        sA.add(d);

        try {
            FileReader fileWriter = new FileReader("D:\\C0222G2-tranvanhoan\\module2\\luanchodien.txt");
            BufferedReader bufferedWriter = new BufferedReader(fileWriter);
            String line="";
            while (true){
                line=bufferedWriter.readLine();
                if ( (line == null)){
                    break;

                }   System.out.println(line);

            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
