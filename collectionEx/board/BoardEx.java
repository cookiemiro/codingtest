package collectionEx.board;

import java.util.List;
import java.util.ArrayList;

public class BoardEx {

  public static void main(String[] args) {
    List<Board> boards = new ArrayList<>();

    boards.add(new Board("배고파요 점심시간이 다가와요1", "유태의", "가즈아~"));
    boards.add(new Board("배고파요 점심시간이 다가와요2", "유태의", "가즈아~"));
    boards.add(new Board("배고파요 점심시간이 다가와요3", "유태의", "가즈아~"));
    boards.add(new Board("배고파요 점심시간이 다가와요4", "유태의", "가즈아~"));
    boards.add(new Board("배고파요 점심시간이 다가와요5", "유태의", "가즈아~"));

    int size = boards.size();

    System.out.println(size);

    Board board = boards.get(2);
    System.out.println(board.getSubject() + "\t" + board.getWriter() + "\t" + board.getContent());

    System.out.println("======================================================");

    for (int i = 0; i < boards.size(); i++) {
      Board board1 = boards.get(i);
      System.out.println(board1.getSubject() + "\t" + board1.getWriter() + "\t" + board1.getContent());
    }

    System.out.println("======================================================");

    for (Board b : boards) {
      System.out.println(b.getSubject() + "\t" + b.getWriter() + "\t" + b.getContent());
    }

  }
}
