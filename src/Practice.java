public class Practice {
    public static void main(String[] args) {
        Node myNode = new Node('w', null);
        Node otherNode = new Node('x', null);
        Node coolNode = new Node('e', null);

        myNode.next = otherNode;
        otherNode.next = coolNode;

        int numNodes = myNode.length();
        System.out.println(numNodes);

        Node current = myNode;

        while(current != null){
            System.out.println(current.value);
            current = current.next;
        }

    }
}
