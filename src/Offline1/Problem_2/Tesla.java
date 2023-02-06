package Offline1.Problem_2;

public class Tesla extends Car{
    Tesla(){
        name = "Tesla";
        manufacturer = "USA";
    }
    @Override
    public String addEngine() {
        return "Electric Engine";
    }
    @Override
    public String addColor() {
        return "White";
    }
    @Override
    public String addDriveTrain() {
        return "All Wheel Drive";
    }
}
