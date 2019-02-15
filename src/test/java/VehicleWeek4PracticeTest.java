import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleWeek4PracticeTest {

    @Test
    void demo() {
        VehicleWeek4Practice vehicle = new VehicleWeek4Practice();
        vehicle.honk();
        //vehicle.setmake("Ford");
        CarWeek4Practice car = new CarWeek4Practice();
        car.honk();
        TruckWeek4Practice truck = new TruckWeek4Practice();
        truck.honk();
    }
}