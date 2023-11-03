class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static <T> boolean linkedListFind(Node<T> head, T target) {
    boolean ans = false;

    // If linked list in one Node
    if (head.val.equals(target))
      ans = true;

    // Iterates while there is more than one Node
    while (head.next != null) {

      // Compares current value with target
      if (head.val.equals(target))
        ans = true;

      // Moves to the next Node in the LinkedList
      head = head.next;
    }

    // Returns true if found, otherwise false
    return ans;
  }

  public static void main(String[] args) {
    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");

    a.next = b;
    b.next = c;
    c.next = d;

    // a -> b -> c -> d

    System.out.println(Source.linkedListFind(a, "c"));
    System.out.println(Source.linkedListFind(a, "z"));

  }

}