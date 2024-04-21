public class ArrayList<T> implements List<T>{
    private T[] array;
    private int size;
    public ArrayList(){
        array = (T[]) new Object[5];
        size = 0;
    }
    public void add(T data){
        if(size==array.length){
            expand();
        }
        array[size++] = data;
    }
    public void delete(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for(int i=index; i<size-1; i++){
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
    public void expand(){
        T[] newArray = (T[]) new Object[2*array.length];
        System.arraycopy(array,0,newArray,0,size);
        array = newArray;
    }
}
