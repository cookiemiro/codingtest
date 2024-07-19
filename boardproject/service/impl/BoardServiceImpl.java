package boardproject.service.impl;

import boardproject.lib.DBConnection;
import boardproject.service.BoardRepository;
import boardproject.vo.Board;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BoardServiceImpl extends DBConnection implements BoardRepository {
  Connection connection = null;

  @Override
  public void insert(Board board) {
    String query = "INSERT INTO boards (bno, btitle, bcontent, bwriter, bdate)" +
        " VALUES ('" + board.getBno() + "', '" + board.getBTitle() + "', '" + board.getBContent() + "', '" + board.getBWriter() + "', '" + board.getBDate() + "')";

    try {
      connection = open();
      Statement stmt = connection.createStatement();
      stmt.executeUpdate(query);

      System.out.println("정상적으로 저장되었습니다.");
      stmt.close();
      close();
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }

  }

  @Override
  public void boardList() {
    String query = "SELECT * FROM BOARDS";
    super.open();
    ResultSet rs = execute(query);

    try {
      while (rs.next()) {
        System.out.println(rs.getInt("bno") + "\t" + rs.getString("bwriter") + "\t" + rs.getDate("bdate") + "\t" + rs.getString("btitle"));
      }

      rs.close();
      super.close();
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    }
  }

  @Override
  public void update(int bno, String title, String content, String writer, String date) {
    connection = super.open();
    String query = "UPDATE boards SET btitle=?, bcontent=?, bwriter=?, bdate=? WHERE bno = ?";
    try {
      PreparedStatement pstm = connection.prepareStatement(query);
      pstm.setString(1, title);
      pstm.setString(2,content);
      pstm.setString(3, writer);
      pstm.setString(4, date);
      pstm.setInt(5, bno);

      int result = pstm.executeUpdate();
      if (result == 1) {
        System.out.printf("게시글 %d번이 수정 완료 되었습니다.\n", bno);
      } else {
        System.out.println("수정이 실패했습니다.");
      }
      pstm.close();
      super.close();
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    }
  }

  @Override
  public Board read(int bno) {
    String query = "SELECT * FROM boards WHERE bno = ?";

    try {
      connection = open();
      System.out.println(connection);
      PreparedStatement pstm = connection.prepareStatement(query);
      pstm.setInt(1, bno);

      ResultSet rs = pstm.executeQuery();
      System.out.println(rs);

//      rs를 가져와서 next를 해주지 않으면 값이 들어가지 않음.
      if (rs.next()) {
        int boardNo = rs.getInt("bno");
        System.out.println(boardNo);
        String title = rs.getString("btitle");
        String content = rs.getString("bcontent");
        String writer = rs.getString("bwriter");
        String date = rs.getString("bdate");

        Board board = new Board(boardNo, title, content, writer, date);
        rs.close();
        pstm.close();
        close();
        return board;
      } else {
        System.out.println("가져온 값이 없습니다.");
        return null;
      }
    } catch (SQLException e) {
      System.err.println(e.getMessage());
      return null;
    }
  }

  @Override
  public void delete(int bno) {
    connection = super.open();
    String query = "DELETE FROM boards WHERE bno = ?";

    try {
      PreparedStatement pstm = connection.prepareStatement(query);
      pstm.setInt(1, bno);
      int rows = pstm.executeUpdate();
      if (rows == 1) {
        System.out.printf("게시글 %d번이 삭제 완료 되었습니다.\n", bno);
      } else {
        System.out.println("삭제가 실패하였습니다.");
      }

      pstm.close();
      super.close();
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    }
  }

  @Override
  public void clear() {
    connection = super.open();
//    String query = "DELETE FROM boards";
    String query = "DELETE FROM boards";

    try {
      Statement statement = connection.createStatement();
      int result = statement.executeUpdate(query);
      System.out.println(result);
      if (result == 0) {
        System.out.println("모든 행이 삭제되었습니다.");
      } else {
        System.out.println("삭제되지 않았습니다.");
      }
      statement.close();
      super.close();
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    }
  }
}
