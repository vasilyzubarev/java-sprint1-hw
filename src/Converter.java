public class Converter {
    double stepLength = 75.0;
    double centimetersInKilometers = 100_000.0;
    int calorieInStep = 50;
    double calorieInKilocalories = 1000.0;

    public double stepsInKilometers(int steps) {
        double kilometers = (steps * stepLength) / centimetersInKilometers;
        return kilometers;
    }

    public double caloriesCounter(int steps) {
        double calorie = steps * calorieInStep;
        double kiloCalories = calorie / calorieInKilocalories;
        return kiloCalories;
    }

}
