package ca.nait.dmit.domin;


/**
 * This class is used to calculate a person's body mass index (BMI) and their BMI Category.
 * @author yourFirstName yourLastName
 * @version 2015.01.16
 */
public class BMI {

    private int weight;
    private int height;
//    public int getWeight() {
//        return weight;
//    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

//    public int getHeight() {
//        return height;
//    }

    public void setHeight(int height) {
        this.height = height;
    }

    public BMI() {
        weight = 1;
        height = 1;

    }

    public BMI(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    /**
     * Calculate the body mass index (BMI) using the weight and height of the person.
     * The BMI of a person is calculated using the formula: BMI = 700 * weight / (height * height)
     * where weight is in pounds and height is in inches.
     * @return the body mass index (BMI) value of the person
     */
    public double bmi() {
        return ((double) (703 * weight) / (height * height));
    }

    /**
     * Determines the BMI Category of the person using their BMI value and
     * comparing it against the following table.
     * <table>
     * <thead>
     * <tr>
     * <th>BMI Range</th>
     * <th>BMI Category</th>
     * </tr>
     * </thead>
     * <tbody>
     * <tr>
     * <td>< 18.5</td>
     * <td>underweight</td>
     * </tr>
     * <tr>
     * <td>>= 18.5 and < 25</td>
     * <td>normal</td>
     * </tr>
     * <tr>
     * <td>>= 25 and < 30</td>
     * <td>overweight</td>
     3.
     <a href="http://localhost:8080/javawockee-web/sections/dmit2015/winter2016/exe">...</a>...
     3 of 4 1/13/2016 5:21 PM
     * </tr>
     * <tr>
     * <td>>= 30</td>
     * <td>obese</td>
     * </tr>
     * </tbody>
     * </table>
     *
     * @return one of following: underweight, normal, overweight, obese.
     */

    public String bmiCategory() {
        String value = "";
        if (bmi() < 18.5){
            value = "underweight";
        } else if ((bmi() > 18.5) && (bmi() <= 24.9)){
            value = "normal";
        } else if ((bmi() >= 25) && (bmi() <= 29.9)){
            value = "overweight";
        } else if (bmi() >= 30){
            value = "obese";
        } else {
            throw new RuntimeException("inappropriate bmi");
        }
        return value;
    }
}
