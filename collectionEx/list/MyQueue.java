package collectionEx.list;

import java.util.ArrayList;

public class MyQueue<T> {
  private ArrayList<T> queue = new ArrayList<>();


  public void enqueue(T item) {
    queue.add(item);
  }

  public T dequeue() {
    if (queue.isEmpty()) {
      return null;
    }
    return queue.remove(0);
  }

  public boolean isEmpty() {
    return queue.isEmpty();
  }

  public void print() {
    System.out.println(queue);
  }

  public static void main(String[] args) {
    MyQueue<Integer> myQueue = new MyQueue<>();

    myQueue.enqueue(1);
    myQueue.enqueue(2);
    myQueue.enqueue(3);
    myQueue.enqueue(4);
    myQueue.enqueue(5);
    myQueue.print();

    System.out.println(myQueue.dequeue());
    System.out.println(myQueue.dequeue());
    System.out.println(myQueue.dequeue());
    System.out.println(myQueue.dequeue());
    System.out.println(myQueue.dequeue());
    System.out.println(myQueue.dequeue());
  }
}
