package case_study.models;

public class Customer extends Person{
//    Mã khách hàng, Họ tên , Ngày sinh, Giới tính, Số CMND, Số Điện Thoại, Email,
//    Loại khách, Địa chỉ

    private Integer customersCode;
    private String typeOfGuest;
    private String address;

    public Customer() {
    }

    public Customer(Integer customersCode, String typeOfGuest, String address) {
        this.customersCode = customersCode;
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public Integer getCustomersCode() {
        return customersCode;
    }

    public void setCustomersCode(Integer customersCode) {
        this.customersCode = customersCode;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customersCode=" + customersCode +
                ", typeOfGuest='" + typeOfGuest + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
