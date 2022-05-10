package case_study.models;

public abstract class Facility{
    //    Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa,
//    Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ.
    private String serviceId;
    private String serviceName;
    private Double usableArea;
    private Integer rentalCosts;
    private Integer maximumNumberOfPeople;
    private String rentalType;

    public Facility() {
    }
//ten dịch vụ,
    public Facility(String serviceId, String serviceName, Double usableArea, Integer rentalCost, Integer maximumNumberOfPeople, String rentalType) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCost;
        this.maximumNumberOfPeople = maximumNumberOfPeople;
        this.rentalType = rentalType;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }
    public String getServiceId(){return  serviceId;}

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

    public Integer getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(Integer rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public Integer getMaximumNumberOfPeople() {
        return maximumNumberOfPeople;
    }

    public void setMaximumNumberOfPeople(Integer maximumNumberOfPeople) {
        this.maximumNumberOfPeople = maximumNumberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility" +"\t"+"servieid: "+serviceId+
                "serviceName: " + serviceName +
                ", usableArea: " + usableArea +
                ", rentalCost: " + rentalCosts +
                ", maximumNumberOfPeople: " + maximumNumberOfPeople +
                ", rentalType: " + rentalType;
    }

    public String wriderFacility(){
        return serviceId+","+ serviceName+","+usableArea+","+ rentalCosts +","+maximumNumberOfPeople+","+rentalType;
    }
}
