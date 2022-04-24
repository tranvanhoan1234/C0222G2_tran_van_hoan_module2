package ss16_io_test_file.bai_tap;

public class Country {
    private Integer id;
    private Integer code;
    private String name;

    public Country() {
    }

    public Country(Integer id, Integer code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", code=" + code +
                ", name='" + name + '\''
                ;
    }
}
