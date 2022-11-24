public class Converter {
    double kilometers;

    public double stepsInKilometers(int steps) {
        kilometers = (steps * 75.0) / 100_000.0;
        return kilometers;
    }

    public double caloriesCounter(int steps) {
        double calorie = steps * 50;
        double kiloCalories = calorie / 1000.0;
        return kiloCalories;
    }

}
