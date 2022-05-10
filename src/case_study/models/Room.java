package case_study.models;

public class Room extends Facility {
    //    -	Riêng loại Room sẽ có thêm thông tin: Dịch vụ miễn phí đi kèm.
    private String freeService;

    public Room() {
    }

    public Room(String serviceId,String serviceName, Double usableArea, Integer taxExpenses, Integer maximumNumberOfPeople,
                String rentalType, String freeService) {
        super(serviceId,serviceName, usableArea, taxExpenses, maximumNumberOfPeople, rentalType);
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

        return "Room" +
                super.toString()+
                "freeService: " + freeService;
    }

    @Override
    public String wriderFacility() {
        return super.wriderFacility()+","+freeService;
    }
}
