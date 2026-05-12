package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Moped slowRide1 = new Moped();
        Car fastRide1 = new Car();
        SemiTruck bigRide1 = new SemiTruck();
        Hovercraft seaRide1 = new Hovercraft();
        Moped slowRide2 = new Moped("Green",2,5,5);
        Car fastRide2 = new Car("White",4,100,25);
        SemiTruck bigRide2 = new SemiTruck("Black",4,5000,150);
        Hovercraft seaRide2 = new Hovercraft("Navy",8,100,20);
        slowRide1.setColor("Orange");
        fastRide1.setColor("Black");
        bigRide1.setColor("White");
        seaRide1.setColor("Blue");
        slowRide1.setNumberOfPassengers(2);
        fastRide1.setNumberOfPassengers(4);
        bigRide1.setNumberOfPassengers(2);
        seaRide1.setNumberOfPassengers(6);
        System.out.println("Moped: "+slowRide1.getColor()+"|  Passenger: "+slowRide1.getNumberOfPassengers());
        System.out.println("Car: "+fastRide1.getColor()+"|  Passenger: "+fastRide1.getNumberOfPassengers());
        System.out.println("SemiTruck: "+bigRide1.getColor()+"|  Passenger: "+bigRide1.getNumberOfPassengers());
        System.out.println("Hovercraft: "+seaRide1.getColor()+"|  Passenger: "+seaRide1.getNumberOfPassengers());
        slowRide1.setCargoCapacity(5);
        fastRide1.setCargoCapacity(50);
        bigRide1.setCargoCapacity(5000);
        seaRide1.setCargoCapacity(500);
        slowRide1.setFuelCapacity(8);
        fastRide1.setFuelCapacity(25);
        bigRide1.setFuelCapacity(100);
        seaRide1.setFuelCapacity(15);

        System.out.println("Moped - Cargo Capacity: "+slowRide1.getCargoCapacity() +"| Fuel Capacity: "+slowRide1.getFuelCapacity());
        System.out.println("Car - Cargo Capacity: "+fastRide1.getCargoCapacity() +"| Fuel Capacity: "+fastRide1.getFuelCapacity());
        System.out.println("SemiTruck - Cargo Capacity: "+bigRide1.getCargoCapacity() +"| Fuel Capacity: "+bigRide1.getFuelCapacity());
        System.out.println("Hovercraft - Cargo Capacity: "+slowRide1.getCargoCapacity() +"| Fuel Capacity: "+seaRide1.getFuelCapacity());

        System.out.println("Moped 2: "+slowRide2.getColor()+"| Passenger: "+slowRide2.getNumberOfPassengers()+"| Cargo Capacity: "+slowRide2.getCargoCapacity()+"| Fuel Capacity: "+slowRide2.getFuelCapacity());
        System.out.println("Car 2: "+fastRide2.getColor()+"|  Passenger: "+fastRide2.getNumberOfPassengers()+"| Cargo Capacity: "+fastRide2.getCargoCapacity()+"| Fuel Capacity: "+fastRide2.getFuelCapacity());
        System.out.println("SemiTruck 2: "+bigRide2.getColor()+"|  Passenger: "+bigRide2.getNumberOfPassengers()+"| Cargo Capacity: "+bigRide2.getCargoCapacity()+"| Fuel Capacity: "+bigRide2.getFuelCapacity());
        System.out.println("Hovercraft 2: "+seaRide2.getColor()+"|  Passenger: "+seaRide2.getNumberOfPassengers()+"| Cargo Capacity: "+slowRide2.getCargoCapacity()+"| Fuel Capacity: "+slowRide2.getFuelCapacity());
    }

}
