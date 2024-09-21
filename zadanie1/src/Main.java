import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> speeds = new ArrayList<>(); // Объявляем список
        speeds.add(120);
        speeds.add(75);
        speeds.add(42);
        speeds.add(60);
        speeds.add(110);
        speeds.add(20);

        int sum = 0;
        for (Integer speed : speeds) { // Проходим по каждому значению в списке
            sum += speed; // Складываем все значения
        }

        int averageSpeed = sum / speeds.size(); // Вычисляем среднюю скорость
        System.out.println("Средняя скорость равна " + averageSpeed + " км/ч");
    }
}