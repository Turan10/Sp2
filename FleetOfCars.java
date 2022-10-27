import java.util.ArrayList;

public class FleetOfCars {

    public FleetOfCars(ArrayList<Car> carFleet) {
        this.carFleet = carFleet;
    }

    ArrayList<Car> carFleet = new ArrayList<>();

    public void addCar(Car car){
        carFleet.add(car);

    }

    public void getTotalRegistrationFeeForFleet(){
   int count = 0;
   for(int i = 0; i < carFleet.size(); i++){

   }

    }


    public String toString(){
        return "The cars in your fleet" + carFleet;

    }
}
