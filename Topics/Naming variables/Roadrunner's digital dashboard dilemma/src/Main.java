import java.util.Scanner;

public class Main {
    // Vehicle properties
    private String vehicleId;
    private float speed;
    private float fuelLevel;

    // Method to update vehicle status
    public void updateVehicleStatus(String id, float newSpeed, float newFuelLevel) {
        vehicleId = id;
        speed = newSpeed;
        fuelLevel = newFuelLevel;
    }

    // Method to display vehicle status
    public String getVehicleStatus() {
        // Implement the logic to return formatted vehicle status here
        System.out.println("Vehicle " + vehicleId + ": " + "Speed = " + speed + " km/h, " + "Fuel = " + fuelLevel + "%");
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");

        Main vehicle = new Main();
        vehicle.updateVehicleStatus(parts[0], Float.parseFloat(parts[1]), Float.parseFloat(parts[2]));
        System.out.println(vehicle.getVehicleStatus());

        scanner.close();
    }
}