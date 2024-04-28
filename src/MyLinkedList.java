/*
i created mylinkedlist with the same operations as demonstrated in myarraylist
here all data are stored as nodes with values, and there is no fixed size of list
 */
public class MyLinkedList<T> implements MyList<T>{
    private Node<T> head;
    private int size;
    public MyLinkedList(){
        size = 0;
        head = null;
    }
    public void show(){
        if(size == 0){
            System.out.println("There is nothing to show");
            return;
        }
        Node<T> C_node = head;
        int i = 0;
        while(C_node != null){
            System.out.println("Element under index " + i + " " + " is " + C_node.data);
            C_node = C_node.next;
            i++;
        }
    }
    @Override
    public void add(T data){
        Node<T> N_node = new Node<>(data);
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
        Node<T> N_node = new Node<>(data);
        if(head == null){
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
        size++;
    }
    public void delete(int index){
        check(index);
        Node<T> C_node = head;
        for(int i=0;i<index;i++){
            C_node = C_node.next;
        }
        C_node.next = C_node.next.next;
        size--;
    }
    public void delete_first(){
        if(head == null){
            return;
        }
        head = head.next;
        size--;
    }
    public void delete_last(){
        if(head == null){
            return;
        }
        if(head.next == null){
            head = null;
            size--;
            return;
        }
        Node<T> C_node = head;
        Node<T> N_node = null;
        while(C_node != null){
            N_node = C_node;
            C_node = C_node.next;
        }
        N_node = null;
        size--;
    }
    public T get(int index){
        check(index);
        Node<T> C_node = head;
        for(int i=0;i<index;i++){
            C_node = C_node.next;
        }
        return C_node.data;
    }
    public T get_first() {
        if (head == null) {
            return null;
        }
        return head.data;
    }
    public T get_last(){
        if(head == null){
            return null;
        }
        Node<T> C_node = head;
        while(C_node != null){
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
    public void check(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Штсщккусе штвуч");
        }
    }
    public int index_of(Object object){
        Node<T> C_node = head;
        int i = 0;
        while(C_node != null){
            if(C_node.data.equals(object)){
                return i;
            }
            C_node = C_node.next;
            i++;
        }
        return 0;
    }
    public int last_index_of(){
        if(head == null){
             return 0;
        }
        Node<T> C_node = head;
        int i = 0;
        int i2 = 0;
        while(C_node != null){
            if(C_node.next == null){
                i2 = i;
            }
            C_node = C_node.next;
            i++;
        }
        return i2;
    }
    public boolean is_exist(Object object){
        Node<T> C_node = head;
        while(C_node != null){
            if(C_node.data.equals(object)){
                return true;
            }
            C_node = C_node.next;
        }
        return false;
    }
    public void expand(){
        if(head == null){
            head = new Node<T>(head.data);
            size++;
            return;
        }
        Node<T> C_node = head;
        while(C_node != null){
            C_node = C_node.next;
        }
        C_node = new Node<>(head.data);
        size++;
    }
}
