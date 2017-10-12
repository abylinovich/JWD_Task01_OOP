package by.tc.task01.entity.appliance.tabletpc;

import by.tc.task01.entity.appliance.NotebookAppliance;

public class TabletPC extends NotebookAppliance {
	// you may add your own code here

    private double flashMemoryCapacity;
    private String color;

    public TabletPC(String producerName,
                    String modelName,
                    double price,
                    double batteryCapacity,
                    double displayInches,
                    double memoryROM,
                    double flashMemoryCapacity,
                    String color) {
        super(producerName,
              modelName,
              price,
              batteryCapacity,
              displayInches,
              memoryROM);
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public TabletPC(double batteryCapacity,
                    double displayInches,
                    double memoryROM,
                    double flashMemoryCapacity,
                    String color) {
        this("Unknown",
             "Unknown",
             0,
             batteryCapacity,
             displayInches,
             memoryROM,
             flashMemoryCapacity,
             color);
    }

    public double getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "TabletPC : " + super.toString() +
                ", Flash Memory Capacity = " + flashMemoryCapacity +
                ", Color = '" + color + '\'' +
                ".";
    }
}
