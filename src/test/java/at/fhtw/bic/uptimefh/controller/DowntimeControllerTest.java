package at.fhtw.bic.uptimefh.controller;

import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DowntimeControllerTest {
    @Test
    public void calculateDowntimeMinutes_whenZerothenZero() {
        // Arrange
        DowntimeController controller = new DowntimeController();

        // Act
        double result = controller.calculateDowntimeMinutes(0.0);

        // Assert
        assertEquals(0.0, result);
    }

    @Test
    public void calculateDowntimeMinutes_whenNegativethenthrowZero(){
        DowntimeController controller = new DowntimeController();


        // Assert
        assertThrows(InvalidParameterException.class, () -> {
            double result = controller.calculateDowntimeMinutes(-10);
        });
    }
//Kommentar2231

    @Test
    public void calculateDowntimeMinutes_whenGreaterthan100() {
        // Arrange
        DowntimeController controller = new DowntimeController();

        // Assert
        assertThrows(InvalidParameterException.class, () -> {
            double result = controller.calculateDowntimeMinutes(110);
        });
    }


}
