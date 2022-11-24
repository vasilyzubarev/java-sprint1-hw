import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker track = new StepTracker();


        while (true) {
            menu();

            int point = scanner.nextInt();
            if (point == 1) {
                System.out.println("Укажите месяц за который хотите ввести количество шагов:");
                int month = scanner.nextInt();
                while (month < 0 || month > 11) {
                    System.out.print("Неправильный формат ввода! Введите номер месяца от 0 до 11: ");
                    month = scanner.nextInt();
                }
                System.out.println("Укажите день за который хотите ввести количество шагов: ");
                int day = scanner.nextInt();

                while (day <= 0 || day > 30) {
                    System.out.print("Ошибка! Введите число от 1 до 30: ");
                    day = scanner.nextInt();
                }
                System.out.println("Введите количество пройденных шагов:");
                int step = scanner.nextInt();
                track.saveData(month, day, step);
                System.out.println("Спасибо, данные сохранены");
            } else if (point == 2) {
                System.out.println("Напишите номер месяца за который хотите получить статистику в формате 0-11, где 0 - январь, 1 - февраль, и тд");
                int numberMonth = scanner.nextInt();
                while (numberMonth < 0 || numberMonth > 11) {
                    System.out.print("Неправильный формат ввода! Введите номер месяца от 0 до 11: ");
                    numberMonth = scanner.nextInt();
                }
                System.out.println("Ваша статистика за " + numberMonth + " месяц:");
                track.calculateStatistics(numberMonth);
            } else if (point == 3) {
                System.out.println("Введите новую цель по количеству шагов в день: ");
                int goal = scanner.nextInt();
                while (goal <= 0) {
                    System.out.println("Введите цель больше нуля, ходить полезно:)");
                    goal = scanner.nextInt();
                }
                track.changeStepGoals(goal);
                System.out.println("Новая цель установлена, удачи!");
            } else if (point == 4) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Такой команды нет, пожалуйста введите число от 1 до 4");

            }
        }
    }


    public static void menu() {
        System.out.println("Что вы хотите сделать?");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов за день");
        System.out.println("4 - Выход");
    }
}
