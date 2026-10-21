package plantHotel;

// ENUM: Används för att definiera de godkända vätsketyperna på ett typsäkert sätt.
public enum WaterType {
    TAPWATER("kranvatten"),
    MINERALWATER("mineralvatten"),
    PROTEINDRINK("proteindryck");

    private final String description;

    // Inkapsling: Privat konstruktör för enumen
    WaterType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
