package extraxercises.modol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Vehicle {

    public String seaOfControl;
    public Munufacturer munufactureru;
    public int yearOfManufacture;
    public String owner;
    public Vehicle() {

    }
    public Vehicle(String seaOfControl,Munufacturer munufactureru, int yearOfManufacture, String owner) {
        this.seaOfControl = seaOfControl;
       this.munufactureru=munufactureru;
        this.yearOfManufacture = yearOfManufacture;
        this.owner = owner;
    }

    public String getSeaOfControl() {
        return seaOfControl;
    }

    public void setSeaOfControl(String seaOfControl) {
        this.seaOfControl = seaOfControl;
    }

    public Munufacturer getMunufacturer() {
        return munufactureru;
    }

    public void setManufacturersName(Munufacturer munufacturer) {
        this.munufactureru = munufactureru;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void input(){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter biển kiểm soát: ");
        this.seaOfControl=sc.nextLine();

        System.out.println("enter hãng : ");
        this.munufactureru = choseManufacture();

        System.out.println("enter năm sản xuất: ");
        this.yearOfManufacture = sc.nextInt();

        System.out.println("enter chủ sở hưu: ");
        this.owner = sc.nextLine();
    }
    public Munufacturer choseManufacture(){
        Scanner scanner=new Scanner(System.in);
        List<Munufacturer>munufacturerList=new ArrayList<>();
        munufacturerList.add(new Munufacturer(1,"HONDA","han quốc"));
        munufacturerList.add(new Munufacturer(2,"suzuki","châu phi"));
        munufacturerList.add(new Munufacturer(3,"vinfap","VIệt nam"));
        munufacturerList.add(new Munufacturer(4,"tozota","han quoc"));
        munufacturerList.add(new Munufacturer(5,"4 bánh","VIệt nam"));
        System.out.println("mời bạn chọn chức năng");
        int choice;
        do {
            for (int i = 0; i < munufacturerList.size(); i++) {
                System.out.println((i+1)+" ."+munufacturerList.get(i).getManufacturersName());
            }
            System.out.println("choise: ");
            choice=Integer.parseInt(scanner.nextLine());
            if (choice>0 && choice<munufacturerList.size()){
                return munufacturerList.get(choice -1);
            }else {
                System.out.println("..lựa chọn lại đi cu..");
            }
        }while (true);

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "seaOfControl=" + seaOfControl +
                ", manufacturersName='" + munufactureru + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", owner='" + owner + '\'' +
                '}';
    }
}
