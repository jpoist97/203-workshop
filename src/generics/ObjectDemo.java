package generics;

import java.util.ArrayList;
import java.util.List;

public class ObjectDemo {
  public static void main(String[] args) {
    // Why can't I just do this?
    List<Object> objectList = new ArrayList<>();

    objectList.add(0);
    objectList.add(1);
    objectList.add(2);
    objectList.add(3);




    // Counter-example
//    objectList.add("String");
//    objectList.add(8);
//    objectList.add(new ArrayList<>());
//    objectList.add('c');
  }
}
