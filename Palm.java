package plantHotel;
// ÄRV: Subklassen Palm ärver variabler och metoder från Superklassen Plant.
public class Palm extends Plant {
    // KONSTANTER: Inga hårdkodade siffror i beräkningen.
    private static final double FACTOR = 0.5;
    //KONSTRUKTÖR:
    public Palm(String name, double lengthInMeter) {
        super(name, lengthInMeter);
    }
    // POLYMORFISM: Överskriver metod calculateWaterRequirements för Palmer.
    @Override
    public double calculateWaterRequirements() {
        return FACTOR * getLengthInMeter();
    }
    // POLYMORFISM: Returnerar den vätska som gäller för Palmer.
    @Override
    public WaterType getWaterType() {
        return WaterType.TAPWATER;
    }
}
