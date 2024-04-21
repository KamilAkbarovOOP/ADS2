public class MyMinHeap <T>{
    private MyArrayList<T> arrayList;
    public MyMinHeap(){
        arrayList = new MyArrayList<>();
    }

    public boolean empty(){
        return arrayList.size() <= 0;
    }

    public int size(){
        return arrayList.size() - 1;
    }

    public T getMin(){
        if (empty()){
            return null;
        }
        return (T) arrayList.get(1);
    }

    public T extractMin(){
        if (empty()){
            return null;
        }
        T min = (T) arrayList.getFirst();
        T last = (T) arrayList.getLast();
        arrayList.removeLast();
        if(!empty()){
            arrayList.addFirst(last);
            heapify(1);
        }
        return min;
    }

    public void insert(T item){
        arrayList.add(item);
        if(size() == 1){
            return;
        }
        traverseUp(size());
    }




    private void heapify(int index){
        int right = rightChildOf(index);
        int left = leftChildOf(index);
        int min = index;

        if(index < arrayList.size() && ((Comparable)arrayList.get(right)).compareTo(arrayList.get(index)) < 0){
            min = right;
        }

        if(index < arrayList.size() && ((Comparable)arrayList.get(left)).compareTo(arrayList.get(index)) < 0){
            min = left;
        }

        if(min != index){
            swap(index, min);
            heapify(min);
        }
    }

    private void traverseUp(int index){
        while (index > 0 && ((Comparable)arrayList.get(parentOf(index))).compareTo(arrayList.get(index)) > 0){
            swap(parentOf(index), index);
            index = parentOf(index);
        }
    }

    private int leftChildOf(int index){
        return index * 2 ;
    }

    private int rightChildOf(int index){
        return index * 2 + 1;
    }

    private int parentOf(int index){
        return index/2;
    }

    private void swap(int index1, int index2){
        T temp = (T) arrayList.get(index1);
        arrayList.set(index1, arrayList.get(index2));
        arrayList.set(index2, temp);
    }
}
