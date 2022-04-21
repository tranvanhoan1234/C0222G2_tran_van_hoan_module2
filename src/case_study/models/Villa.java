package case_study.models;

public class Villa extends Facility {
//    -	Riêng loại Villa sẽ có thêm thông tin: Tiêu chuẩn phòng, Diện tích hồ bơi, Số tầng.

    private String soomStandard;
    private Double poolArea;
    private Integer numberOfFloors;

    public Villa() {
    }

    public Villa(String serviceName, Double usableArea, Double taxExpenses, Double maximumNumberOfPeople, Double rentalType, String soomStandard, Double poolArea, Integer numberOfFloors) {
        super(serviceName, usableArea, taxExpenses, maximumNumberOfPeople, rentalType);
        this.soomStandard = soomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getSoomStandard() {
        return soomStandard;
    }

    public void setSoomStandard(String soomStandard) {
        this.soomStandard = soomStandard;
    }

    public Double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(Double poolArea) {
        this.poolArea = poolArea;
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "soomStandard='" + soomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
