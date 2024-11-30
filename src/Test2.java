import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        String text = text();
        System.out.println(text);
    }

    public static String text() {
        String result;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите два числа через пробел: ");
        String inputLine = scanner.nextLine(); // Считываем всю строку
        String[] inputs = inputLine.split(" "); // Разбиваем строку по пробелам

        // Преобразуем строки в числа
        Integer input1 = Integer.parseInt(inputs[0]);
        Integer input2 = Integer.parseInt(inputs[1]);

        if (input1 > input2) {
            result = "Первое число больше";
        } else if (input1 < input2) {
            result = "Второе число больше";
        } else {
            result = "Числа равны";
        }
        return result;
    }
}
