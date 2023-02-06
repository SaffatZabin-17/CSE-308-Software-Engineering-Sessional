package Offline1.Problem_2;

public class BMW extends Car{
    BMW() {
        name = "BMW";
        manufacturer = "Germany";
    }
    @Override
    public String addEngine() {
        return "Electric Engine";
    }
    @Override
    public String addColor() {
        return "Black";
    }
    @Override
    public String addDriveTrain() {
        return "Rear Wheel Drive";
    }
}
