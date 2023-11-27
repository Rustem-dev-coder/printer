import java.util.Stack;

public class NumbersPrint extends Thread {

    public Stack<Integer> stack;
    int max = 10;
    int min = 1;
    int amountOfNumbers;

    public NumbersPrint(Stack<Integer> stack, int amountOfNumbers) {
        this.stack = stack;
        this.amountOfNumbers = amountOfNumbers;
    }

    @Override
    public void run() {
        for (int s = 0; s <= amountOfNumbers; s++) {

            try {
                int random = min + (int) (Math.random() * max); // Генерация случайного числа для окна печати

                if (!stack.empty()) {
                    System.out.println("NumbersPrint: " +  stack.pop());
                }

                Thread.sleep(1000 * random);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
