package Offline1.Problem_1;

public class PCBuilder extends Builder{

    Product product = new Product();
    
    @Override
    public void addProcessor(Processor p) {
        product.add(p);
    }
    @Override
    public void addCooler(Cooler cooler) {
        product.add(cooler);
    }
    @Override
    public void addRAM(RAM ram) {
        product.add(ram);
    }
    @Override
    public void addDVD(DVD dvd) {
        product.add(dvd);
    }
    @Override
    public void addComponents(Components components) {
        product.add(components);
    }
    @Override
    public void addGPU(GPU gpu) {
        product.add(gpu);
    }
    @Override
    public Product getPC() {
        return product;
    }

}
