import static java.util.Collections.swap;
public class MyMinHeap<T>{
    private MyArrayList<Integer> heap;
    public MyMinHeap(){
        heap = new MyArrayList<>();
    }
    public void insert(int value){
        heap.add(value);
    }
    public boolean is_empty(){
        return heap.array_size()==0;
    }
}
