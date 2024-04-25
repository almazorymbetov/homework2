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
    }
}