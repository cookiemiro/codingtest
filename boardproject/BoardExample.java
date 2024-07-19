package boardproject;

import boardproject.service.impl.BoardServiceImpl;
import boardproject.vo.Board;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BoardExample {
  private final BoardServiceImpl boardIO = new BoardServiceImpl();

  public static void main(String[] args) {
    BoardExample boardExample = new BoardExample();

    boardExample.list();
  }

  public void list() {
    Scanner sc = new Scanner(System.in);
    boolean isExited = false;
    while (!isExited) {
      System.out.println("[게시물 목록]");
      System.out.println("------------------------------------------------");
      System.out.printf("no %10s %12s %14s\n", "writer", "date", "title");
      System.out.println("------------------------------------------------");

      boardIO.boardList();

      System.out.println("------------------------------------------------");
      System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
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

          System.out.println("----------------------------------------------------");
          System.out.println("보조 메뉴: 1.OK  |  2.Cancel");
          System.out.print("메뉴 선택: ");
          int menu = sc.nextInt();
          switch (menu) {
            case 1 -> {
              Board board = new Board(title, content, writer, strNowDate);
              boardIO.insert(board);
            }
            case 2 -> {}
          }
        }
        case 2 -> {
          System.out.println("*** read() 메서드 실행됨");
          System.out.println("[게시물 읽기]");
          System.out.print("bno: ");
          int bno = sc.nextInt();
          System.out.println("################");
          
//          NPE를 위한 Optional 처리하기
          Board board = boardIO.read(bno);
          System.out.printf("번호: %d\n", board.getBno());
          System.out.printf("제목: %s\n", board.getBTitle());
          System.out.printf("내용: %s\n", board.getBContent());
          System.out.printf("작성자: %s\n", board.getBWriter());
          System.out.printf("날짜: %s\n", board.getBDate());
          System.out.println("################");

          System.out.println("보조 메뉴: 1.Update | 2.Delete | 3.List");
          System.out.print("메뉴 선택: ");
          int menu1 = sc.nextInt();
          switch (menu1) {
            case 1 -> {
              System.out.println("[수정 내용 입력]");
              System.out.print("제목: ");
              String title = sc.next();
              System.out.print("내용: ");
              String content = sc.next();
              System.out.print("작성자: ");
              String writer = sc.next();

              Date date = new Date();
              SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
              String strNowDate = simpleDateFormat.format(date);

              boardIO.update(bno, title, content, writer, strNowDate);
            }
            case 2 -> {
              boardIO.delete(bno);
            }
          }

        }
        case 3 -> {
          System.out.println("*** clear() 메서드 실행됨");
          boardIO.clear();
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
