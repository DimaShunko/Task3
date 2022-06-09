public class LinkedList<E>{
    Node head;

    public class Node<T>{
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            next = null;
        }
    }

    LinkedList(){
        this.head = null;
    }

    public <T extends E> void add(T data){
        Node node = new Node(data);
        Node currentNode = head;
        if(currentNode == null){
            head = node;
        }else{
            while (currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }
    }

    public <T extends E> T get(int index) throws LinkedIndexOutOfBoundsException {
        Node currentNode = head;
        int i = 0;
        if(currentNode == null){
            System.out.println("Cписок пуст");
        }else{
            while (i != index && currentNode.next != null){
                currentNode = currentNode.next;
                i++;
            }
        }

        if(i==index){
            return (T) currentNode.data;
        }else {
            throw new LinkedIndexOutOfBoundsException("Выход за границу LinkedList");
        }
    }

    public void remove(int index) throws LinkedIndexOutOfBoundsException {
        Node currentNode = head;
        Node pred = null;
        int i = 0;
        while (i != index && currentNode.next != null){
            pred = currentNode;
            currentNode = currentNode.next;
            i++;
        }

        if(i == index) {
            if(currentNode == head){
                head = currentNode.next;
            }else{
                pred.next = currentNode.next;
            }
        }else{
            throw new LinkedIndexOutOfBoundsException("Выход за границу LinkedList");
        }
    }

    public void print(){
        Node currentNode = head;

        if(currentNode == null){
            System.out.println("Списко пуст");
        }else {
            System.out.println(currentNode.data);
            while (currentNode.next != null){
                currentNode = currentNode.next;
                System.out.println(currentNode.data);
            }
        }
    }

    public int size() {
        int i = 0;
        Node currentNode = head;
        while (currentNode.next != null) {
            i++;
            currentNode = currentNode.next;
        }
        i++;
        return i;
    }


}