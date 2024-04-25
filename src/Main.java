public class Main{
    public static void main(String[] args){
        MyArrayList<Object> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2.0);
        myArrayList.add("Agar");
        myArrayList.add("BRoNdAlE");
        myArrayList.add(16);
        myArrayList.delete(1);
        myArrayList.add_first(10);
        myArrayList.add_last(13);
        System.out.println(myArrayList.last_index_of()); // index will be 5, because i added 2 elements and deleted one
        System.out.println(myArrayList.index_of("Agar")); //deleted first element, then index will be 2
        System.out.println(myArrayList.get(3));
        System.out.println(myArrayList.get_first());
        System.out.println(myArrayList.get_last());
        System.out.println(myArrayList.array_size());
        myArrayList.delete_first();
        myArrayList.delete_last();
        myArrayList.show();
        System.out.println(myArrayList.is_exist("It is obviout that it will be false"));
        myArrayList.clear();
        myArrayList.show();
        System.out.println(myArrayList.array_size()); //deleted everythin in array
    }
}