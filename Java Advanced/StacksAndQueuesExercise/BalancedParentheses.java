import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("");

        ArrayDeque<String> stack = new ArrayDeque<>();

        for (var sym: line) {

            if(!stack.isEmpty()){
                if(stack.peek().equals("(") && sym.equals(")") ){
                    stack.pop();
                    continue;
                }
                else if (stack.peek().equals("{") && sym.equals("}") )
                {
                    stack.pop();
                    continue;
                }
                else if (stack.peek().equals("[") && sym.equals("]") )
                {
                    stack.pop();
                    continue;
                }
            }
            stack.push(sym);
        }

        if(stack.isEmpty()){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }

    }
}
