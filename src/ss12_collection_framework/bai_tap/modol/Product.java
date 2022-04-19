package ss12_collection_framework.bai_tap.modol;

public class Product {
    private Integer id;
    private String ten;
    private Double gia;

    public Product() {
    }

    public Product(Integer id, String ten, Double gia) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", gia=" + gia +
                '}';
    }


}
