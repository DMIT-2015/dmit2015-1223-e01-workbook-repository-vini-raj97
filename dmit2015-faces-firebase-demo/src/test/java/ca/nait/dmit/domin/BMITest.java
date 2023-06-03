package ca.nait.dmit.domin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BMITest {

    @ParameterizedTest
    @CsvSource(value = {
            "100, 66, 16.1, underweight",
            "140, 66, 22.6, normal",
            "175, 66, 28.2, overweight",
            "200, 66, 32.3, obese",
            "150, 50, 42.2, obese"
    })

    void bmi(int weight, int height, double expectedBMI, String expectedBMICategory) {
        // Arrange
        BMI currentBMI = new BMI();
        // Act
        currentBMI.setWeight(weight);
        currentBMI.setHeight(height);
        // Assert
//        assertEquals(expectedBMI, currentBMI.bmi());
        assertThat(currentBMI.bmi())
                .isEqualTo(expectedBMI, withPrecision(1d));

        assertEquals(expectedBMICategory, currentBMI.bmiCategory());
    }
}