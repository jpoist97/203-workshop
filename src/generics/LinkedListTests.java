package generics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LinkedListTests
{

  @Test
  public void testSizeEmpty() {
    LinkedList emptyList = new LinkedList();

    assertEquals(0, emptyList.size());
  }

  @Test
  public void testSizeFilled() {
    LinkedList list = new LinkedList();

    list.add(0);
    list.add(1);
    list.add(2);

    assertEquals(3, list.size());
  }

  @Test
  public void testGet() {
    LinkedList list = new LinkedList();

    list.add(0);
    list.add(1);
    list.add(2);

    assertEquals(0, list.get(0));
    assertEquals(1, list.get(1));
    assertEquals(2, list.get(2));
  }

  @Test
  public void testGetOutOfBounds() {
    LinkedList list = new LinkedList();

    assertThrows(IndexOutOfBoundsException.class, () -> {
      list.get(10);
    });
  }

  @Test
  public void testRemoveFirstElement() {
    LinkedList list = new LinkedList();

    list.add(0);

    assertEquals(0, list.remove(0));
    assertEquals(0, list.size());
  }

  @Test
  public void testRemove() {
    LinkedList list = new LinkedList();

    list.add(0);
    list.add(1);
    list.add(2);

    assertEquals(0, list.remove(0));
    assertEquals(2, list.remove(1));
    assertEquals(1, list.size());
  }

  @Test
  public void testRemoveEmpty() {
    LinkedList list = new LinkedList();

    assertThrows(IndexOutOfBoundsException.class, () -> {
      list.remove(10);
    });
  }

  @Test
  public void testRemoveOutOfBounds() {
    LinkedList list = new LinkedList();

    list.add(0);
    list.add(1);
    list.add(2);

    assertThrows(IndexOutOfBoundsException.class, () -> {
      list.remove(10);
    });
  }

}
