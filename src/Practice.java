public class Practice {
    public static void main(String[] args) {
        Node myNode = new Node('w', null);
        Node otherNode = new Node('x', null);
        Node coolNode = new Node('e', null);
        Node helloNode = new Node('f', null);
        myNode.next = otherNode;
        otherNode.next = coolNode;
        coolNode.next = helloNode;

        //int numNodes = myNode.length();
        //System.out.println(numNodes);

        Node newHead = removeAt(myNode, 2);

        Node current = myNode;

        while(current != null){
            System.out.println(current.value);
            current = current.next;
        }

    }

    // removes node at removeIdx
    // head is at index
    // example w->x->e->f
    // removeIdx 2
    // result w->x->f
    // Return the new head of the list
    public static Node removeAt(Node head, int removeIdx){
        if(removeIdx < 0){
            throw new IndexOutOfBoundsException("No sir can do. removeIdx must be greater/equal >= 0.");
        }

        if(removeIdx == 0){
            return head.next;
        }
        Node current = head;

        for(int i = 0; i < removeIdx - 1; i++){
            if(current == null){
                throw new IndexOutOfBoundsException("Index out of bounds. removeIdx must be less than length of list.");
            current = current.next;
        }
        current.next = current.next.next;

        return head;
    }
}
