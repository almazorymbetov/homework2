/*
myqueue is implementation of myarraylist/linkedlist as queue data structure
 we insert element through enqueue, and remove through dequeue respectively
 */
public class MyQueue<T>{
    private MyArrayList<T> list;
    public MyQueue(){
        list = new MyArrayList<>();
    }
    public void enqueue(){
        return list.delete_first();
    }
    public void dequeue(){

    }
    public T peek(){
        return list.get_first();
    }
    public  boolean is_empty(){
        return list.array_size()==0;
    }
}
