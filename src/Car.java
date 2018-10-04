public class Car extends Vehicle {
    private boolean airConditioning;

    public boolean getAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    public Car(String vehicleName, int capacity, double fuelUsagePer100, boolean airConditioning) {
        super(vehicleName, capacity, fuelUsagePer100);
        this.airConditioning = airConditioning;
    }

    public void setACOn() {
        setAirConditioning(true);
    }

    public void setACOFF() {
        setAirConditioning(false);
    }

    public String isACON(boolean AC) {
        if (AC) {
            return "Włączona";
        } else {
            return "Wyłączona";
        }
    }

    public double vehicleRange() {
        double range = 0;
        if (getAirConditioning()) {
            range = 100 * (getCapacity() / (getFuelUsagePer100() + 0.8));
            return range;
        } else {
            range = 100 * (getCapacity() / (getFuelUsagePer100()));
            return range;
        }

    }

    @Override
    public String toString() {

        return super.toString() + "\n" + "Klimatyzacja: " + isACON(getAirConditioning());
    }
}
