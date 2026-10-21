package plantHotel;

// ÄRV: Subklassen CarnivorousPlant ärver variabler och metoder från Superklassen Plant.
public class CarnivorousPlant extends Plant {
    // KONSTANTER: Inga hårdkodade siffror.
    private static final double BASE_LEVEL = 0.1;
    private static final double FAСTOR = 0.2;
    // KONSTRUKTÖR:
    public CarnivorousPlant(String name, double lengthInMeter) {
        super(name, lengthInMeter);
    }
    // POLYMORFISM: Överskriver metod calculateLiquidRequirements för Köttätande växter.
    @Override
    public double calculateWaterRequirements() {
        return BASE_LEVEL + FAСTOR * getLengthInMeter();
    }
    // POLYMORFISM: Returnerar den vätska som gäller för Köttätande växter.
    @Override
    public WaterType getWaterType() {
        return WaterType.PROTEINDRINK;
    }
}
