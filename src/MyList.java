public interface MyList<T>{
    void add(T data);
    void add_first(T data);
    void add_last(T data);
    void delete(int index);
    void delete_first();
    void delete_last();
    void sort();
    void show();
    T get(int index);
    T get_first();
    T get_last();
    void check(int index);
    void expand();
    int index_of(Object object);
    int last_index_of();
    boolean is_exist(Object object);
    int array_size();
    void clear();
}
