package Offline1.Problem_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        HashMap<String, Integer> processors = new HashMap<>();
        HashMap<String, Integer> RAMs = new HashMap<>();
        HashMap<String, Integer> coolers = new HashMap<>();
        HashMap<String, Integer> DVDs = new HashMap<>();
        HashMap<String, Integer> GPUs = new HashMap<>();
        HashMap<String, Integer> components = new HashMap<>();
        processors.put("AMD Ryzen 7 5700X", 28000);
        processors.put("Intel Core i9 11900K", 65000);
        processors.put("Intel Core i7 11700K", 37000);
        processors.put("Intel Core i5 11600K", 20000);
        RAMs.put("Corsair Dominator Platinum 3200 MHz 8 GB", 2950);
        RAMs.put("Corsair Vengeance LPX 2666 MHz 8 GB", 2620);
        coolers.put("ASUS ROG Ryujin II 360mm AIO", 36000);
        coolers.put("Corsair H150i Elite Capellix 360mm AIO", 17000);
        DVDs.put("Standard DVD Drive", 6000);
        GPUs.put("Nvidia GTX 1030 2 GB DDR3", 7600);
        GPUs.put("AMD Radeon HD 7870 2 GB DDR3", 6500);
        components.put("Motherboard & HDD", 70000);
        Scanner sc = new Scanner(System.in);
        Builder builder = new PCBuilder();
        Director director = new Director(builder);
        System.out.println("Welcome to XYZ PC Shop!");
        while (true) {
            System.out.println("Would you like to order a PC? If so, Please press Y, else press E");
            String choice = sc.nextLine();
            boolean check = false;
            if (Objects.equals(choice, "E")) {
                break;
            }
            if(Objects.equals(choice, "O")){
                System.out.println("Already an order ongoing");
            }
            System.out.println("Please add the components you would like...........");
            String name;
            System.out.println("Processors====================");
            System.out.println("\t\t1. AMD Ryzen 7 5700X -> 28000 BDT");
            System.out.println("\t\t2. Intel Core i9 11900K -> 65000 BDT");
            System.out.println("\t\t3. Intel Core i7 11700K -> 37000 BDT");
            System.out.println("\t\t4. Intel Core i5 11600K -> 20000 BDT");
            System.out.println("\t\tPlease write the name of the processor of your choice. If you don't want a processor, type N........");
            name = sc.nextLine();
            if (processors.containsKey(name)) {
                director.constructProcessor(name, processors.get(name));
                check = true;
            }
            System.out.println("RAMs===========================");
            System.out.println("\t\tCorsair Dominator Platinum 3200 MHz 8 GB -> 2950 BDT");
            System.out.println("\t\tCorsair Vengeance LPX 2666 MHz 8 GB -> 2620 BDT");
            System.out.println("\t\tPlease write the name of the RAM of your choice. If you don't want a RAM, type N........");
            name = sc.nextLine();
            if (RAMs.containsKey(name)) {
                director.constructRAM(name, RAMs.get(name));
                check = true;
            }
            System.out.println("GPUs============================");
            System.out.println("\t\tNvidia GTX 1030 2 GB DDR3 -> 7600 BDT");
            System.out.println("\t\tAMD Radeon HD 7870 2 GB DDR3 -> 6500 BDT");
            System.out.println("\t\tPlease write the name of the GPU of your choice. If you don't want a GPU, type N........");
            name = sc.nextLine();
            if (GPUs.containsKey(name)) {
                director.constructGPU(name, GPUs.get(name));
                check = true;
            }
            System.out.println("Coolers=================================");
            System.out.println("\t\tASUS ROG Ryujin II 360mm AIO -> 36000 BDT");
            System.out.println("\t\tCorsair H150i Elite Capellix 360mm AIO -> 17000 BDT");
            System.out.println("\t\tPlease write the name of the cooler of your choice. If you don't want a cooler, type N........");
            name = sc.nextLine();
            if (coolers.containsKey(name)) {
                director.constructCooler(name, coolers.get(name));
                check = true;
            }
            System.out.println("DVDs=====================================");
            System.out.println("\t\tStandard DVD Drive -> 6000 BDT");
            System.out.println("\t\tPlease write the name of the DVD Drive of your choice. If you don't want a DVD Drive, type N........");
            name = sc.nextLine();
            if (DVDs.containsKey(name)) {
                director.constructDVD(name, DVDs.get(name));
                check = true;
            }
            System.out.println("Base Components======================================");
            System.out.println("\t\tMotherboard and Hard Disks -> 70000 BDT");
            System.out.println("\t\tAdded Base Components..............");
            if (!check) {
                System.out.println("Cannot checkout. Cart is empty");
            }
            else {
                Product product = builder.getPC();
                System.out.println("Base Components:  Motherboard & 1 TB HDD -> 70000 BDT");
                System.out.println("Added Components: ");
                product.show();
            }
        }
    }
}
