package by.tc.task01.entity.appliance;

public abstract class NotebookAppliance extends BatteryAppliance {

    private double displayInches;
    private double memoryROM;

    public NotebookAppliance(String producerName,
                             String modelName,
                             double price,
                             double batteryCapacity,
                             double displayInches,
                             double memoryROM) {
        super(producerName, modelName, price, batteryCapacity);
        this.displayInches = displayInches;
        this.memoryROM = memoryROM;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public double getMemoryROM() {
        return memoryROM;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Display inches = " + displayInches +
                ", Memory ROM = " + memoryROM;
    }
}
