import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        DieselCar disCar1 = new DieselCar("AC224585", "Audi", "A5", 4, 25, true);

        GasolineCar gasCar1 = new GasolineCar("KA639896 ", "BMW ", "x5 ", 5, 5);

        ElectricCar elCar1 = new ElectricCar("CS22684", "Hyundai", "Ioniq 5", 5, 77, 700);

        disCar1.getRegistrationFee();
        gasCar1.getRegistrationFee();

        FleetOfCars carFleet = new FleetOfCars();
        carFleet.addCar(gasCar1);
        carFleet.addCar(disCar1);
        carFleet.addCar(elCar1);

        for (ACar c : carFleet.carFleet) {
            System.out.println(c);
        }

        System.out.println(carFleet.getTotalRegistrationFeeForFleet());


    }
}