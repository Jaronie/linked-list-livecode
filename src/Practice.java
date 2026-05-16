public class Practice {
    public static void main(String[] args) {
        Node myNode = new Node('w', null);
        Node otherNode = new Node('x', null);
        Node coolNode = new Node('e', null);

        myNode.next = otherNode;
        otherNode.next = coolNode;

        int numNodes = length(myNode);
        System.out.println(numNodes);

        Node current = myNode;

        while(current != null){
            System.out.println(current.value);
            current = current.next;
        }

    }
    public static int length(Node head){
        int count = 0;

        Node current = head;

        while(current != null){
            count++;
            current = current.next;

        }

        return count;
    }
}
