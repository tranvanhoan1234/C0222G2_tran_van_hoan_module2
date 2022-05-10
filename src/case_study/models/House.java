package case_study.models;

public class House extends Facility {
    //    -	Riêng loại House sẽ có thêm thông tin: Tiêu chuẩn phòng, Số tầng.
    private String roomStandard;
    private Integer numberOfFloors;

    public House() {
    }

    public House(String serviceId, String serviceName, Double usableArea, Integer taxExpenses, Integer maximumNumberOfPeople,
                 String rentalType, String roomStandard, Integer numberOfFloors) {
        super(serviceId, serviceName, usableArea, taxExpenses, maximumNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House" +"serviceId: "+getServiceId()+
                " serviceName: " + super.getServiceName() +
                ", usableArea: " +super.getUsableArea() +
                ", taxExpenses: " + super.getRentalCosts()+
                ", maximumNumberOfPeople: " + super.getMaximumNumberOfPeople()+
                ", rentalType: " + super.getRentalType()+
                "roomStandard: '" + roomStandard +
                ", numberOfFloors: " + numberOfFloors;
    }

    @Override
    public String wriderFacility() {
        return super.wriderFacility()+","+roomStandard+","+numberOfFloors;
    }
}
