package by.tc.task01.entity.appliance.speakers;

import by.tc.task01.entity.appliance.ElectricalAppliance;

public class Speakers extends ElectricalAppliance {
	// you may add your own code here

    private double numberOfSpeaker;
    private double cordLength;
    private String frequencyRange;

    public Speakers(String producerName,
                    String modelName,
                    double price,
                    double powerConsumption,
                    double numberOfSpeaker,
                    double cordLength,
                    String frequencyRange) {
        super(producerName,
              modelName,
              price,
              powerConsumption);
        this.numberOfSpeaker = numberOfSpeaker;
        this.cordLength = cordLength;
        this.frequencyRange = frequencyRange;
    }

    public Speakers(double powerConsumption,
                    double numberOfSpeaker,
                    double cordLength,
                    String frequencyRange) {
        this("Unknown",
             "Unknown",
             0,
             powerConsumption,
             numberOfSpeaker,
             cordLength,
             frequencyRange);
    }

    public double getNumberOfSpeaker() {
        return numberOfSpeaker;
    }

    public double getCordLength() {
        return cordLength;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    @Override
    public String toString() {
        return "Speakers : " + super.toString() +
                ", Number of speaker = " + numberOfSpeaker +
                ", Cord length = " + cordLength +
                ", Frequency range = '" + frequencyRange + '\'';
    }

}
