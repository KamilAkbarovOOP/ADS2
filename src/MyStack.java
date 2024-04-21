public class MyStack <T>{
    private final MyArrayList<T> arrayList;

    public MyStack(){
        arrayList = new MyArrayList<>();
    }

    public boolean empty(){
        return arrayList.size() <= 0;
    }

    public int size(){
        return arrayList.size();
    }

    public T peek(){
        return (T) arrayList.get(arrayList.size() - 1);
    }

    public void push(T item){
        arrayList.add(item);
    }

    public void pop(){
        arrayList.removeLast();
    }
}
