package vehicleProject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

   private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    void setup() {
        car = new Car("Chevrolet", "Cruz", 2010);
        motorcycle = new Motorcycle("YAMAHA", "YZF-R7", 2023);
    }

    @Test
    void carIsInstanceOfVehicle() {
        assertInstanceOf(Vehicle.class, car, "Экземпляр объекта Car также является экземпляром транспортного средства.");
    }

    @Test
     void carHasFourWheels() {
        assertEquals(4, car.getNumWheels(), "Объект Car создается с 4-мя колесами");
    }

    @Test
    void motorcycleHasTwoWheels() {
        assertEquals(2, motorcycle.getNumWheels(), "Объект Motorcycle создается с 2-мя колесами");
    }

    @Test
    void carSpeedInTestDriveMode() {
        car.testDrive();
        assertEquals(60, car.getSpeed(), "Объект Car развивает скорость 60 в режиме тестового вождения.");
    }

    @Test
    void motorcycleSpeedInTestDriveMode() {
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed(), "объект Motorcycle развивает скорость 75 в режиме тестового вождения.");
    }

    @Test
    void carStopsInParkMode() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed(), "Скорость Car в режиме парковки должна быть 0.");
    }

    @Test
    void motorcycleStopsInParkMode() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed(), "Скорость Motorcycle в режиме парковки должна быть 0.");
    }

}