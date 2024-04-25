public class Main{
    public static void main(String[] args){
        MyArrayList<Object> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2.0);
        myArrayList.add("Agar");
        myArrayList.add("BRoNdAlE");
        myArrayList.add(16);
        myArrayList.show();
        myArrayList.delete(5);
        myArrayList.delete(3);
        myArrayList.show();
        myArrayList.add_first(10);
        myArrayList.add_last(13);
        myArrayList.last_index_of();
        myArrayList.index_of("Agar");
        myArrayList.get(3);
        myArrayList.get_first();
        myArrayList.get_last();
        myArrayList.array_size();
        myArrayList.show();
        myArrayList.delete_first();
        myArrayList.delete_last();
        myArrayList.show();
        myArrayList.is_exist("Avto");
        myArrayList.clear();
        myArrayList.show();
        myArrayList.array_size();
    }
}