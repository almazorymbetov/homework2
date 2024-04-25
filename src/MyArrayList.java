public class MyArrayList<T> implements MyList<T>{
    private T[] array;
    private int size;
    public MyArrayList(){
        array = (T[]) new Object[5];
        size = 0;
    }
    public void add(T data){
        if(size==array.length){
            expand();
        }
        array[size++] = data;
    }
    public void add_first(T data){
        if(size==array.length){
            expand();
        }
        for(int i=size;i>0;i--){
            array[i] = array[i-1];
        }
        array[0 ] = data;
        size++;
    }
    public void add_last(T data){
        if (size == array.length) {
            expand();
        }
        array[size++] = data;
    }
    public void delete(int index){
        check(index);
        for(int i=index; i<size; i++){
            array[i] = array[i+1];
        }
        array[size-1] = null;
        size--;
    }
    public void show(){
        for(int i=0; i<size; i++){
            System.out.println((T)array[i]+" ");
        }
    }
    public void check(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Штсщккусе штвуч");
        }
    }
    public void expand(){
        T[] newArray = (T[]) new Object[2*array.length];
        System.arraycopy(array,0,newArray,0,size);
        array = newArray;
    }
}
