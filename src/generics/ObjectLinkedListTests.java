package generics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ObjectLinkedListTests
{

  @Test
  public void testSizeEmpty() {
    ObjectLinkedList emptyList = new ObjectLinkedList();

    assertEquals(0, emptyList.size());
  }

  @Test
  public void testSizeFilled() {
    ObjectLinkedList list = new ObjectLinkedList();

    list.add(0);
    list.add(1);
    list.add(2);

    assertEquals(3, list.size());
  }

  @Test
  public void testGet() {
    ObjectLinkedList list = new ObjectLinkedList();

    list.add(0);
    list.add(1);
    list.add(2);

    assertEquals(0, list.get(0));
    assertEquals(1, list.get(1));
    assertEquals(2, list.get(2));
  }

  @Test
  public void testGetOutOfBounds() {
    ObjectLinkedList list = new ObjectLinkedList();

    assertThrows(IndexOutOfBoundsException.class, () -> {
      list.get(10);
    });
  }

  @Test
  public void testRemoveFirstElement() {
    ObjectLinkedList list = new ObjectLinkedList();

    list.add(0);

    assertEquals(0, list.remove(0));
    assertEquals(0, list.size());
  }

  @Test
  public void testRemove() {
    ObjectLinkedList list = new ObjectLinkedList();

    list.add(0);
    list.add(1);
    list.add(2);

    assertEquals(0, list.remove(0));
    assertEquals(2, list.remove(1));
    assertEquals(1, list.size());
  }

  @Test
  public void testRemoveEmpty() {
    ObjectLinkedList list = new ObjectLinkedList();

    assertThrows(IndexOutOfBoundsException.class, () -> {
      list.remove(10);
    });
  }

  @Test
  public void testRemoveOutOfBounds() {
    ObjectLinkedList list = new ObjectLinkedList();

    list.add(0);
    list.add(1);
    list.add(2);

    assertThrows(IndexOutOfBoundsException.class, () -> {
      list.remove(10);
    });
  }

}
