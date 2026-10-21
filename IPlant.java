package plantHotel;

// INTERFACE: Definierar ett kontrakt för vad alla växter måste kunna göra.
public interface IPlant {
    double calculateWaterRequirements(); // Beräknar vätskemängd i liter per dag
    WaterType getWaterType();    // Returnerar vätsketyp som enum
    String getName();            // Returnerar växtens namn
}