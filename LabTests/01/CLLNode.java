public class CLLNode<T> {
    public T info;
    public CLLNode<T> next;
    public CLLNode() {
        this(null,null);
    }
    public CLLNode(T el) {
        this(el,null);
    }
    public CLLNode(T el, CLLNode<T> ptr) {
        info = el; next = ptr;
    }
}

