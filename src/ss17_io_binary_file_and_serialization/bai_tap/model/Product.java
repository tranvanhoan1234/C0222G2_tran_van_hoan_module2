package ss17_io_binary_file_and_serialization.bai_tap.model;

import java.io.Serializable;

public class Product implements Serializable {




    private Integer productCode;
    private String productName;
    private String productCompany;
    private Integer price;

    public Product() {
    }

    public Product(Integer productCode, String productName, String productCompany, Integer price) {
        this.productCode = productCode;
        this.productName = productName;
        this.productCompany = productCompany;
        this.price = price;
    }

    public Integer getProductCode() {
        return productCode;
    }

    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCompany() {
        return productCompany;
    }

    public void setProductCompany(String productCompany) {
        this.productCompany = productCompany;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCode=" + productCode +
                ", productName='" + productName + '\'' +
                ", productCompany='" + productCompany + '\'' +
                ", price=" + price +
                '}';
    }
}
