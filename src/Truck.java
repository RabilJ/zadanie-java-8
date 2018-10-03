import java.util.Objects;

public class Truck extends Car {
    private int loadWeight;

    public Truck(String vehicleName, int capacity, double fuelUsagePer100, boolean airConditioning, int loadWeight) {
        super(vehicleName, capacity, fuelUsagePer100, airConditioning);
        this.loadWeight = loadWeight;
    }

    public int getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(int loadWeight) {
        this.loadWeight = loadWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return loadWeight == truck.loadWeight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loadWeight);
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Waga ładunku: "+getLoadWeight()+"kg";
    }
    @Override
    public double vehicleRange(){
        super.vehicleRange();
        double range = 0;
        if(getAirConditioning()==true){
            range = 100*(getCapacity()/(getFuelUsagePer100()+((getLoadWeight()/100)*0.5)+1.6));
            return range;
        }else{
            range = 100*(getCapacity()/(getFuelUsagePer100()+((getLoadWeight()/100)*0.5)));
            return range;
        }
    }

}
