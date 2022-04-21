package case_study.models;

public class House extends Facility {
    //    -	Riêng loại House sẽ có thêm thông tin: Tiêu chuẩn phòng, Số tầng.
    private String roomStandard;
    private Integer numberOfFloors;

    public House() {
    }

    public House(String serviceName, Double usableArea, Double taxExpenses, Double maximumNumberOfPeople,
                 Double rentalType, String roomStandard, Integer numberOfFloors) {
        super(serviceName, usableArea, taxExpenses, maximumNumberOfPeople, rentalType);
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
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
