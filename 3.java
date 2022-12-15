import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> arrayList = new ArrayList<>();
        System.out.println("Введите массив целых чисел (для завершения ввода команда 'quit'):");

        while (!scan.hasNext("quit")) {
            if (scan.hasNextDouble())
                arrayList.add(scan.nextDouble());
            else {
                scan.next();
                System.out.println("Введите число или команду 'quit' для выхода");
                System.out.println("Число вводится через запятую!");
            }
        }

        if (arrayList.size() == 0) {
            System.out.println("Введен нулевой массив");
            return;
        }

        double x  = arrayList.get(0);
        ArrayList<Double> resArray = new ArrayList<>();

        for (int i=0; i< arrayList.size();i++) {
            if (arrayList.get(i) >= x) {
                x = arrayList.get(i);
                resArray.add(x);
            }
        }

        System.out.println("Исходный массив: " + arrayList);
        System.out.println("Массив после обработки: " + resArray);

        scan.close();
    }
}