public class Node <E>{
    private E element;
    private Node<E> next;
    public Node(){
        this(null);
    }
    public Node(E element) {
        this.element = element;
    }
}
