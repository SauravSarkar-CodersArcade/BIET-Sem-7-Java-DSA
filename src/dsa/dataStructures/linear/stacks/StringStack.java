package dsa.dataStructures.linear.stacks;
public class StringStack {
    private static final int MAX_SIZE = 100;
    private String[] arr = new String[MAX_SIZE];
    private int top = -1; // Empty stack in the beginning
    public void push(String data){
        if(top == MAX_SIZE-1){
            System.out.println("Stack Overflow.");
            return;
        }
        arr[++top] = data;
        System.out.println("Pushed: " + data);
    }
    public String pop(){
        if(top == -1){
            System.out.println("Stack Underflow.");
            return null;
        }
        String popped = arr[top--];
        System.out.println("Popped: " + popped);
        return popped;
    }
    public String peek(){ // Displays the top if available
        if(top == -1){
            System.out.println("Stack Underflow.");
            return null;
        }
        return arr[top];
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == MAX_SIZE - 1;
    }
    public int size(){
        return top + 1;
    }
    public void displayStack(){
        if(isEmpty()){
            System.out.println("Stack Underflow...!!!");
            return;
        }
        for(int i=0; i<=top; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        StringStack stringStack = new StringStack();
        stringStack.push("Apple");
        stringStack.push("Avocado");
        stringStack.displayStack();
        System.out.println("Top Element: " + stringStack.peek());
        stringStack.pop();
        stringStack.displayStack();
        System.out.println("Size: " + stringStack.size());
        System.out.println(stringStack.isEmpty());
        String[] words = {"Mango", "Banana", "Pineapple"};
        for (String word : words){
            stringStack.push(word);
        }
        stringStack.displayStack();
    }
}
