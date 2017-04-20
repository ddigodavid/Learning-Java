package com.company;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    private Collection<Vehicle> vehicles = new ArrayList<Vehicle>();

    public static void main(String[] args) {
        Main main = new Main();
        main.addCar();

        System.out.println(main.CalculateCountOfAllTrailersInGarage());
    }

    public void addCar() {
        this.vehicles.add(new Car(4, 0, 200, ""));
        this.vehicles.add(new Truck(4, 0, 200, ""));
    }

    public double CalculateSumOfAllRepairsInGarage() {
        double sumOfAllRepairs = 0;

        for (Vehicle vehicle : this.vehicles) {
            sumOfAllRepairs += vehicle.getTotalRepairCost();
        }

        return sumOfAllRepairs;
    }

    public int CalculateCountOfAllTrailersInGarage() {
        int countOfAllTrailers = 0;

        for (Vehicle vehicle : this.vehicles) {
            if (vehicle.equals(Truck.class) && ((Truck) vehicle).hasTrailer()) {
                countOfAllTrailers++;
            }
        }

        return countOfAllTrailers;
    }
}
