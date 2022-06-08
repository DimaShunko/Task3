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
        Node firstNode = head;
        if(firstNode == null){
            head = node;
        }else{
            while (firstNode.next != null){
                firstNode = firstNode.next;
            }
            firstNode.next = node;
        }
    }

    public Object get(int index){
        Node firstNode = head;
        if(firstNode == null){
            System.out.println("Cписок пуст");
        }else{
            int i = 0;
            while (i != index && firstNode.next != null){
                firstNode = firstNode.next;
                i++;
            }
        }
        return firstNode.data;
    }

    public void remove(Object data){
        Node firstNode = head;
        Node pred = null;
        while (firstNode.next != null){
            if(firstNode.data == data){
                if(firstNode == head){
                    head = firstNode.next;
                }else{
                    pred.next = firstNode.next;
                }
            }
            pred = firstNode;
            firstNode = firstNode.next;
        }
    }

    public void print(){
        Node firstNode = head;
        if(firstNode == null){
            System.out.println("Списко пуст");
        }else {
            System.out.println(firstNode.data);
            while (firstNode.next != null){
                firstNode = firstNode.next;
                System.out.println(firstNode.data);
            }
        }
    }


}
