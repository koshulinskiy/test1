import java.lang.Object;
import java.util.*;
public class nr1 {
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        if (!stack.empty()) System.out.println("Стек не пустой");
        System.out.println("Текущий стек: " + stack);
        System.out.println("Удаляем: " + stack.pop());
        System.out.println("Последний элемент текущего стека: " + stack.peek());
        System.out.println("Текущий стек: " + stack);
        int count = stack.search(5);
        while (count > 1)
        {
            System.out.println("Удаляем: " + stack.pop());
            count--;
        }
        System.out.println("Текущий стек: " + stack);

    }
}