package dsa.dataStructures.linear.stacks;
import java.util.Stack;
public class BalancedParentheses {
    public static boolean isBalanced(String s){
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch); // Push opening braces onto stack
            }else {
                if(!stack.empty()){
                    if((stack.peek() == '(' && ch == ')') ||
                       (stack.peek() == '[' && ch == ']') ||
                       (stack.peek() == '{' && ch == '}')){
                        stack.pop(); // Remove matching braces
                    }else {
                        return false; // Mismatch -> False
                    }
                }
            }
        }
        // If all comparisons are done & the stack is empty -> True
        return stack.empty();
    }
    public static void main(String[] args) {
        String s1 = "{}[{}]()[()]";
        String s2 = "{]()[}";
        System.out.println(isBalanced(s1)? "Balanced" : "Imbalanced.");
        System.out.println(isBalanced(s2)? "Balanced" : "Imbalanced.");
    }
}
