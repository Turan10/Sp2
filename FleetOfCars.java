import java.util.ArrayList;

public class FleetOfCars {

    public FleetOfCars() {
     this.carFleet = new ArrayList<ACar>();
    }

    ArrayList<ACar> carFleet;

    public void addCar(ACar car) {
        carFleet.add(car);

    }

    public int getTotalRegistrationFeeForFleet() {
        int totalRegistrationFeeForFleet = 0;
        for(ACar c : this.carFleet){
            totalRegistrationFeeForFleet += c.getRegistrationFee();
        }
        return totalRegistrationFeeForFleet;

    }



    public String toString() {
        return "The cars in your fleet" + carFleet;

    }
}
