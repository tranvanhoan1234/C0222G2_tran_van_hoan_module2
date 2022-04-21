package case_study.models;

public abstract class Facility {
    //    Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa,
//    Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ.
    private String serviceName;
    private Double usableArea;
    private Double taxExpenses;
    private Double maximumNumberOfPeople;
    private Double rentalType;

    public Facility() {
    }

    public Facility(String serviceName, Double usableArea, Double taxExpenses, Double maximumNumberOfPeople, Double rentalType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.taxExpenses = taxExpenses;
        this.maximumNumberOfPeople = maximumNumberOfPeople;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(Double usableArea) {
        this.usableArea = usableArea;
    }

    public Double getTaxExpenses() {
        return taxExpenses;
    }

    public void setTaxExpenses(Double taxExpenses) {
        this.taxExpenses = taxExpenses;
    }

    public Double getMaximumNumberOfPeople() {
        return maximumNumberOfPeople;
    }

    public void setMaximumNumberOfPeople(Double maximumNumberOfPeople) {
        this.maximumNumberOfPeople = maximumNumberOfPeople;
    }

    public Double getRentalType() {
        return rentalType;
    }

    public void setRentalType(Double rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", taxExpenses=" + taxExpenses +
                ", maximumNumberOfPeople=" + maximumNumberOfPeople +
                ", rentalType=" + rentalType +
                '}';
    }
}
