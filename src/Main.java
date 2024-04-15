public class Main {
    public static void main(String[] args) {
        MyArrayList <Integer> arrayList = new MyArrayList();

        arrayList.add(12);
        arrayList.addFirst(19);
        arrayList.addLast(13);
        arrayList.addLast(12);


        for(int i = 0; i < arrayList.size(); i++){
            System.out.print(arrayList.get(i)); System.out.print(" ");
        }
        System.out.println();

        System.out.println(arrayList.size());
        System.out.println();System.out.println();

        arrayList.removeLast();

        for(int i = 0; i < arrayList.size(); i++){
            System.out.print(arrayList.get(i)); System.out.print(" ");
        }
        System.out.println();

        System.out.println(arrayList.size());

    }
}

