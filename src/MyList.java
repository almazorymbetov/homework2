public interface MyList<T>{
    void add(T data);
    void delete(int index);
    void show();
    void check(int index);
    void expand();
}