package ss16_io_test_file.thuc_hanh;

public class Sos {
    private String a;
    private String b;
    private String c;

    public Sos(String a, String b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Sos{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                '}';
    }
}
