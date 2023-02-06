package Offline3.Problem1;

public class CrewMate implements SpaceExplorer{
    @Override
    public void makeBurger() {
        System.out.println("Crew mate made a delicious burger");
    }

    @Override
    public void fuelEngines() {
        System.out.println("Crew mate fueled the engines");
    }

    @Override
    public void fixWiring() {
        System.out.println("Crew mate fixed the ship wiring");
    }

    @Override
    public void divertPower() {
        System.out.println("Crew mate diverted the ship main power");
    }

    @Override
    public void chartCourse() {
        System.out.println("Crew mate charted a course for destination");
    }

    @Override
    public void recordTemperature() {
        System.out.println("Crew mate recorded the ship temperature");
    }
}
