package Offline1.Problem_2;

public class Toyota extends Car{
    Toyota(){
        name = "Toyota";
        manufacturer = "Japan";
    }
    @Override
    public String addEngine() {
        return "Hydrogen Fuel Cell";
    }
    @Override
    public String addColor() {
        return "Red";
    }
    @Override
    public String addDriveTrain() {
        return "Rear Wheel Drive";
    }
}
