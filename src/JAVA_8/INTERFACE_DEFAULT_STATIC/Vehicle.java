package JAVA_8.INTERFACE_DEFAULT_STATIC;

public interface Vehicle {
    static String producer() {
        return "N&F Vehicles";
    }
    default String getOverview() {
        return "ATV made by " + producer();
    }
}
