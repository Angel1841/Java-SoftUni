import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] expressionElements = scanner.nextLine().split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = expressionElements.length - 1; i >= 0; i--) {
            stack.push(expressionElements[i]);
        }

        while(stack.size() > 1){
            int firstNum = Integer.parseInt(stack.pop());
            String expression = stack.pop();
            int secondNum = Integer.parseInt(stack.pop());

            int result = 0;

            if(expression.equals("-")){
                result = firstNum - secondNum;
            } else{
                result = firstNum + secondNum;
            }

            stack.push(String.valueOf(result));

        }

        System.out.println(stack.pop());
    }
}
