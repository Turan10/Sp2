public class GasolineCar extends AFuelCar implements Car {


    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int carKmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, carKmPrLitre);
    }

    int kmPrLitre() {
        return carKmPrLitre;
    }

    @Override
    String getFuelType() {
        return "Gasoline";
    }

    @Override
    public int getRegistrationFee() {
        int kmPrLiter = getCarKmPrLitre();

        int cost = 0;


        if (kmPrLiter <= 5) {
            cost = 10470;
            System.out.println("The registration fee for" + " " + this.getMake() + " " + this.getModel() + " is " + cost + " kr per half year");

        }
        if (kmPrLiter > 5 && kmPrLiter <= 10) {
            cost = 5500;
            System.out.println("The registration fee for" + " " + this.getMake() + " " + this.getModel() + " is " + cost + " kr per half year");

        }
        if (kmPrLiter > 10 && kmPrLiter <= 15) {
            cost = 2340;
            System.out.println("The registration fee for" + " " + this.getMake() + " " + this.getModel() + " is " + cost + " kr per half year");
            ;
        }
        if (kmPrLiter > 15 && kmPrLiter <= 20) {
            cost = 1050;
            System.out.println("The registration fee for" + " " + this.getMake() + " " + this.getModel() + " is " + cost + " kr per half year");

        }
        if (kmPrLiter > 20 && kmPrLiter <= 50) {
            cost = 330;
            System.out.println("The registration fee for" + " " + this.getMake() + " " + this.getModel() + " is " + cost + " kr per half year");
        }
        //Maybe not correct return type!!

        return cost;


    }

    @Override
    public String toString() {
        return super.toString() + " Fueltype" + " " + this.getFuelType();
    }
}







