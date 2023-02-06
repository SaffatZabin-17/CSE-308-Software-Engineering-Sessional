package Offline3.Problem1;

public class ImposterAdapter implements SpaceExplorer{
    Imposter imposter;

    public ImposterAdapter(Imposter imposter){
        this.imposter = imposter;
    }
    @Override
    public void makeBurger() {
        imposter.makePoisonousBurger();
    }

    @Override
    public void fuelEngines() {
        imposter.sabotageEngines();
    }

    @Override
    public void fixWiring() {
        imposter.sabotageElectricSystems();
    }

    @Override
    public void divertPower() {
        imposter.killPower();
    }

    @Override
    public void chartCourse() {
        imposter.chartWrongCourse();
    }

    @Override
    public void recordTemperature() {
        imposter.sabotageThermometer();
    }
}
