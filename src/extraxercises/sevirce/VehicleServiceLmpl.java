package extraxercises.sevirce;

import extraxercises.modol.Car;
import extraxercises.modol.Munufacturer;
import extraxercises.modol.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleServiceLmpl implements VehicleService {
    List<Vehicle>vehicles=new ArrayList<>();
    {
        Munufacturer honda=new Munufacturer(1,"HONDA","VIỆT NAM");
        Munufacturer tozota=new Munufacturer(1,"HONDA","jaban");
        Munufacturer suzuki=new Munufacturer(1,"HONDA","hàn quốc");
        Munufacturer vinfap=new Munufacturer(1,"HONDA","châu phi");

        Vehicle car=new Car("91-123",honda,200,"tran lung tung");
        Vehicle truck=new Car("81-123",tozota,200,"tran lung tung");
        Vehicle moto=new Car("81-123",suzuki,200,"tran lung tung");
        Vehicle moto2=new Car("81-123",vinfap,200,"tran lung tung");

vehicles.add(car);
vehicles.add(truck);
vehicles.add(moto);
vehicles.add(moto2);
    }

}

