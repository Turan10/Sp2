public class DieselCar extends AFuelCar implements Car {

    boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int carKmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, carKmPrLitre);
        this.particleFilter = particleFilter;
    }

    @Override
    String getFuelType() {
        return "Diesel";
    }

    @Override
    public int getRegistrationFee() {

        int kmPrLiter = getCarKmPrLitre();

        int cost = 0;

        if (kmPrLiter < 5) {
            cost = 10470 + 15260;
            System.out.println("The registration fee for your car is " + cost + " kr per half year");
        }
        if (kmPrLiter > 5 && kmPrLiter <= 10) {
            cost = 5500 + 2770;
            System.out.println("The registration fee for your car is " + cost + " kr per half year");

        }
        if (kmPrLiter > 10 && kmPrLiter <= 15) {
            cost = 2340 + 1850;
            System.out.println("The registration fee for your car is " + cost + " kr per half year");
        }
        if (kmPrLiter > 15 && kmPrLiter <= 20) {
            cost = 1050 + 1390;
            System.out.println("The registration fee for your car is " + cost + " kr per half year");
        }
        if (kmPrLiter > 20 && kmPrLiter <= 50) {
            cost = 330 + 130;
            System.out.println("The registration fee for your car is " + cost + " kr per half year");
        }
        return cost;
    }

    //Maybe not correct return type!!


    public boolean hasParticleFilter() {
        if (particleFilter == true) {
            System.out.println("Your car has a particle filter mounted on the car");
        } else {
            System.out.println("Your car has not a particle filter mounted on the car");
        }
        return false;

    }


    @Override
    public String toString() {
        return super.toString() + " Fueltype" + " " + this.getFuelType() + this.hasParticleFilter();
    }
}

