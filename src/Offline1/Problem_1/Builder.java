package Offline1.Problem_1;

public abstract class Builder {
    int price;
    abstract void addProcessor(Processor p);
    abstract void addCooler(Cooler cooler);
    abstract void addRAM(RAM ram);
    abstract void addDVD(DVD dvd);
    abstract void addComponents(Components components);
    abstract void addGPU(GPU gpu);
    abstract Product getPC();
}
