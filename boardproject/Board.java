package boardproject;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Board {
  private int bno;
  private String bTitle;
  private String bContent;
  private String bWriter;
  private String bDate;

  public Board(String bTitle,String bContent, String bWriter, String bDate) {
    this.bTitle = bTitle;
    this.bContent = bContent;
    this.bWriter = bWriter;
    this.bDate = bDate;
  }
}
