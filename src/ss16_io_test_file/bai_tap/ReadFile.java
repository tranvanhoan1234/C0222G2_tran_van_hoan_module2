package ss16_io_test_file.bai_tap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public final static String PATH_NAME = "src/ss16_io_test_file/bai_tap/country.csv";

    public static void main(String[] args) {
        List<Country> list = new ArrayList<>();
        BufferedReader br = null;
        try {
            String[] listLine;
            String line;
            br = new BufferedReader(new FileReader(PATH_NAME));

            while ((line = br.readLine()) != null) {
                listLine = line.split(",");
                list.add(new Country(Integer.parseInt(listLine[0]), Integer.parseInt(listLine[1]), listLine[2]));
            }
            for (Country s:list) {
                System.out.println(s);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

//    public static void gii() {
//        try {
//            List<Country> list = new ArrayList<>();
//            list.add(new Country(1,01,"hoàn"));
//            FileWriter filer = new FileWriter(PATH_NAME);
//            BufferedWriter bw = new BufferedWriter(filer);
//            for (Country s : list) {
//                bw.write(s.toString());
//                filer.close();
//                bw.close();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }

//
//    public static List<String> parseCsvLine(String csvLine) {
//
//        List<String> result = new ArrayList<>();
//        if (csvLine != null) {
//            String[] splitData = csvLine.split(",");
//            for (int i = 0; i < splitData.length; i++) {
//                result.add(splitData[i]);
//            }
//        }
//        return result;
//    }

//    private static void printCountry(List<String> country) {
//        System.out.println(
//                "Country [id= "
//                        + country.get(0)
//                        + ", code= " + country.get(1)
//                        + " , name=" + country.get(2)
//                        + "]");
//    }
}
