package by.tc.task01.entity.appliance;

public abstract class KitchenAppliance extends ElectricalAppliance {

    private double weight;
    private double height;
    private double width;

    public KitchenAppliance(String producerName,
                            String modelName,
                            double price,
                            double powerConsumption,
                            double weight,
                            double height,
                            double width) {
        super(producerName, modelName, price, powerConsumption);
        this.weight = weight;
        this.height = height;
        this.width = width;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", Weight = " + weight +
                ", Height = " + height +
                ", Width = " + width;
    }

}
