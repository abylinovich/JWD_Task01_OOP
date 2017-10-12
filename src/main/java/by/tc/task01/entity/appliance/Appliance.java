package by.tc.task01.entity.appliance;

public abstract class Appliance {
	// you may add your own code here

    private String producerName;
    private String modelName;
    private double price;

    public Appliance(String producerName,
                     String modelName,
                     double price) {
        this.producerName = (producerName != null) ? producerName : "Unknown";
        this.modelName = (modelName != null) ? modelName : "Unknown";
        this.price = price;
    }

    public String getProducerName() {
        return producerName;
    }

    public String getModelName() {
        return modelName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Producer name = '" + producerName + '\'' +
                ", Model name = '" + modelName + '\'' +
                ", Price = " + price;
    }

}
