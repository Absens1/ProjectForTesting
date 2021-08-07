package lesson2;

public class main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(null);
        myLinkedList.add(0);
        myLinkedList.add(1);
        System.out.println("Testing lesson2.MyLinkedList\n FirstItem=" + myLinkedList.getFirst() + " LastItem=" + myLinkedList.getLast());
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(null);
        myArrayList.add(0);
        myArrayList.add(1);
        System.out.println("Testing lesson2.MyArrayList\n FirstItem=" + myArrayList.get(0) + " LastItem=" + myArrayList.get(2));
    }
}
