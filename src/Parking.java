public class Parking {
    public static void main(String[] args) {
        Car[] vehicles = new Car[4];
        vehicles[0] = new Car("Mercedes", 100, 9.1, false);
        vehicles[1] = new Car("Mercedes", 100, 7.5, false);
        vehicles[2] = new Truck("VolksWagen", 1300, 25.1, false, 29000);
        vehicles[3] = new Truck("Reno", 800, 20.4, false, 15000);

        for (Car vehicle : vehicles){
            System.out.println(vehicle);
            System.out.println(" ");
        }
        for (int i = 0; i < vehicles.length; i++) {
            System.out.printf("%d pojazd ma zasięg: %.2f \n",(i+1),vehicles[i].vehicleRange());
        }
        for(Car vehicle:vehicles){
            vehicle.setAirConditioning(true);
        }
        System.out.println(" ");
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("Klimatyzacja w pojeździe "+(i+1)+" jest: "+vehicles[i].isACON(vehicles[i].getAirConditioning()));
        }
        System.out.println(" ");
        for (int i = 0; i < vehicles.length; i++) {
            System.out.printf("%d pojazd ma zasięg: %.2f \n",(i+1),vehicles[i].vehicleRange());
        }
    }
}
