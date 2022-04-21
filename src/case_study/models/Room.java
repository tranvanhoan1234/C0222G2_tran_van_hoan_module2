package case_study.models;

public class Room extends Facility {
    //    -	Riêng loại Room sẽ có thêm thông tin: Dịch vụ miễn phí đi kèm.
    private String freeService;

    public Room() {
    }

    public Room(String serviceName, Double usableArea, Double taxExpenses, Double maximumNumberOfPeople,
                Double rentalType, String freeService) {
        super(serviceName, usableArea, taxExpenses, maximumNumberOfPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
