public class MyStack<T>{
    private MyArrayList<T> list;
    public MyStack(){
        list = new MyArrayList<>();
    }
    public void push(T data){
        list.add_last(data);
    }
    public T pop(){
        T data = list.get_last();
        return data;
    }
    public T peek(){
        return list.get_last();
    }
    public boolean is_empty(){
        return list.array_size() == 0;
    }
}
