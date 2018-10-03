import java.util.Objects;

public class Vehicle {
    private String vehicleName;
    private int capacity;
    private double fuelUsagePer100;

    public Vehicle(String vehicleName, int capacity, double fuelUsagePer100) {
        this.vehicleName = vehicleName;
        this.capacity = capacity;
        this.fuelUsagePer100 = fuelUsagePer100;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getFuelUsagePer100() {
        return fuelUsagePer100;
    }

    public void setFuelUsagePer100(int fuelUsagePer100) {
        this.fuelUsagePer100 = fuelUsagePer100;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return capacity == vehicle.capacity &&
                fuelUsagePer100 == vehicle.fuelUsagePer100 &&
                Objects.equals(vehicleName, vehicle.vehicleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleName, capacity, fuelUsagePer100);
    }

    @Override
    public String toString() {
        return "Marka: "+getVehicleName()+"\n"+"Pojemność baku: "+getCapacity()+"\n"+
                "Spalanie na 100 KM: "+getFuelUsagePer100();
    }
}
