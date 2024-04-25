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
        for(int i=index; i<size-1; i++){
            array[i] = array[i+1];
        }
        array[size-1] = null;
        size--;
    }
    public void delete_first(){
        for(int i=0;i<size-1;i++){
            array[i] = array[i+1];
        }
        array[size-1] = null;
        size--;
    }
    public void delete_last(){
        array[size-1] = null;
        size--;
    }
    public void show(){
        if(size==0){
            System.out.println("There is nothing to show");
        }
        for(int i=0; i<size; i++){
            System.out.println("Element under index " + i + " " + "is " + (T)array[i]);
        }
    }
    public void check(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Штсщккусе штвуч");
        }
    }
    public void expand(){
        T[] newArray = (T[]) new Object[array.length+1];
        System.arraycopy(array,0,newArray,0,size);
        array = newArray;
    }
    public void sort(){
        if(size<=1) {
            return;
        }
    }
    public void clear(){
        array = (T[]) new Object[5];
        size = 0;
    }
    public int array_size(){
        return size;
    }
    public T get(int index){
        check(index);
        return array[index];
    }
    public T get_first(){
        return array[0];
    }
    public T get_last(){
        return array[size-1];
    }
    public int index_of(Object object){
        for(int i=0;i<size;i++){
            if(array[i].equals(object)){
                return i;
            }
        }
        return 0;
    }
    public int last_index_of(){
        if(size==0){
            return 0;
        }else{
            return size-1;
        }

    }
    public boolean is_exist(Object object){
        for(int i=0;i<size;i++){
            if(array[i].equals(object)){
                return true;
            }
        }
        return false;
    }
}
