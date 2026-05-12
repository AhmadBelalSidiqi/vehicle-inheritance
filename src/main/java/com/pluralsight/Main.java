package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        Car fastRide = new Car();
        SemiTruck bigRide = new SemiTruck();
        Hovercraft seaRide = new Hovercraft();

        slowRide.setColor("Orange");
        fastRide.setColor("Black");
        bigRide.setColor("White");
        seaRide.setColor("Blue");

        slowRide.setNumberOfPassengers(2);
        fastRide.setNumberOfPassengers(4);
        bigRide.setNumberOfPassengers(2);
        seaRide.setNumberOfPassengers(6);


        System.out.println("Moped: "+slowRide.getColor()+"|  Passenger: "+slowRide.getNumberOfPassengers());
        System.out.println("Car: "+fastRide.getColor()+"|  Passenger: "+fastRide.getNumberOfPassengers());
        System.out.println("SemiTruck: "+bigRide.getColor()+"|  Passenger: "+bigRide.getNumberOfPassengers());
        System.out.println("Hovercraft: "+seaRide.getColor()+"|  Passenger: "+seaRide.getNumberOfPassengers());


        slowRide.setCargoCapacity(5);
        fastRide.setCargoCapacity(50);
        bigRide.setCargoCapacity(5000);
        seaRide.setCargoCapacity(500);

        slowRide.setFuelCapacity(8);
        fastRide.setFuelCapacity(25);
        bigRide.setFuelCapacity(100);
        seaRide.setFuelCapacity(15);

        System.out.println("Moped - Cargo Capacity: "+slowRide.getCargoCapacity() +"| Fuel: "+slowRide.getFuelCapacity());
        System.out.println("Car - Cargo Capacity: "+fastRide.getCargoCapacity() +"| Fuel: "+fastRide.getFuelCapacity());
        System.out.println("SemiTruck - Cargo Capacity: "+bigRide.getCargoCapacity() +"| Fuel: "+bigRide.getFuelCapacity());
        System.out.println("Hovercraft - Cargo Capacity: "+slowRide.getCargoCapacity() +"| Fuel: "+seaRide.getFuelCapacity());
    }

}
