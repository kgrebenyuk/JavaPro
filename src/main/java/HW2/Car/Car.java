package HW2.Car;

public class Car {

    private void startElectricity() {
        System.out.println("startElectricity is OK");
    }

    private void startCommand() {
        System.out.println("startCommand is OK");
    }

    private void startFuelSystem() {
        System.out.println("startFuelSystem is OK");
    }

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();

    }
}
