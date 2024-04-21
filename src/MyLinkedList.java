import java.util.Iterator;

public class MyLinkedList<E> implements Mylist<E>{

    private class MyNode{
        MyNode next;
        MyNode prev;
        E element;
        MyNode(E element){
            this.element = element;
            this.next = null;
            this.prev = null;
        }
    }

    private int length;
    private MyNode head;
    private MyNode tail;

    public MyLinkedList() {
        head = null;
        tail = null;
        length = 0;
    }
    @Override
    public void add(E item) {
        MyNode node = new MyNode(item);
        if(head == null){
            head =tail = node;
        }
        else{
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        length++;
    }

    @Override
    public void set(int index, E item) {
        MyNode node = new MyNode(item);
        if(index < 0 || index >= length){
            throw new IndexOutOfBoundsException();
        }
        MyNode current = head;
        for (int i = 0; i < index; i++){
            current = current.next;
        }
        current.element = item;
    }

    @Override
    public void add(int index, E item) {
        MyNode node = new MyNode(item);
        if(index < 0 || index >= length){
            throw new IndexOutOfBoundsException();
        }
        MyNode current = head;
        for (int i = 0; i < index - 1; i++){
            current = current.next;
        }
        node.next = current.next;
        node.prev = current;
        current.next.prev = node;
        current.next = node;
        length++;
    }

    @Override
    public void addFirst(E item) {
        MyNode node = new MyNode(item);
        node.next = head;
        head = node;
        length++;
    }

    @Override
    public void addLast(E item) {
        MyNode node = new MyNode(item);
        node.next = tail;
        tail = node;
        length++;
    }

    @Override
    public E get(int index) {
        if(index < 0 || index >= length){
            throw new IndexOutOfBoundsException();
        }
        MyNode current = head;
        for (int i = 0; i < index; i++){
            current = current.next;
        }
        return current.element;
    }

    @Override
    public E getFirst() {
        return head.element;
    }

    @Override
    public E getLast() {
        return tail.element;
    }

    @Override
    public void remove(int index) {
        if(index < 0 || index >= length){
            throw new IndexOutOfBoundsException();
        }
        if(head == tail){
            head = tail = null;
        }
        else{
            MyNode current = head;
            for (int i = 0; i < index; i++){
                current = current.next;
            }
        }
    }

    @Override
    public void removeFirst() {
        if(head == tail){
            head = tail = null;
        }
        else{
            head = head.next;
        }
        length--;
    }

    @Override
    public void removeLast() {
        if(head == tail){
            head = tail = null;
        }
        else{
           tail = tail.prev;
           tail.next = null;
        }
        length--;
    }

    @Override
    public void sort() {
        if (head == null || head.next == null) {
            return;
        }
        boolean swapped;
        do{
            swapped = false;
            MyNode current = head;
            while (current.next != null){
                if (((Comparable)current.element).compareTo(current.next.element) > 0){
                    E temp = current.element;
                    current.element = current.next.element;
                    current.next.element = temp;
                    swapped = true;
                }
                current = current.next;
            }
        }while (swapped);
    }

    @Override
    public int indexOf(Object object) {
        MyNode current = head;
        for (int i = 0; i < length; i++){
            if(object == current.element){
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        MyNode current = tail;
        for (int i = length - 1; i >=0; i--){
            if(object == current.element){
                return i;
            }
            current = current.prev;
        }
        return -1;
    }

    @Override
    public boolean exists(Object object) {
        MyNode current = head;
        for (int i = 0; i < length; i++){
            if(object == current.element){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[length];
        MyNode current = head;
        for (int i = 0; i < length; i++){
            array[i] = current.element;
            current = current.next;
        }
        return array;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
