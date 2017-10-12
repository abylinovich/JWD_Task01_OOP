package by.tc.task01.entity.appliance.vacuumcleaner;

import by.tc.task01.entity.appliance.ElectricalAppliance;

public class VacuumCleaner extends ElectricalAppliance {
	// you may add your own code here

    private String filterType;
    private String bagType;
    private String wandType;
    private double motorSpeedRegulation;
    private double cleaningWidth;

    public VacuumCleaner(String producerName,
                        String modelName,
                        double price,
                        double powerConsumption,
                        String filterType,
                        String bagType,
                        String wandType,
                        double motorSpeedRegulation,
                        double cleaningWidth) {
        super(producerName,
              modelName,
              price,
              powerConsumption);
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public VacuumCleaner(double powerConsumption,
                         String filterType,
                         String bagType,
                         String wandType,
                         double motorSpeedRegulation,
                         double cleaningWidth) {
        this("Unknown",
                "Unknown",
                0,
                powerConsumption,
                filterType,
                bagType,
                wandType,
                motorSpeedRegulation,
                cleaningWidth);
    }

    public String getFilterType() {
        return filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public double getCleaningWidth() {
        return cleaningWidth;
    }

    @Override
    public String toString() {
        return "VacuumCleaner : " + super.toString() +
                ", Filter type = '" + filterType + '\'' +
                ", Bag type = '" + bagType + '\'' +
                ", Wand type = '" + wandType + '\'' +
                ", Motor speed regulation = " + motorSpeedRegulation +
                ", Cleaning width = " + cleaningWidth;
    }
}
