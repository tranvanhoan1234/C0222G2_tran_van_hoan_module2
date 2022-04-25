package bai_tap_dau_kho.bai2;

public class Customer {
    private Integer code;
    private String priority;

    public Customer() {
    }

    public Customer(Integer code, String priority) {
        this.code = code;
        this.priority = priority;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "code=" + code +
                ", priority='" + priority + '\'' +
                '}';
    }
}
