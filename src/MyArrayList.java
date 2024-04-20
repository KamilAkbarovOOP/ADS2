import java.util.Iterator;

public class MyArrayList <T> implements Mylist{
    private Object[] array;
    private int MAX_SIZE = 10;
    private int length = 0;


    //Declaration of an arraylist
    public MyArrayList (){
        array = new Object [MAX_SIZE];
    }


    //Adding a new item in an arraylist
    @Override
    public void add (Object item){
        if (length == MAX_SIZE){
            IncreaseLength();
        }
        array[length++] = item;
    }


    //Putting item on place of another item by its index
    @Override
    public void set(int index, Object item) {
        if(index >= 0 && index <length) {
            array[index] = item;
        }
        else{throw new IndexOutOfBoundsException();}
    }


    //Adding a new item in an arraylist by its index
    public void add (int index, Object item){
        if(index >= 0 && index <length) {
            array[index] = item;
        }
        else{throw new IndexOutOfBoundsException();}
    }


    //Adding more space for an arraylist
    public void IncreaseLength(){
        MAX_SIZE = MAX_SIZE * 2;
        Object[] array2 = new Object[MAX_SIZE];
        for (int i = 0; i < length; i++){
            array2[i] = array[i];
        }
        array = array2;
    }


    //Getting item by index
    public Object get(int index){
        if(index < length && index >= 0){
            return array[index];
        }
        throw new IndexOutOfBoundsException();
    }


    //Getting length of an arraylist
    public int size(){
        return length;
    }

    //Getting the first item of an arraylist
    public Object getFirst(){
        return array[0];
    }


    //Getting the last item of an arraylist
    public Object getLast(){
        return array[length - 1];
    }


    //Adding the last item to an arraylist
    public void addLast(Object item) {
        if (length == MAX_SIZE) {
            IncreaseLength();
        }
        array[length++] = item;
    }


    //Adding the first item to an arraylist
    public void addFirst(Object item){
        if (length == MAX_SIZE){
            IncreaseLength();
        }
        for (int i = length; i > 0; i--){
            array[i] = array[i - 1];
        }
        array[0] = item;
        length++;
    }

    //Clearing whole arraylist
    public void clear() {
        array = new Object[MAX_SIZE];
        length = 0;
    }


    //Sorting of an arraylist
    public void sort(){
        for(int i = 0; i < length; i++){
            for(int j = i; j < length - i - 1; j++){
                if (((Comparable)array[j]).compareTo(array [j + 1]) > 0){
                    Object temp = array[j];
                    array[j] = array[j + 1];
                    array [j + 1] = temp;
                }
            }
        }
    }


    //Finding index an item in arraylist
    public int indexOf(Object object){
        for(int i = 0; i < length; i++){
            if(array[i] == object){
                return i;
            }
        }
        return -1;
    }


    //Finding the last index of an item in arraylist
    public int lastIndexOf(Object object){
        for(int i = length - 1; i >= 0; i--){
            if(array[i] == object){
                return i;
            }
        }
        return -1;
    }


    //Finding out if an item exists in arraylist
    public boolean exists(Object object){
        for(int i = 0; i < length; i++){
            if(array[i] == object){
                return true;
            }
        }
        return false;
    }


    //Make array from an arraylist
    @Override
    public Object[] toArray() {
        Object[] narray = new Object[length];
        for(int i = 0; i < length; i++){
            narray[i] = array[i];
        }
        return narray;
    }


    //Removing an item from arraylist by its index
    public void remove(int index){
        if(index >= 0 && index <length) {
            for(int i = index; i < length; i++){
                array[i] = array[i + 1];
            }
            length--;
        }
        else{throw new IndexOutOfBoundsException();}
    }


    //Removing the first item from arraylist
    public void removeFirst(){
        for(int i = 0; i < length; i++){
            array[i] = array[i + 1];
        }
        length--;
    }


    //Removing the last item from arraylist
    public void removeLast(){
        length--;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
