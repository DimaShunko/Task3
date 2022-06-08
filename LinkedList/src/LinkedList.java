public class LinkedList {
    Node head;

    public class Node{
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
            next = null;
        }
    }

    LinkedList(){
        this.head = null;
    }

    public void add(Object data){
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

    public Object get(int index) throws LinkedIndexOutOfBoundsException {
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
            return currentNode.data;
        }else {
            throw new LinkedIndexOutOfBoundsException("Выход за границу LinkedList");
        }
    }

    public void remove(Object data){
        Node currentNode = head;
        Node pred = null;
        while (currentNode.next != null){
            if(currentNode.data == data){
                if(currentNode == head){
                    head = currentNode.next;
                }else{
                    pred.next = currentNode.next;
                }
            }
            pred = currentNode;
            currentNode = currentNode.next;
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


}
