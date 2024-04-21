public class MyQueue<T> {
    private MyLinkedList<T> linkedList;

    public MyQueue() {
    linkedList = new MyLinkedList<>();
    }

    public boolean empty(){
        return linkedList.size() <= 0;
    }

    public int size(){
        return linkedList.size();
    }

    public T peek(){
        return (T) linkedList.get(linkedList.size() - 1);
    }

    public void enqueue(T item){
        linkedList.add(item);
    }

    public void dequeue(){
        linkedList.removeFirst();
    }
}
