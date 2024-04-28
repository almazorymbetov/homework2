/*
first of all i created two classes: myarraylist and mylinkedlist, where i added operations such as
add, add first, add last, remove, remove first, remove last, get index (or last index),
get element(first, or last), check is exist element called "...",
clear list

and also i created mylist interface, which can be useful during switching from linked to array list
or reversively

then i tried to implement mystack, myqueue and myminheap, which represents data structures as stack,
queue and binary tree
 */
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
        /*
        // - - - //
        MyLinkedList<Object> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(2.0);
        myLinkedList.add("Agar");
        myLinkedList.add("BRoNdAlE");
        myLinkedList.add(16);
        myLinkedList.delete(1);
        myLinkedList.add_first(10);
        myLinkedList.add_last(13);
        System.out.println(myLinkedList.last_index_of()); // index will be 5, because i added 2 elements and deleted one
        System.out.println(myLinkedList.index_of("Agar")); //deleted first element, then index will be 2
        System.out.println(myLinkedList.get(3));
        System.out.println(myLinkedList.get_first());
        System.out.println(myLinkedList.get_last());
        System.out.println(myLinkedList.array_size());
        myLinkedList.delete_first();
        myLinkedList.delete_last();
        myLinkedList.show();
        System.out.println(myLinkedList.is_exist("It is obviout that it will be false"));
        myLinkedList.clear();
        myLinkedList.show();
        System.out.println(myLinkedList.array_size()); //deleted everythin in array
        */
    }
}