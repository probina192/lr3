import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Введите массив целых чисел (для завершения ввода команда 'quit'):");

        while (!scan.hasNext("quit")) {
            if (scan.hasNextInt())
                arrayList.add(scan.nextInt());
            else {
                scan.next();
                System.out.println("Введите целое число или команду 'quit' для выхода");
            }
        }
        if (scan.hasNext("quit"))
            scan.next();
        System.out.print("Число для удаления: ");
        int x  = scan.nextInt();
        ArrayList<Integer> resArray = new ArrayList<>();

        for (int i=0; i< arrayList.size();i++) {
            if (arrayList.get(i) != x)
                resArray.add(arrayList.get(i));
        }

        System.out.println("Исходный массив: " + arrayList);
        System.out.println("Массив после обработки: " + resArray);

        scan.close();
    }
}