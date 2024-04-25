public class MyLinkedList<T> implements MyList<T>{
    private Node<T> head;
    private int size;
    public MyLinkedList(){
        size = 0;
        head = null;
    }
    @Override
    public void add(T data){
        Node N_node = new Node(data);
        if(head ==null){
            head = N_node;
        }else{
            Node<T> C_node = head;
            while(C_node.next != null){
                C_node = C_node.next;
            }
            C_node.next = N_node;
        }
        size++;
    }
    public void add_first(T data){
        Node N_node = new Node(data);
        if(head = null){
            head = N_node;
        }else{
            N_node.next = head;
            head = N_node;
        }
        size++;
    }
    public void add_last(T data){
        Node N_node = new Node(data);
        if(head == null){
            head = N_node;
        }else{
            Node<T> C_node = head;
            while(C_node.next != null){
                C_node.next = C_node.next.next;
            }
            C_node.next = N_node;
        }
    }
    public void remove(int index){
        check(index);
        Node<T> C_node = head;
        for(int i=0;i<size-1;i++){
            C_node = C_node.next;
        }
        C_node.next = C_node.next.next;
        size--;
    }

    public T get(int index){
        check(index);
        Node<T> C_node = head;
        for(int i=0;i<size-1;i++){
            C_node = C_node.next;
        }
        return C_node.data;
    }
    public void clear(){
        head = null;
        size = 0;
    }
    public int array_size(){
        return size;
    }
}
