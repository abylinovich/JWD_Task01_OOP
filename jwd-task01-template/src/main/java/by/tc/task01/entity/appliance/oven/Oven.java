package by.tc.task01.entity.appliance.oven;

import by.tc.task01.entity.appliance.KitchenAppliance;

public class Oven extends KitchenAppliance {
	// you may add your own code here

    private double capacity;
    private double depth;

    public Oven(String producerName,
                String modelName,
                double price,
                double powerConsumption,
                double weight,
                double height,
                double width,
                double capacity,
                double depth) {
        super(producerName,
              modelName,
              price,
              powerConsumption,
              weight,
              height,
              width);
        this.capacity = capacity;
        this.depth = depth;
    }

    public Oven(double powerConsumption,
                double weight,
                double height,
                double width,
                double capacity,
                double depth) {
        this("Unknown",
                "Unknown",
                0,
                powerConsumption,
                weight,
                height,
                width,
                capacity,
                depth);
    }

    public double getCapacity() {
        return capacity;
    }

    public double getDepth() {
        return depth;
    }

    @Override
    public String toString() {
        return "Oven : " + super.toString() +
                ", Capacity = " + capacity +
                ", Depth = " + depth +
                "." ;
    }
}
