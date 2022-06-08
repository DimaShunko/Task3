public class Main {
    public static void main(String[] args) {
        Object n;
        LinkedList list = new LinkedList();
        list.add(4);
        list.add(1);
        list.add(9);
        list.add(3);
        list.add(6);
        list.add(0);
        list.add(5);
        list.add(8);

        n = list.get(4);
        System.out.println(n);

        list.remove(9);

        list.print();
    }
}
