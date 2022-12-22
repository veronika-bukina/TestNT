import java.util.Scanner;

public class BaseConverter {
    public static void option() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите градусы Цельсия: ");
        double c = in.nextDouble();
        System.out.println("Введите 1 для конвертации в Кельвины");
        System.out.println("Введите 2 для концертации в Фаренгейты");
        double opt = in.nextDouble();
        convert(opt, c);
    }

    static void convert(double x, double i) {
        double t = 0;
        if (x == 1) {
            t = i + 273.15;
        } else if (x == 2) {
            t = 1.8 * i + 32;
        } else {
            System.out.println("Ошибка");
            return;
        }
        System.out.println(t);
    }
}
