package ca.nait.dmit.domin;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Calendar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

class ChineseZodiacTest {

    @ParameterizedTest
    @CsvSource(value = {
            "1900, Rat",
            "1958, Dog",
            "2023, Rabbit",
            "1997, Ox",
            "2000, Dragon"
    })

    void animal(int birthYear, String expectedBMICategory) {
        // Act
        assertEquals(expectedBMICategory, ChineseZodiac.animal(birthYear));
    }

    public static final int CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR);
    @Test
    public void testGetAnimalRat() {
        int animalYear = 1900;
        while (animalYear <= CURRENT_YEAR) {
            assertEquals("rat", ChineseZodiac.animal( animalYear ).toLowerCase() );
            animalYear += 12;
        }
    }
    @Test
    public void testGetAnimalOx() {
        int animalYear = 1901;
        while (animalYear <= CURRENT_YEAR) {
            assertEquals("ox", ChineseZodiac.animal( animalYear ).toLowerCase() );
            animalYear += 12;
        }
    }
    @Test
    public void testGetAnimalTiger() {
        int animalYear = 1902;
        while (animalYear <= CURRENT_YEAR) {
            assertEquals("tiger", ChineseZodiac.animal( animalYear ).toLowerCase() );
            animalYear += 12;
        }
    }
    @Test
    public void testGetAnimalRabbit() {
        int animalYear = 1903;
        while (animalYear <= CURRENT_YEAR) {
            assertEquals("rabbit", ChineseZodiac.animal( animalYear ).toLowerCase() );
            animalYear += 12;
        }
    }
    @Test
    public void testGetAnimalDragon() {
        int animalYear = 1904;
        while (animalYear <= CURRENT_YEAR) {
            assertEquals("dragon", ChineseZodiac.animal( animalYear ).toLowerCase() );
            animalYear += 12;
        }
    }
    @Test
    public void testGetAnimalSnake() {
        int animalYear = 1905;
        while (animalYear <= CURRENT_YEAR) {
            assertEquals("snake", ChineseZodiac.animal( animalYear ).toLowerCase() );
            animalYear += 12;
        }
    }

    @Test
    public void testGetAnimalHorse() {
        int animalYear = 1906;
        while (animalYear <= CURRENT_YEAR) {
            assertEquals("horse", ChineseZodiac.animal( animalYear ).toLowerCase() );
            animalYear += 12;
        }
    }
    @Test
    public void testGetAnimalGoat() {
        int animalYear = 1907;
        while (animalYear <= CURRENT_YEAR) {
            assertEquals("goat", ChineseZodiac.animal( animalYear ).toLowerCase() );
            animalYear += 12;
        }
    }
    @Test
    public void testGetAnimalMonkey() {
        int animalYear = 1908;
        while (animalYear <= CURRENT_YEAR) {
            assertEquals("monkey", ChineseZodiac.animal( animalYear ).toLowerCase() );
            animalYear += 12;
        }
    }
    @Test
    public void testGetAnimalRooster() {
        int animalYear = 1909;
        while (animalYear <= CURRENT_YEAR) {
            assertEquals("rooster", ChineseZodiac.animal( animalYear ).toLowerCase() );
            animalYear += 12;
        }
    }
    @Test
    public void testGetAnimalDog() {
        int animalYear = 1910;
        while (animalYear <= CURRENT_YEAR) {
            assertEquals("dog", ChineseZodiac.animal( animalYear ).toLowerCase() );
            animalYear += 12;
        }
    }
    @Test
    public void testGetAnimalPig() {
        int animalYear = 1911;
        while (animalYear <= CURRENT_YEAR) {
            assertEquals("pig", ChineseZodiac.animal( animalYear ).toLowerCase() );
            animalYear += 12;
        }
    }

}