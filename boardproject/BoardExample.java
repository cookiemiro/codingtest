package boardproject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BoardExample {
  private final BoardIO boardIO = new BoardIO();

  public static void main(String[] args) {
    BoardExample boardExample = new BoardExample();

    boardExample.list();
  }

  public void list() {
    Scanner sc = new Scanner(System.in);
    System.out.println("[게시물 목록]");
    System.out.println("------------------------------------------------");
    System.out.printf("no %10s %12s %14s\n", "writer", "date", "title");
    System.out.println("------------------------------------------------");

    boardIO.boardList();

    System.out.println("------------------------------------------------");
    System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
    boolean isExited = false;
    while (!isExited) {
      System.out.print("메뉴 선택: ");
      int num = sc.nextInt();
      switch (num) {
        case 1 -> {
          System.out.println("*** create() 메서드 실행됨");
          System.out.println("[새 게시물 입력]");
          System.out.print("제목: ");
          String title = sc.next();
          System.out.print("내용: ");
          String content = sc.next();
          System.out.print("작성자: ");
          String writer = sc.next();

          Date date = new Date();
          SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
          String strNowDate = simpleDateFormat.format(date);

          Board board = new Board(title, content, writer, strNowDate);
          boardIO.insert(board);
        }
        case 2 -> {
          System.out.println("*** read() 메서드 실행됨");
        }
        case 3 -> {
          System.out.println("*** clear() 메서드 실행됨");
        }
        case 4 -> {
          System.out.println("프로그램 종료");
          isExited = true;
        }
      }
    }
    sc.close();
  }

  public void mainMenu() {

  }
}
