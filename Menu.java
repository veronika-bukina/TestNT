import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    public void menu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберете задание с 1 по 4, для выхода выберете 5:");
        int x = in.nextInt();
        switch (x) {
            case 1:
                task1();
                break;
            case 2:
                task2();
                break;
            case 3:
                BaseConverter baseConverter = new BaseConverter();
                baseConverter.option();
                break;
            case 4:
                task4();
                break;
            case 5:
                break;
            default:
                menu();
        }
    }

    private void task1() {
        double[] num = new double[10];
        double sum = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = Math.random();
            sum += num[i];
        }
        boolean bl;
        int step = num.length - 1;
        do {
            bl = false;
            for (int i = 0; i < step; i++) {
                if (num[i] > num[i + 1]) {
                    var temp = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = temp;
                    bl = true;
                }
            }
            step--;

        } while (bl);
        System.out.println("Максимальное значение: " + num[num.length - 1]);
        System.out.println("Минимальное значение: " + num[0]);
        System.out.println("Среднее значение: " + sum / num.length);
    }

    private void task2() {
        String word = "Hello";
        char[] letters = word.toCharArray();
        Arrays.sort(letters);
        ArrayList<Character> list = new ArrayList<>();
        int k = 0;
        int i = 0;
        while (i < letters.length) {
            while (i < letters.length - 1 && letters[i] == letters[i + 1]) {
                k++;
                i++;
            }
            if (k > 0) {
                list.add(letters[i]);
                k = 0;
                i++;
            } else {
                i++;
            }
        }
        for (int z = 0; z < list.size(); z++) {
            System.out.println(list.get(z));
        }
    }

    private void task4() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите часы: ");
        int hours = in.nextInt();
        System.out.println("Введите минуты: ");
        int minutes = in.nextInt();
        int grH = 0;
        if (hours >= 12 && hours <= 23) {
            grH = (hours - 12) * 30 + minutes / 2;
        } else if (hours >= 0 && hours <= 11) {
            grH = hours * 30 + minutes / 2;
        }
        int grM = minutes * 6;
        int gr = grH - grM;

        System.out.println("Угол между часовой и минутной стрелкой равен: " + Math.abs(gr));

    }
}
