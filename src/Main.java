import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        Object[] arr;


        list.add(10);
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(1, 2);
        list.sort();
        arr = list.toArray();
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

