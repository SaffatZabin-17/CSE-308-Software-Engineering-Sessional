package Offline1.Problem_2;

public abstract class Car {
    protected String name;
    protected String manufacturer;
    public abstract String addEngine();
    public abstract String addColor();
    public abstract String addDriveTrain();
    public void returnCar(){
        String engine = addEngine();
        String driveTrain = addDriveTrain();
        String color = addColor();
        System.out.println("Printing all the car details: =======================================");
        System.out.println("\tThe car brand is: " + name);
        System.out.println("Car specifications: -> ");
        System.out.println("\t\tEngine: " + engine);
        System.out.println("\t\tDrivetrain: " + driveTrain);
        System.out.println("\t\tColor: " + color);
        System.out.println("\t\tManufacturer: " + manufacturer);
    }
}
