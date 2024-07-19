package boardproject;

public interface BoardRepository {
  boolean insert(Board board);
  void boardList();
  boolean update(Board board);
  boolean create(Board board);
  boolean delete(int bno);
}
