package Offline1.Problem_1;

public class Director {
    Builder PCBuilder;

    Director(Builder PCBuilder){
        this.PCBuilder = PCBuilder;
    }
    public void constructProcessor(String name, int price){
        PCBuilder.addProcessor(new Processor(name, price));
    }
    public void constructRAM(String name, int price){
        PCBuilder.addRAM(new RAM(name, price));
    }
    public void constructComponents(String name, int price){
        PCBuilder.addComponents(new Components(name, price));
    }
    public void constructCooler(String name, int price){
        PCBuilder.addCooler(new Cooler(name, price));
    }
    public void constructDVD(String name, int price){
        PCBuilder.addDVD(new DVD(name, price));
    }
    public void constructGPU(String name, int price){
        PCBuilder.addGPU(new GPU(name, price));
    }
}
