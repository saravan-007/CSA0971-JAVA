 class Vehicle {
    private String licensePlate;
    private String owner;
    private int wheels;
    private String color;

    public Vehicle(String licensePlate, String owner, int wheels, String color) {
        this.licensePlate = licensePlate;
        this.owner = owner;
        this.wheels = wheels;
        this.color = color;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Owner: " + owner);
        System.out.println("Wheels: " + wheels);
        System.out.println("Color: " + color);
    }
}
 class Car extends Vehicle {
    private int numberOfDoors;
    private boolean isElectric;

    public Car(String licensePlate, String owner, int wheels, String color, int numberOfDoors, boolean isElectric) {
        super(licensePlate, owner, wheels, color);
        this.numberOfDoors = numberOfDoors;
        this.isElectric = isElectric;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Is Electric: " + isElectric);
    }
}
 class Truck extends Vehicle {
    private double loadCapacity;
    private boolean hasTrailer;

    public Truck(String licensePlate, String owner, int wheels, String color, double loadCapacity, boolean hasTrailer) {
        super(licensePlate, owner, wheels, color);
        this.loadCapacity = loadCapacity;
        this.hasTrailer = hasTrailer;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public boolean isHasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity);
        System.out.println("Has Trailer: " + hasTrailer);
    }
}
 class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String licensePlate, String owner, int wheels, String color, boolean hasSidecar) {
        super(licensePlate, owner, wheels, color);
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + hasSidecar);
    }
}
public class Vehicleclass {
    public static void main(String[] args) {
        Vehicle car = new Car("ABC123", "John Doe", 4, "Red", 4, true);
        Vehicle truck = new Truck("XYZ789", "Jane Smith", 6, "Blue", 12000.5, true);
        Vehicle motorcycle = new Motorcycle("LMN456", "Alice Brown", 2, "Black", false);

        System.out.println("Car Info:");
        car.displayInfo();
        System.out.println();

        System.out.println("Truck Info:");
        truck.displayInfo();
        System.out.println();

        System.out.println("Motorcycle Info:");
        motorcycle.displayInfo();
    }
}
