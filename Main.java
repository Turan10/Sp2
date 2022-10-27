import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        DieselCar disCar1 = new DieselCar("AC224585", "Audi", "A5", 4, 25,true);

        GasolineCar gasCar1 = new GasolineCar("KA639896 ", "BMW ", "x5 ", "Gasoline",5, 5);

        disCar1.getRegistrationFee();
     gasCar1.getRegistrationFee();

FleetOfCars carFleet = new FleetOfCars(new ArrayList<>());
carFleet.addCar(gasCar1);
carFleet.addCar(disCar1);
        System.out.println(carFleet);


    }
}