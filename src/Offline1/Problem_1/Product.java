package Offline1.Problem_1;

import java.util.LinkedList;

public class Product {
    private LinkedList<Product> productList;
    protected int price;
    protected String name;

    Product(){
        this.productList = new LinkedList<>();
    }

    public void add(Product o){
        productList.add(o);
    }

    public void show(){
        int price = 0;
        for (Product o: productList) {
            System.out.println("\t\t" + o.name + " -> " + o.price);
            price = price + o.price;
        }
        System.out.println("\t\tTotal Price -> " + (price + 70000));
    }
}

class Processor extends Product{
    Processor(String name, int price){
        this.name = name;
        this.price = price;
    }
}

class RAM extends Product{
    RAM (String name, int price){
        this.name = name;
        this.price = price;
    }
}

class Cooler extends Product{
    Cooler(String name, int price){
        this.name = name;
        this.price = price;
    }
}

class Components extends Product{
    Components(String name, int price){
        this.name = name;
        this.price = price;
    }
}

class DVD extends Product{
    DVD(String name, int price){
        this.name = name;
        this.price = price;
    }
}

class GPU extends Product{
    GPU(String name, int price){
        this.name = name;
        this.price = price;
    }
}
