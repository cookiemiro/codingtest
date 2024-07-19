package boardproject.service;

import boardproject.vo.Board;

public interface BoardRepository {
  void insert(Board board);
  void boardList();
  void update(int bno, String title, String content, String writer, String date);
  Board read(int bno);
  void delete(int bno);
  void clear();
}
