package ss17_io_binary_file_and_serialization.bai_tap.common.writeAndRead;

import ss17_io_binary_file_and_serialization.bai_tap.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndRead {
    public static void writerFile(List<Product> list) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/ss17_io_binary_file_and_serialization/bai_tap/common/data/data.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static List<Product> readFile() {
        List<Product> products = new ArrayList<>();
        try {

            FileInputStream fileInputStream = new FileInputStream("src/ss17_io_binary_file_and_serialization/bai_tap/common/data/data.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }
}
