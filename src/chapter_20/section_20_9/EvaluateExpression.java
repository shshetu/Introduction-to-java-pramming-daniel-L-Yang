package chapter_20.section_20_9;

import java.util.Scanner;
import java.util.Stack;
// (2 + 3) * 4
public class EvaluateExpression {
    public static void main(String[] args) {
        /*// check number of arguments passed
        if (args.length != 1) {
            System.out.println("Usage: java EvaluateExpression \"expression\" ");
            System.exit(1);
        }
        try {
            System.out.println(evaluateExpression(args[0]));
        } catch (Exception ex) {
            System.out.println("Wrong expression: " + args[0]);
        }*/
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();
        try {

            System.out.println(evaluateExpression(expression));
        } catch (Exception ex) {
            System.out.println("Wrong expression: " + expression);
        }
    }

    public static int evaluateExpression(String expression) {
        // Create operandStack to store operands
        Stack<Integer> operandStack = new Stack<>();

        // Create operatorStack to store operator
        Stack<Character> operatorStack = new Stack<>();

        // Insert blanks around (, ), +, -, /, and *
        expression = insertBlanks(expression);

        // Extract operands and operators
        String[] tokens = expression.split(" "); // {(,2,3,),+,-}

        // Phase 1: Scan tokens
        for (String token:tokens) {
            if(token.length() == 0) continue; // Blank space
            else if(token.charAt(0) == '+' || token.charAt(0) == '-'){
                // Process all +,-,*,/ in the top of the operator stack
                while (!operatorStack.isEmpty() &&
                        (operatorStack.peek() == '+' ||
                operatorStack.peek() == '-' ||
                operatorStack.peek() == '*' ||
                operatorStack.peek() == '/'
                        )){
                    processAnOperator(operandStack,operatorStack);
                }
                operatorStack.pop(); // Pop the '(' symbol from the stack
            }
            else { // An operand scanned
                // Push an operand to the stack
                operandStack.push(Integer.valueOf(token));
            }
        }

        // Phase 2: Process all the remaining operators in the Stack
        while (!operatorStack.isEmpty()){
            processAnOperator(operandStack,operatorStack);
        }
        // Return the result
        return operandStack.pop();
    }

    public static void processAnOperator(Stack<Integer> operandStack, Stack<Character> operatorStack) {
    char op = operatorStack.pop();
    int op1 = operandStack.pop();
    int op2 = operandStack.pop();
    if(op == '+') operandStack.push(op2+op1);
    else if(op == '-') operandStack.push(op2 - op1);
    else if(op == '*') operandStack.push(op2 * op1);
    else if(op == '/') operandStack.push(op2 / op1);
    }

    // (2+3) -> " "(" "2" "+" "3" ")" " -> ( 2 + 3 )
    public static String insertBlanks(String expression) {
        String result = "";

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(' || expression.charAt(i) == ')' ||
                    expression.charAt(i) == '+' || expression.charAt(i) == '-' ||
                    expression.charAt(i) == '*' || expression.charAt(i) == '/') {
                result += " "+ expression.charAt(i) + " ";
            }else result += expression.charAt(i);
        }
        return result;
    }
}
