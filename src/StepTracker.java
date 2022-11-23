public class StepTracker {
    Month[] months = new Month[13]; // создали массив с типом данных MonthData, и заполнили месяцами
    int numberOfDays = 30;
    int stepsGoal = 10_000;     // сделать метод для изменения цели на месяц


    StepTracker() {
        for (int i = 0; i < months.length; i++) {
            months[i] = new Month();
        }
    }

    public void saveData(int month, int day, int steps) {
        months[month].days[day] = steps;
    }

    public void calculateStatistics(int month) {    // разбить по методам, отдельный метод для лучшей серии, отдельный для суммы шагов и тд
        int allSteps = 0;
        int maxDays = 0;
        int currentDays = 0;
        for (int i = 0; i < numberOfDays; i++) {
            int steps = months[month].days[i];
            if (i < numberOfDays - 1) {
                System.out.print((i + 1) + " день: " + steps + ", ");
            } else {
                System.out.print((i + 1) + " день: " + steps);
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
        System.out.println("Общее количество шагов за месяц " + allSteps);
        System.out.println("Среднее количество шагов за месяц " + allSteps / numberOfDays);
        System.out.println("Лучшая серия длилась " + maxDays);
    }

    class Month {
        int[] days = new int[numberOfDays];
    }

}







