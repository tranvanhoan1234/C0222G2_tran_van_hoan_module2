package case_study.services;

import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.utils.check_try_cacth.CheckException;
import case_study.utils.reader_writer.ReaderWriter;
import case_study.utils.regex.AddNewFacility;

import java.util.*;

public class FacilityServiceImpl implements IFacilityService {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static List<House> houseList = new LinkedList<>();
    private static List<Villa> villaList = new LinkedList<>();
    private static List<Room> roomList = new LinkedList<>();
    private static List<Facility> facilityList = new ArrayList<>();


    static {
        House house = new House("SVHO-1234", "house", 5.00, 10000, 100, "theo tháng", "vip", 10);
        Villa villa = new Villa("SVVL-1234", "villa", 10.000, 20000, 1000, "năm", "sida", 100.0, 12);
        Room room = new Room("SVRO-1234", "room", 20.0000, 30000, 1300, "ngày", "vocher giảm giá");
        facilityIntegerMap.put(house, 3);
        facilityIntegerMap.put(villa, 1);
        facilityIntegerMap.put(room, 1);

    }




    @Override
    public void facilityMaintenance(Facility facility) {
        if (facilityIntegerMap.get(facility) >= 4) {
            System.out.println("Service is under maintenance!");
            facilityList.add(facility);
            facilityIntegerMap.put(facility, 1);
        }
    }

    @Override
    public void displayMaintenance() {


        if(!facilityList.isEmpty()){
            for (Facility f: facilityList ) {
                System.out.println(f);
            }
        }else{
            System.out.println("danh sach rong");
        }

    }

    @Override
    public void addMaintenance(Facility facility) {
        Set<Facility> facilityKey = facilityIntegerMap.keySet();

        if (facilityIntegerMap.isEmpty()) {
            facilityIntegerMap.put(facility, 1);
        } else {
            boolean flag = true;
            for (Facility key : facilityKey) {
                if (facility.equals(key)) {
                    facilityMaintenance(facility);
                    facilityIntegerMap.put(key, facilityIntegerMap.get(key) + 1);
                    flag = false;
                    break;
                }
            }
            if (flag) {
                facilityIntegerMap.put(facility, 1);
            }
        }
    }

    @Override
    public void display() {
        houseList=ReaderWriter.readFileHose();
        villaList=ReaderWriter.readFileVilla();
        roomList=ReaderWriter.readFileRoom();
        for (House house:houseList) {
            System.out.println(house);
        }
        for (Villa villa:villaList) {
            System.out.println(villa);
        }
        for (Room room:roomList) {
            System.out.println(room);
        }
//        for (Map.Entry<Facility,Integer>entry:facilityIntegerMap.entrySet()) {
//            System.out.println("tên dịch vụ: " + entry.getKey().getServiceId());
//            System.out.println("số lần: " + entry.getValue());
//        }

    }
    @Override
    public void addNewVilla() {
        villaList=ReaderWriter.readFileVilla();
        System.out.print("nhập mã dịch vụ nhập  theo định dạng SVVL-4 SỐ: ");
        String serviceId = scanner.nextLine();
        while (!AddNewFacility.villaRegex(serviceId)) {
            System.out.print("nhập không đúng xin nhập lại: ");
            serviceId = scanner.nextLine();
        }
        System.out.println("nhập tên dịch vụ viết hoa chữ cái đầu: ");
        String serviceName = scanner.nextLine();
        while (!AddNewFacility.nameRegex(serviceName)) {
            System.out.print("nhập k đúng xin nhập lại");
            serviceName = scanner.nextLine();
        }
        System.out.print("nhập diện  tích sử dụng lớn 30m2 (.): ");
        Double usableArea = CheckException.checkExForParseDouble();
        while (!AddNewFacility.usableAreaRegex(String.valueOf(usableArea))) {
            System.out.println("nhập sai xin mời nhập lại : ");
            usableArea = Double.valueOf(scanner.nextLine());

        }
        System.out.print("nhập chi phi thuê phải là số nguyên dương: ");
        Integer rentalCosts = Integer.valueOf(scanner.nextLine());
        while (!AddNewFacility.numberOfFoloorsRegex(String.valueOf(rentalCosts))) {
            System.out.println("nhập sai xin mời nhập lại: ");
            rentalCosts= Integer.valueOf(scanner.nextLine());
        }
        System.out.print("nhập số người tối đa 20<: ");
        Integer maximumNumberOfPeople = Integer.valueOf(scanner.nextLine());
        while (!AddNewFacility.maxImumNumberOfPeopleRegex(String.valueOf(maximumNumberOfPeople))){
            System.out.println("nhập sai xin mời nhập lại: ");
            maximumNumberOfPeople= Integer.valueOf(scanner.nextLine());
        }
        System.out.print("nhập kiểu muốn thuê : ");
            String rentalType = scanner.nextLine();
        while (!AddNewFacility.nameRegex(rentalType)) {
            System.out.print("nhập k đúng xin nhập lại");
            rentalType = scanner.nextLine();
        }
        System.out.print("nhập tiêu chuẩn phòng: ");
        String roomStandard = scanner.nextLine();
        while (!AddNewFacility.nameRegex(roomStandard)) {
            System.out.print("nhập k đúng xin nhập lại");
            roomStandard = scanner.nextLine();
        }
        System.out.print("nhập diện tích hồ bơi: ");
        Double poolArea = Double.valueOf(scanner.nextLine());
        while (!AddNewFacility.usableAreaRegex(String.valueOf(poolArea))) {
            System.out.println("nhập sai xin mời nhập lại : ");
            poolArea = Double.valueOf(scanner.nextLine());

        }
        System.out.print("nhập số tầng");
        Integer numberOfFloors = Integer.valueOf(scanner.nextLine());
        while (!AddNewFacility.numberOfFoloorsRegex(String.valueOf(numberOfFloors))) {
            System.out.println("nhập sai xin mời nhập lại: ");
            numberOfFloors= Integer.valueOf(scanner.nextLine());
        }
        Villa villa = new Villa(serviceId, serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType,
                roomStandard, poolArea, numberOfFloors);
        addMaintenance(villa);
        villaList.add(villa);
        ReaderWriter.writeVilla(villaList);

    }//    -	Riêng loại House sẽ có thêm thông tin: Tiêu chuẩn phòng, Số tầng.
//    private String roomStandard;
//    private Integer numberOfFloors;

    @Override
    public void addNewHouse() {
        houseList=ReaderWriter.readFileHose();
        System.out.print("nhập mã dịch vụ theo định dạng SVHO-4so: ");
        String serviceId = scanner.nextLine();
        while (!AddNewFacility.hoseRegex(serviceId)) {
            System.out.println("nhập không đúng xin nhập lại");
            serviceId = scanner.nextLine();
        }
        System.out.print("nhập tên dịch vụ vieets hoa chuwx cai đầu : ");
        String serviceName = scanner.nextLine();
        while (!AddNewFacility.nameRegex(serviceName)) {
            System.out.print("nhập k đúng xin nhập lại");
            serviceName = scanner.nextLine();
        }
        System.out.print("nhập diện  tích sử dụng: ");
        Double usableArea = Double.valueOf(scanner.nextLine());
        while (!AddNewFacility.usableAreaRegex(String.valueOf(usableArea))) {
            System.out.println("nhập sai xin mời nhập lại : ");
            usableArea = Double.valueOf(scanner.nextLine());

        }
        System.out.print("nhập chi phi thuê: ");
        Integer rentalCosts = Integer.valueOf(scanner.nextLine());
        while (!AddNewFacility.numberOfFoloorsRegex( String.valueOf(rentalCosts))) {
            System.out.println("nhập sai xin mời nhập lại: ");
            rentalCosts= Integer.valueOf(scanner.nextLine());
        }
        System.out.print("nhập số người tối đa: ");
        Integer maximumNumberOfPeople = Integer.valueOf(scanner.nextLine());
        while (!AddNewFacility.maxImumNumberOfPeopleRegex(String.valueOf(maximumNumberOfPeople))){
            System.out.println("nhập sai xin mời nhập lại: ");
            maximumNumberOfPeople= Integer.valueOf(scanner.nextLine());
        }
        System.out.print("nhập kiểu muốn thuê: ");
        String rentalType = scanner.nextLine();
        while (!AddNewFacility.nameRegex(rentalType)) {
            System.out.print("nhập k đúng xin nhập lại");
            rentalType = scanner.nextLine();
        }
        System.out.print("nhập tiêu chuẩn phòng: ");
        String roomStandard = scanner.nextLine();
        while (!AddNewFacility.nameRegex(roomStandard)) {
            System.out.print("nhập k đúng xin nhập lại");
            roomStandard = scanner.nextLine();
        }
        System.out.print("nhập số tầng: ");
        Integer numberOfFloors = Integer.valueOf(scanner.nextLine());
        while (!AddNewFacility.numberOfFoloorsRegex(String.valueOf(numberOfFloors))) {
            System.out.println("nhập sai xin mời nhập lại: ");
            numberOfFloors= Integer.valueOf(scanner.nextLine());
        }
        House house = new House(serviceId, serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType, roomStandard, numberOfFloors);
        addMaintenance(house);
        houseList.add(house);
        ReaderWriter.writeHouse(houseList);
    }

    @Override
    public void addNewRoom() {
        roomList=ReaderWriter.readFileRoom();
        System.out.print("nhập mã dịch vụ theo định dạng SVRO-4 SỐ : ");
        String serviceId = scanner.nextLine();
        while (!AddNewFacility.roomRegex(serviceId)) {
            System.out.println("nhập sai xin mời bạn nhập lại: ");
            serviceId = scanner.nextLine();
        }
        System.out.println("nhập tên dịch vụ theo định dạng viết hoa chữ cái đầu : ");
        String serviceName = scanner.nextLine();
        while (!AddNewFacility.nameRegex(serviceName)) {
            System.out.println("nhập không đúng xin nhập lại: ");
            serviceName=scanner.nextLine();
        }
        System.out.print("nhập diện  tích sử dụng 30>: ");
        Double usableArea = Double.valueOf(scanner.nextLine());


        while (!AddNewFacility.usableAreaRegex(String.valueOf(usableArea))) {
            System.out.println("nhập sai xin mời nhập lại : ");
            usableArea = Double.valueOf(scanner.nextLine());

        }
        System.out.print("nhập chi phi thuê: ");
        Integer rentalCosts = Integer.valueOf(scanner.nextLine());
        while (!AddNewFacility.numberOfFoloorsRegex(String.valueOf(rentalCosts))) {
            System.out.println("nhập sai xin mời nhập lại: ");
            rentalCosts= Integer.valueOf(scanner.nextLine());
        }
        System.out.print("nhập số người tối đa: ");
        Integer maximumNumberOfPeople = Integer.valueOf(scanner.nextLine());
        while (!AddNewFacility.maxImumNumberOfPeopleRegex(String.valueOf(maximumNumberOfPeople))){
            System.out.println("nhập sai xin mời nhập lại: ");
            maximumNumberOfPeople= Integer.valueOf(scanner.nextLine());
        }
        System.out.print("nhập kiểu muốn thuê: ");
        String rentalType = scanner.nextLine();
        while (!AddNewFacility.nameRegex(rentalType)) {
            System.out.print("nhập k đúng xin nhập lại");
            rentalType = scanner.nextLine();
        }
        System.out.print("nhập dịch vụ đi kèm: ");
        String freeService = scanner.nextLine();
        while (!AddNewFacility.nameRegex(freeService)) {
            System.out.println("nhập không đúng xin nhập lại: ");
            freeService=scanner.nextLine();
        }
        Room room = new Room(serviceId, serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType, freeService);
        roomList.add(room);
        addMaintenance(room);
        ReaderWriter.writeRoom(roomList);
    }
}


