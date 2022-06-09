public class Main {
    public static void main(String[] args) throws LinkedIndexOutOfBoundsException {
        int n;

        LinkedList<Integer> list = new LinkedList<>();
        list.add(4);
        list.add(3);
        list.add(9);
        list.add(3);
        list.add(6);
        list.add(6);
        list.add(7);
        list.add(8);
        try {
            n = list.get(4);
            //System.out.println(n);
        }catch (LinkedIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
            System.exit(0);
        }

        n = list.get(1);
        System.out.println(n);

        list.remove(3);

        list.print();
    }
}