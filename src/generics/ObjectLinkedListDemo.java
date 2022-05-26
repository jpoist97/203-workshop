package generics;

public class ObjectLinkedListDemo {
  public static void main(String[] args) {
    ObjectLinkedList list = new ObjectLinkedList();

    list.add(1);
    list.add("Two");
    list.add('c');
    list.add(new String[]{"One", "Two"});

//    This doesn't work because we are returning an Object
//    String strElement = list.get(1);
    Object strElement = list.get(1);

    Object arrayElement = list.get(3);
//    arrayElement[0];
  }
}
