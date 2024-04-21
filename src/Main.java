import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        MyQueue <Integer> queue = new MyQueue<>();
        MyMinHeap <Integer> heap = new MyMinHeap<>();


        heap.insert(60);
        heap.insert(50);
        heap.insert(21);
        heap.insert(40);
        heap.insert(10);
        heap.insert(51);
        heap.insert(5);
        System.out.println(heap.extractMin());


    }
}

