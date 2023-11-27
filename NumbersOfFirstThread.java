import java.util.Stack;

public class NumbersOfFirstThread extends Thread {

    public Stack<Integer> stack;
    int max = 10; // верхняя граница для генерации числа
    int min = 1; // нижняя граница для генрации числа
    int amountOfNumbers; // кол-во элементов арифметической прогрессии для вывода

    public NumbersOfFirstThread(Stack<Integer> stack, int amountOfNumbers) {
        this.stack = stack;
        this.amountOfNumbers = amountOfNumbers;
    }

    @Override
    public void run() {
        int k = 0;

        for (int x = 1; x <= amountOfNumbers; x++) {

            try {
                int s = 3; // шаг
                int random_number1 = min + (int) (Math.random() * max); // Генерация случайного числа

                Thread.sleep(1000 * random_number1);

                k = k + s;

                stack.push(k);

                System.out.println("NumbersOfFirstThread: " + k + " ");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
