package case_study.models;

public class Customer extends Person {
//    Mã khách hàng,  Loại khách, Địa chỉ

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

    public Customer(String fullName, String dateOfBirth, String gender, Integer identityCard, Long phoneNumber,
                    String email, Integer customersCode, String typeOfGuest, String address) {
        super(fullName, dateOfBirth, gender, identityCard, phoneNumber, email);
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

        return   "Customer{ " +
                super.toString()+

                "customersCode=" + customersCode +
                ", typeOfGuest='" + typeOfGuest + '\'' +
                ", address='" + address + '\'';
    }

    @Override
    public String wriderPerson() {
        return super.wriderPerson()+","+customersCode+","+typeOfGuest+","+address;
    }
}
