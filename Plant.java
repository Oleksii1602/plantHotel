package plantHotel;
// ÄRV: Denna abstrakta basklass innehåller gemensamma egenskaper för alla växter.
public abstract class Plant implements IPlant {
    // INKAPSLING: Alla instansvariabler är privata och nås endast via getters/setters.
    private String name;  // en variabel som presenterar växtens namn
    private double lengthInMeter;  // en variabel som presenterar växtens längd
    // KONSTRUKTÖR:
    public Plant(String name, double lengthInMeter) {
        this.name = name;
        this.lengthInMeter = lengthInMeter;
    }
    // INKAPSLING: Getter för name
    @Override
    public String getName() {
        return name;
    }
    // INKAPSLING: Getter för lengthInMeter
    public double getLengthInMeter() {
        return lengthInMeter;
    }
}

