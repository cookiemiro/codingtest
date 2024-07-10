package collectionEx.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

  public static void main(String[] args) {
    Queue<Integer> queue_int = new LinkedList<>();

    Queue<String> queue_str = new LinkedList<>();

    queue_int.add(1);
    queue_int.offer(2);

    System.out.println(queue_int);
    System.out.println(queue_int.poll());
    System.out.println(queue_int);
    System.out.println(queue_int.remove(2));
    System.out.println(queue_int);


//    System.out.println(queue_str);
  }
}
