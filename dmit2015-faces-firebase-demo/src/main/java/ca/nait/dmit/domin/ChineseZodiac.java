package ca.nait.dmit.domin;

/**
 * In the Chinese calendar, every year is associated with a particular animal. The 12-year animal cycle is rat, ox, tiger,
 * rabbit, dragon, snake, horse, goat (or ram), monkey, rooster, dog, and pig (or boar). The year 1900 is a year of the rat;
 * thus 1901 is a year of the ox and 1912 is another year of the rat. If you know in what year person was born, you can
 * compute the offset from 1900 and determine the animal associated with that person's year of birth.
 *
 * This class provides methods to calculate the Chinese zodiac animal for a given year after calculating the offset.
 *
 * @author Vinitha Rajagopal
 * @version 2023.05.31
 */
public class ChineseZodiac {

    /**
     * Write the code to implement the static method animal. The animal can be calculated by subtracting 1900 from
     * the birth year and then calculate the offset from 12. The offset from a number is the remainder from dividing by a
     * number. You can use the modulo operator (%) to get the remainder from a division. The animal for the offset is
     * shown on Figure 5. You can use an if statement or an switch statement or an string array to determine the animal
     * using the offset.
     *
     * @param birthYear
     * @return one of following: Rat, Ox, Tiger, Rabbit, Dragon...
     */
    static String animal(int birthYear) {
        String value = "";
        int offset = (birthYear - 1900) % 12;

        if(offset == 0 ) {
           value = "Rat";
        } else if(offset == 1 ) {
            value = "Ox";
        } else if(offset == 2 ) {
            value = "Tiger";
        } else if(offset == 3 ) {
            value = "Rabbit";
        } else if(offset == 4 ) {
            value = "Dragon";
        } else if(offset == 5 ) {
            value = "Snake";
        } else if(offset == 6 ) {
            value = "Horse";
        } else if(offset == 7 ) {
            value = "Goat";
        } else if(offset == 8 ) {
            value = "Monkey";
        } else if(offset == 9 ) {
            value = "Rooster";
        } else if(offset == 10 ) {
            value = "Dog";
        } else {
            value = "pig";

        }

        return value;
    }

}
