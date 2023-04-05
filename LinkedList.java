public class LinkedList {
    
    Node head;

    public void add(String Grocery){

        Node node = new Node();

        node.Grocery = Grocery;

        node.next = null;

        if(head == null){
            head = node;
        }

        else{

            Node other = head;

            while(other.next != null){

                other = other.next;
            }

            other.next = node;
        }
    }   

    public void print(){

        Node node = head;

        while(node.next != null){

            System.out.println(node.Grocery);
            node = node.next;
        }

            if(node.next == null){

                System.out.println(node.Grocery);
            }
    }
}
