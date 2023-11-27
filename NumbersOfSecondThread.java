import java.util.Stack;

public class NumbersOfSecondThread extends Thread {

    public Stack<Integer> stack;
    int max = 10; // верхняя граница для генерации числа
    int min = 1; // нижняя граница для генрации числа
    int amountOfNumbers; // кол-во элементов арифметической прогрессии для вывода

    public NumbersOfSecondThread(Stack<Integer> stack, int amountOfNumbers) {
        this.stack = stack;
        this.amountOfNumbers = amountOfNumbers;
    }

    @Override
    public void run() {
        int z = 0;

        for (int x = 1; x <= amountOfNumbers; x++) {

            try {
                int b = 4; // шаг
                int random_number2 = min + (int) (Math.random() * max); // Генерация случайного числа

                Thread.sleep(1000 * random_number2);

                z = z + b;

                stack.push(z);

                System.out.println("NumbersOfSecondThread: " + z + " ");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
