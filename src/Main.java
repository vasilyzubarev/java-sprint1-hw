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
                System.out.println("Укажите день за который хотите ввести количество шагов:");
                int day = scanner.nextInt();
                System.out.println("Введите количество пройденных шагов:");
                int step = scanner.nextInt();
                track.saveData(month, day, step);
                System.out.println("Спасибо, данные сохранены");
            } else if (point == 2) {
                System.out.println("Напишите номер месяца за который хотите получить статистику в формате 1-12, где 1 - январь, 2 - февраль, и тд");
                int numberMonth = scanner.nextInt();
                System.out.println("Ваша статистика за " + numberMonth + " месяц:");
                track.calculateStatistics(numberMonth);
            } else if (point == 4) {
                System.out.println("Выход");
                break;
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
