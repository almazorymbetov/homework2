public class Main{
    public static void main(String[] args){
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2.0);
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add(16);
        arrayList.show();
        arrayList.delete(5);
        arrayList.show();
    }
}