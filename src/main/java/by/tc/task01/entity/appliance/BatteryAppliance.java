package by.tc.task01.entity.appliance;

public abstract class BatteryAppliance extends Appliance {

    private double batteryCapacity;

    public BatteryAppliance(String producerName,
                            String modelName,
                            double price,
                            double batteryCapacity) {
        super(producerName, modelName, price);
        this.batteryCapacity = batteryCapacity;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Battery capacity = " + batteryCapacity;
    }
}
