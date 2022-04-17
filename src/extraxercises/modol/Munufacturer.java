package extraxercises.modol;

public class Munufacturer{

    public String ManufacturersName;
    public String nation;
    public int id;

    public Munufacturer() {
    }

    public Munufacturer(int id, String nation,String manufacturersName ) {
        ManufacturersName = manufacturersName;
        this.nation = nation;
        this.id = id;
    }

    public String getManufacturersName() {
        return ManufacturersName;
    }

    public void setManufacturersName(String manufacturersName) {
        ManufacturersName = manufacturersName;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Munufacturer{" +
                ", ManufacturersName='" + id + '\'' +
                ", nation='" + ManufacturersName + '\'' +
                ",id " + nation + '\n' +
                '}';
    }
}
