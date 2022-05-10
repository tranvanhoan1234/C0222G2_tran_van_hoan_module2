package case_study.utils.reader_writer;

import case_study.models.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderWriter {

    private final static String PATH_CUSTOMER = "src/case_study/utils/data/customer.csv";
    private final static String PATH_EMPLOYEE = "src/case_study/utils/data/employee.csv";
    private final static String PATH_VILLA = "src/case_study/utils/data/fileVilla.csv";
    private final static String PATH_HOUSE = "src/case_study/utils/data/house.csv";
    private final static String PATH_ROOM = "src/case_study/utils/data/room.csv";
    private final static String COMMA = ",";


    public static void writeCustumer(List<Customer> list) {
        File file = new File(PATH_CUSTOMER);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer custumer : list) {
                bufferedWriter.write(custumer.wriderPerson());
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeEmployee(List<Employee> listemployee) {
        File file = new File(PATH_EMPLOYEE);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee : listemployee) {
                bufferedWriter.write(employee.wriderPerson());
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeVilla(List<Villa> villaList) {

        File file = new File(PATH_VILLA);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Villa villa : villaList) {
                bufferedWriter.write(villa.wriderFacility());
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeHouse(List<House> listHouse) {

        File file = new File(PATH_HOUSE);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (House house : listHouse) {
                bufferedWriter.write(house.wriderFacility());
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeRoom(List<Room> listRoom) {
        File file = new File(PATH_ROOM);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Room room : listRoom) {
                bufferedWriter.write(room.wriderFacility());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   public static List<String> readFileCsvToListStrinng(String pathFile) {
            List<String> stringList = new ArrayList<>();
            File file = new File(pathFile);
            FileReader fileReader = null;
            BufferedReader bufferedReader = null;
            try {
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line = null;
                while ((line = bufferedReader.readLine()) != null) {
                    stringList.add(line);
                }
                bufferedReader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return stringList;
        }
        public static List<Employee> readFileemploye() {
            List<String> stringList = readFileCsvToListStrinng(PATH_EMPLOYEE);
            List<Employee> employeeList = new ArrayList<>();
            String[] array = null;
            Employee employee = null;
            // chuyển listSTring => líitStudent
            for (String str: stringList) {
                array = str.split(",");
                 employee = new Employee( array[0],array[1],array[2],Integer.parseInt(array[3]),Long.parseLong(array[4]),array[5],Integer.parseInt(array[6]),array[7],Double.parseDouble(array[8]));
                employeeList.add(employee);
            }
            return employeeList;
    }
    public static List<Customer> readFileCustomer() {
        List<String> stringList = readFileCsvToListStrinng(PATH_CUSTOMER);
        List<Customer> customerList = new ArrayList<>();
        String[] array = null;
        Customer customer = null;
        // chuyển listSTring => líitStudent
        for (String str: stringList) {
            array = str.split(",");
            customer = new Customer( array[0],array[1],array[2],Integer.parseInt(array[3]),Long.parseLong(array[4]),array[5],Integer.parseInt(array[6]),array[7],array[8]);
            customerList.add(customer);
        }
        return customerList;
    }
    public static List<Room> readFileRoom() {
        List<String> stringList = readFileCsvToListStrinng(PATH_ROOM);
        List<Room> rooms = new ArrayList<>();
        String[] array = null;
        Room room = null;
        // chuyển listSTring => líitStudent
        for (String str: stringList) {
            array = str.split(",");
            room = new Room(array[0],array[1],Double.parseDouble(array[2]),Integer.parseInt(array[3]),Integer.parseInt(array[4]),array[5],array[6]);
            rooms.add(room);
        }
        return rooms;
    }
    public static List<House> readFileHose() {
        List<String> stringList = readFileCsvToListStrinng(PATH_HOUSE);
        List<House> houseList = new ArrayList<>();
        String[] array = null;
        House house = null;
        // chuyển listSTring => líitStudent
        for (String str: stringList) {
            array = str.split(",");
            house = new House(array[0],array[1],Double.parseDouble(array[2]),Integer.parseInt(array[3]),Integer.parseInt(array[4]),array[5],array[6],Integer.parseInt(array[7]));
            houseList.add(house);
        }
        return houseList;
    }
    public static List<Villa> readFileVilla() {
        List<String> stringList = readFileCsvToListStrinng(PATH_VILLA);
        List<Villa> villaList = new ArrayList<>();
        String[] array = null;
        Villa villa = null;
        // chuyển listSTring => líitStudent
        for (String str: stringList) {
            array = str.split(",");
            villa = new Villa(array[0],array[1],Double.parseDouble(array[2]),Integer.parseInt(array[3]),Integer.parseInt(array[4]),array[5],array[6], Double.parseDouble(array[7]),Integer.parseInt(array[8]));
            villaList.add(villa);
        }
        return villaList;
    }
}
