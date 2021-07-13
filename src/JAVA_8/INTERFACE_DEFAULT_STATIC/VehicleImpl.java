package JAVA_8.INTERFACE_DEFAULT_STATIC;

public class VehicleImpl implements Vehicle{

    public static void main(String[] args) {
        Vehicle vehicle = new VehicleImpl();
        System.out.println(vehicle.getOverview());
        System.out.println(Vehicle.producer());
    }
}
