package plantHotel;
// ÄRV: Subklassen Cactus ärver variabler och metoder från Superklassen Plant
public class Cactus extends Plant {
    // KONSTANTER: 2 cl = 0.02 liter.
    private static final double FIXED_QUANTITY_LITERS = 0.02;
    public Cactus(String name, double lengthInMeter) {
        super(name, lengthInMeter);
    }
    // POLYMORFISM: Överskriver metod calculateWaterRequirements för Kaktusar.
    @Override
    public double calculateWaterRequirements() {
        return FIXED_QUANTITY_LITERS;
    }
    // POLYMORFISM: Returnerar den vätska som gäller för Kaktusar.
    @Override
    public WaterType getWaterType() {
        return WaterType.MINERALWATER;
    }
}