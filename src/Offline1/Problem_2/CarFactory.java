package Offline1.Problem_2;

public class CarFactory {
    public Car getCar(String continent){
        if(continent == null){
            return null;
        }
        if(continent.equals("Europe")){
            return new BMW();
        }
        if(continent.equals("North America")){
            return new Tesla();
        }
        if(continent.equals("Asia")){
            return new Toyota();
        }
        return null;
    }
}
