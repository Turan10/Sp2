public abstract class AFuelCar extends ACar {


    int carKmPrLitre;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int carKmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.carKmPrLitre = carKmPrLitre;
    }


    public int getCarKmPrLitre() {
        return carKmPrLitre;
    }

    public void setCarKmPrLitre(int carKmPrLitre) {
        this.carKmPrLitre = carKmPrLitre;
    }


    String getFuelType() {
        return "The fuel type in your car";
    }
}







