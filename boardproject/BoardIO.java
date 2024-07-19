package boardproject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BoardIO extends DBConnection implements BoardRepository{
  Connection connection = null;

  @Override
  public boolean insert(Board board) {
    String query = "INSERT INTO boards (bno, btitle, bcontent, bwriter, bdate)" +
        " VALUES ('" + board.getBno() + "', '" + board.getBTitle() + "', '" + board.getBContent() + "', '" + board.getBWriter() + "', '" + board.getBDate() + "')";

    try {
      connection = open();
      Statement stmt = connection.createStatement();
      stmt.executeUpdate(query);

      System.out.println("정상적으로 저장되었습니다.");
      stmt.close();
      close();
      return true;
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }

    return false;
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
  public boolean update(Board board) {
    super.open();
    String query = "UPDATE boards SET (?, ?, ?, ?)";
    return false;
  }

  @Override
  public boolean create(Board board) {
    return false;
  }

  @Override
  public boolean delete(int bno) {
    return false;
  }
}
