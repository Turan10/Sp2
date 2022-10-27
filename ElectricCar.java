public class ElectricCar extends ACar {

    int batteryCapacityKwh;
    int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacityKwh = batteryCapacity;
        this.maxRange = maxRange;
    }


    int getBatteryCapacityKWh() {
        return batteryCapacityKwh;
    }

    int getMaxRangeKm() {
        return maxRange;
    }


    int getWhPrKm() {

        int whPrkm = maxRange / batteryCapacityKwh;


        return whPrkm;
    }


//    double totalUsagePrKm = whPrkm / 91.25 / 100;

    @Override
    public int getRegistrationFee() {


        int cost = 0;

        if (getWhPrKm() <= 5) {
            cost = 10470;
            String price = "The registration fee for your car is " + cost + " kr per half year";
            System.out.println(price);
        }
        if (getWhPrKm() > 5 && getWhPrKm() <= 10) {
            cost = 5500;
            String price = "The registration fee for your car is " + cost + " kr per half year";
            System.out.println(price);

        }
        if (getWhPrKm() > 10 && getWhPrKm() <= 15) {
            cost = 2340;
            String price = "The registration fee for your car is " + cost + " kr per half year";
            System.out.println(price);
        }
        if (getWhPrKm() > 15 && getWhPrKm() <= 20) {
            cost = 1050;
            String price = "The registration fee for your car is " + cost + " kr per half year";
            System.out.println(price);
        }
        if (getWhPrKm() > 20 && getWhPrKm() <= 50) {
            cost = 330;
            String price = "The registration fee for your car is " + cost + " kr per half year";
            System.out.println(price);
        }
        //Maybe not correct return type!!
        return cost;

    }

    @Override
    public String toString() {
        return super.toString() + "Batterycapacity " + " " + this.batteryCapacityKwh + "Max range " + " " + this.maxRange;
    }
}
