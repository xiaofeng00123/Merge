package Merge;

class Node{
    int element;
    Node next;

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(){}
    public Node(int element){
        this.element=element;
    }
}
public class Merge {

    public static void main(String[] args){
        Node L1 = new Node(1);
        Node L2 = new Node(3);
        Node L3 = new Node(7);
        Node L4 = new Node(9);
        L1.setNext(L2);
        L2.setNext(L3);
        L3.setNext(L4);
        Node H1 = new Node(2);
        Node H2 = new Node(8);
        Node H3 = new Node(10);
        H1.setNext(H2);
        H2.setNext(H3);
        Node newNode = merge(L1,H1);
        while(newNode!=null){
            System.out.println(newNode.getElement());
            newNode=newNode.getNext();
        }

    }

    public static Node merge(Node head1, Node head2){
        if(head1==null)
            return head2;
        if(head2==null)
            return head1;
        if(head1.getElement()>=head2.getElement()){
            head2.setNext(merge(head1,head2.getNext()));
            return head2;
        }
        else{
            head1.setNext(merge(head1.getNext(),head2));
            return head1;
        }
    }

}
