package by.tc.task01.entity.appliance;

public abstract class ElectricalAppliance extends Appliance {

    private double powerConsumption;

    public ElectricalAppliance(String producerName,
                               String modelName,
                               double price,
                               double powerConsumption) {
        super(producerName,
              modelName,
              price);
        this.powerConsumption = powerConsumption;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Power consumption = " + powerConsumption;
    }
}
