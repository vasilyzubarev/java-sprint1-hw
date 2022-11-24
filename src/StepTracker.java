public class StepTracker {
    Month[] months = new Month[12]; // создали массив с типом данных MonthData, и заполнили месяцами
    int numberOfDays = 30;
    int stepsGoal = 10_000;
    Converter convert = new Converter();


    StepTracker() {
        for (int i = 0; i < months.length; i++) {
            months[i] = new Month();
        }
    }

    public void saveData(int month, int day, int steps) {
        months[month].days[day-1] = steps;
    }

    public void changeStepGoals(int goal) {
        stepsGoal = goal;
    }

    public void calculateStatistics(int month) {
        int allSteps = 0;
        int maxDays = 0;
        int currentDays = 0;
        for (int i = 0; i < numberOfDays; i++) {
            int steps = months[month].days[i];
            if (i < numberOfDays - 1) {
                System.out.print((i+1) + " день: " + steps + ", ");
            } else {
                System.out.print((i+1) + " день: " + steps);
            }
            if (steps >= stepsGoal) {
                currentDays += 1;
                if (currentDays > maxDays) {
                    maxDays = currentDays;
                }
            } else {
                currentDays = 0;
            }
            allSteps = allSteps + steps;
        }
        System.out.println();
        System.out.println("Общее количество шагов за месяц: " + allSteps);
        System.out.println("Среднее количество шагов за месяц: " + allSteps / (numberOfDays-1));
        System.out.println("Лучшая серия длилась: " + maxDays + " дня");
        double lol = convert.stepsInKilometers(allSteps);
        System.out.println("Пройденное расстояние: " + lol + "км");
        double kal = convert.caloriesCounter(allSteps);
        System.out.println("Количество соженных килокалорий: " + kal);
    }

    class Month {
        int[] days = new int[numberOfDays];
    }

}






