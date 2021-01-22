package myPackage;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        MyLinkedList list = new MyLinkedList(10);

        list.addFirt(11);
        list.addFirt(12);
        list.addFirt(13);

        list.add(4, 9);
        list.add(4, 9);
        list.printList();
    }
}
