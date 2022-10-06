package Sem4;

import java.util.Stack; 
import java.lang.StringBuilder;
 
class Infix {
 
    public static void main(String[] args) {
        String infix = "1 * ( 12 + 23 ) - ( 4 / 5 )";
        String postfix = convert(infix);
        System.out.println(postfix);
    }
 
    public static String convert(String expression) {
      
        StringBuilder sb = new StringBuilder();
 

        Stack<Character> op = new Stack<Character>();
 
       
        char[] chars = expression.toCharArray();
 
      
        int N = chars.length;
 
        for (int i = 0; i < N; i++) {
            char ch = chars[i];
 
            if (Character.isDigit(ch)) {
               
                while (Character.isDigit(chars[i])) {
                    sb.append(chars[i++]);
                }
                
                sb.append(' ');
            } else if (ch == '(') {
                
                op.push(ch);
            } else if (ch == ')') {
                
                while (op.peek() != '(') {
                    sb.append(op.pop()).append(' ');
                }
                op.pop();
            } else if (isOperator(ch)) {
                
                while (!op.isEmpty() && priority(op.peek()) >= priority(ch)) {
                    sb.append(op.pop()).append(' ');
                }
                op.push(ch);
            }
        }
 
        
        while(!op.isEmpty()) {
            sb.append(op.pop()).append(' ');
        }
 
        return sb.toString();
    }
 
   
    private static boolean isOperator(char ch) {
        return ch == '^' || ch == '*' || ch == '/' || ch == '+' || ch == '-';
    }
 
 
    private static int priority(char operator) {
        switch (operator) {
            case '^' : return 3;
            case '*' :
            case '/' : return 2;
            case '+' :
            case '-' : return 1;
        }
        return 0;
    }
 
}
