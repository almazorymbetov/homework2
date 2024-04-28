public class MyQueue<T>{
    private MyArrayList<T> list;
    public MyQueue(){
        list = new MyArrayList<>();
    }
    public void enqueue(){
        return list.delete_first();
    }
    public T peek(){
        return list.get_first();
    }
    public  boolean is_empty(){
        return list.array_size()==0;
    }
}
