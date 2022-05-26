package generics;

public class ObjectLinkedList {
  private Node head;

  /**
   * Initializes a new empty LinkedList object.
   */
  public ObjectLinkedList() {
    this.head = null;
  }

  /**
   * Adds a new element to the end of this LinkedList.
   *
   * @param value value of the element to be added.
   */
  public void add(Object value) {
    if (head == null) {
      head = new Node(value, null);
    } else {
      Node previous = head;
      Node current = previous.next;

      // Advance pointer to end of list
      while (current != null) {
        previous = current;
        current = current.next;
      }

      // Once we've gotten to end of the list, add new element
      previous.next = new Node(value, null);
    }
  }

  /**
   * Returns the value of the element at the given index of this LinkedList.
   *
   * @param index index of element to return
   * @return value of element at index
   */
  public Object get(int index) {
    Node current = head;
    int count = 0;

    while (current != null && count < index) {
      current = current.next;
      count++;
    }

    if (current == null) {
      throw new IndexOutOfBoundsException("Index out of bounds: " + index);
    } else {
      return current.value;
    }
  }

  /**
   * Method that removes an element from this LinkedList at the given index
   * and returns the value it held.
   *
   * @param index index of element to remove.
   * @return value of the removed element.
   */
  public Object remove(int index) {
    if (head == null) {
      throw new IndexOutOfBoundsException("Index out of bounds: " + index);
    }

    if (index == 0) {
      Object value = head.value;
      head = head.next;
      return value;
    }

    Node previous = head;
    int count = 0;

    // Advance previous to one before the element we want to remove
    while (count < index - 1 && previous != null) {
      previous = previous.next;
      count++;
    }

    if (previous == null) {
      throw new IndexOutOfBoundsException("Index out of bounds: " + index);
    }

    Node toRemove = previous.next;
    Object value = toRemove.value;
    previous.next = toRemove.next;

    return value;
  }

  /**
   * Method which returns the size of this LinkedList.
   *
   * @return size of this LinkedList.
   */
  public int size() {
    Node current = head;
    int count = 0;

    while (current != null) {
      current = current.next;
      count++;
    }

    return count;
  }


  // Inner class.  Private data can be accessed by outer class
  // Data is public here so that it can be accessed by TestCases
  public static class Node {
    public final Object value;
    public Node next;

    public Node(Object value, Node next) {
      this.value = value;
      this.next = next;
    }
  }
}
