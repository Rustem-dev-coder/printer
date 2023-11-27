import java.util.Stack;

public class GeneralCode {
    public static void main(String[] args) {

        int f = 2; // указываем кол-во элементов арифметической прогрессии для вывода в классе NumbersOfFirstThread
        int d = 3; // указываем кол-во элементов арифметической прогрессии для вывода в классе NumbersOfSecondThread
        int a = f + d; // общее кол-во элементов для вывода в классе NumbersPrint

        Stack<Integer> stack = new Stack<>();

        new NumbersOfFirstThread(stack, f).start();
        new NumbersOfSecondThread(stack, d).start();
        new NumbersPrint(stack, a).start();

    }
}
