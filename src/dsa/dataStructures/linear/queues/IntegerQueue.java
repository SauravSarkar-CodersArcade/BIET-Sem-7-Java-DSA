package dsa.dataStructures.linear.queues;
public class IntegerQueue {
    private static final int MAX_SIZE = 100;
    private int[] arr = new int[MAX_SIZE];
    private int front;
    private int rear;
    public IntegerQueue(){
        front = rear = -1; // Empty
    }
    public boolean isEmpty(){
        return (front == -1 && rear == -1);
    }
    public boolean isFull(){
        return rear == MAX_SIZE - 1;
    }
    public void enqueue(int item){
        if(isFull()){
            System.out.println("Queue is full.");
            return;
        }
        else if(isEmpty()){
            front = rear = 0;
        }else {
            rear++;
        }
        arr[rear] = item;
        System.out.println("Enqueued: " + item);
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty.");
            return;
        }
        else if(front == rear){
            front = rear = -1;
        }
        else {
            front++;
        }
    }
    public int getFront(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
    public int getRear() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[rear];
    }
    public void displayQueueElements(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        for (int i=front; i<=rear; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        IntegerQueue queue = new IntegerQueue();
        int[] arr = {2,4,1,3,6,7};
        for (int x : arr){
            queue.enqueue(x);
        }
        queue.displayQueueElements();
        System.out.println("Front Element: " + queue.getFront());
        System.out.println("Rear Element: " + queue.getRear());
    }
}
