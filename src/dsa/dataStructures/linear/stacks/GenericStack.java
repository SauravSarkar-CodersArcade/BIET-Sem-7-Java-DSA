package dsa.dataStructures.linear.stacks;
public class GenericStack<T> {
    private static final int MAX_SIZE = 100;
    // We use object because it is the parent of all classes
    private Object[] arr = new Object[MAX_SIZE];
    private int top = -1;
    public void push(T data){
        if(top == MAX_SIZE-1){
            System.out.println("Stack Overflow.");
            return;
        }
        arr[++top] = data;
        System.out.println("Pushed: " + data);
    }
    public T pop(){
        if(top == -1){
            System.out.println("Stack Underflow.");
            return null;
        }
        T popped = (T) arr[top--];
        System.out.println("Popped: " + popped);
        return popped;
    }
    public T peek(){
        if(top == -1){
            System.out.println("Stack Underflow.");
            return null;
        }
        return (T) arr[top];
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
        GenericStack<Integer> integers = new GenericStack<>();
        integers.push(1);
        GenericStack<String> strings = new GenericStack<>();
        strings.push("Java");
        GenericStack<Boolean> booleans = new GenericStack<>();
        booleans.push(true);
        booleans.displayStack();
    }
}
