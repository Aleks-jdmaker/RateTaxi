import java.util.Scanner;

public class RateTaxi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Оцените работу приложения Зеленоглазое-Такси по шкале от 1 до 3");

        while (true) { // Запускаем бесконечный цикл
            int x = scanner.nextInt(); // Получаем оценку от пользователя

            if (x == 1) { //Если пользователь вводит 1
                System.out.println("Спасибо за вашу оценку. Мы станем лучше!"); // Благодарим
                break; // Выходим из цикла
            }
            if (x == 2) { // Если оценка равна 2
                System.out.println("Спасибо за вашу оценку. Есть куда расти!");
                break; // И выходим из цикла
            }
            if (x == 3) { // Если оценка равна 3
                System.out.println("Спасибо за высокую оценку! Рады, что вы выбрали нас!");
                break; // И выходим из цикла
            }
            // Пользователь ввёл не 1, 2 или 3 - повторяем просьбу
            System.out.println("Ваша оценка должна быть в диапазоне от 1 до 3");
        }
    }
}