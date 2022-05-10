package case_study.models;

public class Employee extends Person {
    //    MÃ NAHAN VIÊN Trình độ, Vị trí, lương
    private Integer employeeCode;
    private String position;
    private Double salary;

    public Employee(Integer employeeCode, String position, Double salary) {
        this.employeeCode = employeeCode;
        this.position = position;
        this.salary = salary;

    }

    public Employee(String fullName, String dateOfBirth, String gender,
                    Integer identityCard, Long phoneNumber, String email,
                    Integer employeeCode, String position, Double salary) {
        super(fullName, dateOfBirth, gender, identityCard, phoneNumber, email);
        this.employeeCode = employeeCode;
        this.position = position;
        this.salary = salary;
    }

    public Integer getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(Integer employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{ " +
                super.toString() +
                "employeeCode=" + employeeCode +
                ", position='" + position + '\'' +
                ", salary=" + salary;
    }

    @Override
    public String wriderPerson() {
        return super.wriderPerson()+","+employeeCode+","+position+","+salary;
    }
}

