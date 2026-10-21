package plantHotel;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Main {

    // KONSTANTER (VG-krav): Alla strängar lagras som konstanter för att undvika hårdkodade värden.
    private static final String QUESTION_PROMPT = "Vilken växt ska få vätska?";
    private static final String TITLE_QUESTION = "Växthotellet Greenest";
    private static final String WRONG_PLANT = "Hittade ingen växt med namnet: ";
    private static final String WRONG_EMPTY_INPUT = "Du måste skriva in ett växtnamn.";
    private static final String TITLE_WRONG = "Felaktig inmatning";
    private static final String ANSWER_FORMAT = "%s ska få %.2f liter %s per dag.";

    public static void main(String[] args) {

        // POLYMORFISM: Listan innehåller IVaxt-gränssnittet, men lagrar olika objekttyper.
        List<IPlant> hotelPlant = new ArrayList<>();
        hotelPlant.add(new Cactus("Igge", 0.20));
        hotelPlant.add(new Palm("Laura", 5.0));
        hotelPlant.add(new CarnivorousPlant("Meatloaf", 0.70));
        hotelPlant.add(new Palm("Olof", 1.0));

        // Inmatningsdialog
        String input = JOptionPane.showInputDialog(
                null,
                QUESTION_PROMPT,
                TITLE_QUESTION,
                JOptionPane.QUESTION_MESSAGE
        );

        // FELHANTERING: Hanterar om användaren trycker Cancel eller stänger fönstret
        if (input == null) {
            System.exit(0);
        }

        String clearedInput = input.trim();

        // FELHANTERING: Hanterar tom inmatning
        if (clearedInput.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    WRONG_EMPTY_INPUT,
                    TITLE_WRONG,
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        // Sök efter växten (skiftlägesoberoende)
        IPlant foundPlant = null;
        for (IPlant plant : hotelPlant) {
            if (plant.getName().equalsIgnoreCase(clearedInput)) {
                foundPlant = plant;
                break;
            }
        }

        // FELHANTERING: Om växtnamnet inte hittas (eller om användaren skrev siffror/konstiga tecken)
        if (foundPlant == null) {
            JOptionPane.showMessageDialog(
                    null,
                    WRONG_PLANT + clearedInput,
                    TITLE_WRONG,
                    JOptionPane.ERROR_MESSAGE
            );
        } else {
            // POLYMORFISM: Anropar calculateWaterRequirements() och getWaterType() utan att veta exakt klass.
            double water = foundPlant.calculateWaterRequirements();
            String waterName = foundPlant.getWaterType().getDescription();

            String message = String.format(ANSWER_FORMAT, foundPlant.getName(), water, waterName);

            JOptionPane.showMessageDialog(
                    null,
                    message,
                    TITLE_WRONG,
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}