package by.tc.task01.entity.appliance.refrigerator;

import by.tc.task01.entity.appliance.KitchenAppliance;

public class Refrigerator extends KitchenAppliance {
	// you may add your own code here

    private double freezerCapacity;
    private double overallCapacity;

    public Refrigerator(String producerName,
                        String modelName,
                        double price,
                        double powerConsumption,
                        double weight,
                        double height,
                        double width,
                        double freezerCapacity,
                        double overallCapacity) {
        super(producerName,
              modelName,
              price,
              powerConsumption,
              weight,
              height,
              width);
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
    }

    public Refrigerator(double powerConsumption,
                        double weight,
                        double height,
                        double width,
                        double freezerCapacity,
                        double overallCapacity) {
        this("Unknown",
              "Unknown",
              0,
              powerConsumption,
              weight,
              height,
              width,
              freezerCapacity,
              overallCapacity);
    }

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    @Override
    public String toString() {
        return "Refrigerator : " + super.toString() +
                ", Freezer capacity = " + freezerCapacity +
                ", Overall capacity = " + overallCapacity +
                ". ";
    }

}
